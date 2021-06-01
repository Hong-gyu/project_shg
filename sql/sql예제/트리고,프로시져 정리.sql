/* 트리거와 프로시저 : 사용을 안하는 것이 좋다고 한다. 
	프로시저 : 사용자가 만든 함수로 호출하여 사용
    트리거 : 데이터가 추가, 수정, 삭제가 일어나는 경우 미리 지정된 작업을 함 
		- 기본문법
        delimiter 기호
        create trigger 트리거명 트리거 이벤트 
        [before | after] [ insert | update | delete } on 테이블명
        for each row
        begin 코드작성;
        end 기호
        delimiter ;
        delimiter 기호 : 문장의 마지막을 알려주는 기호를 ; 대신 지정한 기호로 대체
        코드 작성 부분에서 ; 이 나왔을 때 실행되지 않도록 ; 을 무시하기 위해서 사용
        */
use portal;
/* 학생이 강의를 수강신청하면 해당 강의의 현재 정원이 1증가하는 트리거 */
drop trigger if exists insert_course;
delimiter //
create trigger insert_course after insert on course
for each row
begin
	update class
		set cl_now_count = cl_now_count +1
        where cl_code = new.co_cl_code;
end //
delimiter ;
-- 해당하는 데이터베이스의 트리거 확인
show triggers;

use example;
/* 주문 테이블에 주문 내역이 추가되면 제공 테이블의 재고량이 변하는 트리거를 작성 */
drop trigger if exists insert_order;
delimiter // 
create trigger insert_order after insert on `주문`
for each row
begin
	update `제품`
		set 재고량 = 재고량 - new.수량
        where 제품번호 = new.주문제품;
end //
delimiter ;
show triggers;

-- 트리거 실행문에서 조건문 사용해보기

drop trigger if exists test_order;
delimiter // 
create trigger test_order after insert on `주문`
for each row
begin
	/* if문 문법
    if 조건 then
		쿼리문;
    else if 조건 then
		쿼리문;
	else
		쿼리문
	end if; */
	/* 변수선언(begin 바로 밑에 변수들을 모아서 선언해야함)
		declare 변수명 타입 default 초기값;    */
	/* 변수 저장
		set 변수명 = 값; */
	declare _amount int default 0;
    declare _state varchar(10) default '';
    set _amount = 10;
    set _amount = (select count(*) from 주문) ;
    if _amount > 10 then set _state = '많다';
    elseif _amount > 5 then set _state = '적절';
    else set _state = '적음';
    end if;
end //
delimiter ;
/* 프로시져 drop procedure if exists 프로시저명 ;
delimiter 기호
create procedure 프로시저명 (
	{ in | out } 매개변수명1,
    { in | out } 매개변수명2, 	... 
)
begin 
	구현;
end 기호
delimiter ;	

*/ 
-- 프로시저 호출
drop procedure if exists addOrder; 
delimiter //
create procedure addOrder (
	in _id varchar(20),
    in _product char(3),
    in _amount  int,
    in _address varchar(30),
    in _date varchar(20)
)
begin 
	declare _count int default 0;
    declare _order_num char(3);
    set _count = (select count(*) from 주문) + 1;
    set _order_num = concat('o',_count);
    -- set _order_num = 'o13';
    insert into `주문`
		values (_order_num, _id, _product, _amount, _address, _date); 
	select * from `주문`;
end //
delimiter ;	
call addOrder('apple','p01',15,'충북 청주시','2021-06-01');