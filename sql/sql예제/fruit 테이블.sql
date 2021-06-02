/* 과일가계에서 과일 판매를 관리하려고 한다. 
이를 ERD로 작성한 후 DB와 테이블을 생성하세요.
DB명 : fruit_shop */
-- (조건) 해당 가게에서 판매될 모든 과일은 미리 등록되어있음
-- 과일 입고, 출고, 판매
-- 판매 내역, 구매 내역
-- 예시 :  사과 100개가 입고 되었다. 개당 단가는 1000원 데이터베이스에 저장 
create database if not exists fruit_shop;

CREATE TABLE if not exists `fruit` (
	`fr_name`	varchar(15)	NOT NULL,
	`fr_price`	int	not NULL default 0,
	`fr_unit`	varchar(10)	not NULL default 'box',
	`fr_amount`	int	not NULL default 0,
    primary key(fr_name)
);
CREATE TABLE if not exists `trade` (
	`tr_num`	int	NOT NULL,
	`tr_amount`	int	not NULL default 0,
	`tr_type`	varchar(4)	not NULL default 'sell',
	`tr_price`	int	not NULL default 0,
	`tr_date`	datetime not NULL default current_timestamp,
	`tr_fr_name`	varchar(15)	NOT NULL,
    primary key(tr_num),
    foreign key (tr_fr_name) references fruit(fr_name)
);
-- 사과가 입고되기 위해서 fruit 테이블에 사과 정보가 등록되어 있어야 함
-- insert into fruit values ('사과',10000,'box',0);
-- select * from fruit;

-- (A) 과수원에서 사과 100상자가 입고되었습니다. 상자당 가격은 10,000원에 입고 -> trade 테이블에 insert
-- insert into trade (tr_num, tr_amount, tr_type, tr_price, tr_fr_name)
-- 	values(1,100,'buy',1000000,'사과');
-- select * from trade;
-- update fruit set fr_amount = fr_amount + 100 where fr_name = '사과';
-- select * from fruit;

-- 손님이 사과 1상자를 20,000원에 구매 -> trade 테이블에 insert, fruit 테이블에 update
-- insert into trade (tr_num, tr_amount, tr_type, tr_price, tr_fr_name)
-- values(2,1,'sell',20000,'사과');
-- select * from trade;
-- update fruit set fr_amount = fr_amount - 1 where fr_name = '사과';
select * from fruit;

-- 오늘 과일 판매액 확인
select sum(tr_price) as '판매액' from trade where tr_type = 'sell' and tr_date like '2021-06-02%' ;

-- 총 매출액 확인 -> 
/* case when 사용법 
 - 기본문법
	 case when 조건1 then 반환값
     when 조건2 then 반환값
     else 반환값 end as '표현 속성명' */
select sum(case when tr_type = 'buy' then -tr_price
		else tr_price end) as '총매출액' from trade;

-- 트리거 -> 과일을 입고하거나 판매하면 재고량이 입고/판매량에 맞춰 변하는 트리거 생성
/* 트리거 기본문법
drop trigger 트리거명;
delimiter //
create trigger 트리거명 전/후 이벤트 on 테이블명;
for each row
begin
실행;
end //
delimiter ; */
drop trigger if exists insert_trade;
delimiter //
create trigger insert_trade after insert on trade
for each row
begin
	if new.tr_type = 'buy' then
		update fruit set fr_amount = fr_amount + new.tr_amount where fr_name = new.tr_fr_name ;
    else 
		update fruit set fr_amount = fr_amount - new.tr_amount where fr_name = new.tr_fr_name ;
    end if;
end //
delimiter ;
/* 
insert into trade (tr_num, tr_amount, tr_type, tr_price, tr_fr_name)
	values(3,10,'sell',20000,'사과');
select * from fruit; */ 

-- 프로시저 -> 입고될 때 없는 과일이 입고 되는 경우 fruit 테이블에 새로운 과일을 추가하는 테이블
/* 프로시저 기본문법
drop procedure if exists 프로시저명; 
delimiter //
create procedure 프로시저명 (
	in/out 변수명 타입
) 
begin 
	declare 변수명 타입 default 0; -- 변수선언
    set _count = (select count(*) from 주문) + 1;
    set _order_num = concat('o',_count);
    -- set _order_num = 'o13';
    insert into `주문`
		values (_order_num, _id, _product, _amount, _address, _date); 
	select * from `주문`;
end //
delimiter ;	 */


drop procedure if exists insert_buy; 
delimiter //
create procedure insert_buy (
	in _name varchar(15),
    in _amount int,
    in _price int,
    in _sell_price int
) 
begin 
	declare _count int default 0; -- 구매하려는 과일이 있는지 없는지 확인
    declare _num int;
    set _count = (select count(*) from fruit where fr_name = _name); -- 해당 과일이 없으면 fruit 테이블에 없는 과일(포도)을 추가(이때, 판매가격을 설정해야 함)
	if _count = 0 then -- 해당 과일이 있으면
		insert into fruit(fr_name, fr_price)
			values (_name, _sell_price); -- trade 테이블에 해당 과일을 구매내역에 추가
	end if;
    set _num = (select max(tr_num) from trade) + 1;
    select _num, _amount, 'buy', _price, _name;
    insert into trade (tr_num, tr_amount, tr_type, tr_price, tr_fr_name)
	values(_num, _amount, 'buy', _price, _name);
end //
delimiter ;
call insert_buy('포도', '100', 500000, 10000);
select * from fruit;