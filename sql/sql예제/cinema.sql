create database if not exists cinema;
use cinema;

CREATE TABLE if not exists `movie` (
	`mo_num`	int	NOT NULL,
	`mo_title`	varchar(50)	not NULL,
	`mo_contents`	longtext not NULL,
	`mo_director`	varchar(100)	not NULL,
	`mo_main_actor`	longtext	not NULL,
	`mo_sub_actor`	longtext	NULL,
	`mo_opening_date`	date	NULL,
	`mo_genre`	varchar(100)	not NULL,
	`mo_runtime`	int	not NULL,
	`mo_rateing`	int	not NULL,
    primary key(mo_num)
);

CREATE TABLE if not exists `screen` (
	`sc_num`	int	NOT NULL,
	`sc_mo_num`	int	NOT NULL,
	`sc_start_time`	char(5)	not NULL,
	`sc_end_time`	char(5)	not NULL,
	`sc_date`	date	not NULL,
	`sc_sr_num`	int	NOT NULL,
	`sc_type`	varchar(10)	not NULL default '2D',
    primary key (sc_num),
    foreign key (sc_mo_num) references movie (mo_num),
    foreign key (sc_sr_num) references screen_room (sr_num)
);

CREATE TABLE if not exists `theater` (
	`th_branch`	varchar(50)	NOT NULL,
	`th_address`	varchar(50)	NULL,
	`th_transport`	longtext	NULL,
    primary key (th_branch)
);

CREATE TABLE if not exists `screen_room` (
	`sr_num`	int	NOT NULL,
	`sr_th_branch`	varchar(50)	NOT NULL,
	`sr_name`	varchar(10) not NULL,
	`sr_personnel`	int	not NULL default 0,
	`sr_location`	varchar(50)	not NULL,
    primary key (sr_num)
);
ALTER TABLE `screen_room` ADD CONSTRAINT foreign key (sr_th_branch) references theater(th_branch);

CREATE TABLE if not exists `seat` (
	`se_num`	int	NOT NULL,
	`se_sr_num`	int	NOT NULL,
	`se_name`	char(3)	not NULL,
    primary key (se_num),
    foreign key (se_sr_num) references screen_room(sr_num)
);

CREATE TABLE if not exists `member` (
	`me_id`	varchar(20)	NOT NULL,
	`me_name`	varchar(50)	not NULL,
	`me_level`	varchar(10)	not NULL default 'bronze',
	`me_point`	int	not NULL default '0',
    primary key (me_id)
);

CREATE TABLE if not exists `reservation` (
	`re_num`	int	NOT NULL,
	`re_me_id`	varchar(20)	NOT NULL,
	`re_sc_num`	int	NOT NULL,
	`re_se_num`	int	NOT NULL,
	`re_pirce`	int	not NULL default 0,
	`re_ti_num`	int	NOT NULL,
    primary key (re_num),
    foreign key (re_me_id) references `member` (me_id),
    foreign key (re_sc_num) references screen (sc_num),
    foreign key (re_se_num) references seat (se_num),
    foreign key (re_ti_num) references ticket (ti_num)
);

CREATE TABLE if not exists `ticket` (
	`ti_num`	int	NOT NULL,
	`ti_personel`	int	not NULL default 1,
    primary key (ti_num)
);

-- insert into movie values (1, '컨저링 3-악마가 시켰다', '모든 것은 악마가 시켰다!', '마이클 차베즈', '베라 파미가', '패트릭 윌슨, 줄리안 일리아드', '2021-06-03', '호러, 미스터리, 스릴러', 112, 15);
select * from movie;
insert into theater values ('CGV청주성안길', '충청북도 청주시 상당구 북문로 1가 170-1',
 '버스 이용 시 (지하상가 정류장) 하차 \n
- 사직사거리 방향 \n
:30-2, 40-1, 50-2, 105, 105-1, 311,313-1,419, 712, 712-1, 715-1, 715,
716, 718, 719, 920, 720-1, 721, 722, 811-2, 831, 842-2, 843, 862-1, 863-2, 864
872-1, 872-2, 911, 911-1, 912, 913, 913-1, 916-1, 917, 918, 918-1, 919
-도청 방향 \n
:11-1, 30-1, 50-1, 311, 311-1, 313-1, 500, 502, 513, 513-1, 513-2, 515
611, 612, 613, 615, 616, 617, 717, 811, 811-1, 832, 842-1, 862-2, 863-1, 864
872-1, 872-2, 911, 911-1, 912, 916-2, 917, 918, 919');
select * from theater;
/* 영화 정보를 확인하는 쿼리문 - 컨저링 3 */
select * from movie where mo_title like concat('%','%컨저링 3','%');
select * from movie where mo_title like '%컨저링 3%';

/* 컨저링 3의 오늘(2021-06-03) 상영시간을 확인하는 쿼리문 */
select sc_start_time from screen join movie on mo_num=sc_mo_num where sc_date like '%2021-06-03%' and mo_title like '%컨저링 3%';

-- 컨저링 3의 cgv 청주 성안길 지점의 상영정보를 확인하는 쿼리문
-- 필요정보 : 영화제목 컨저링 3(movie 테이블), 영화관 cgv청주성안길(theater 테이블)
-- 확인정보 : 상영정보(screen 테이블)

select screen.* from screen
	join screen_room on sr_num = sc_sr_num
    join movie on mo_num = sc_mo_num
    where mo_title like '%컨저링 3%' and sr_th_branch like '%CGV청주성안길%';
select screen.* from screen
	where sc_mo_num = (select mo_num from movie where mo_title like '%컨저링 3%')
		and sc_sr_num = (select sr_num from screen_room where sr_th_branch like '%CGV청주성안길%');
        
-- cgv청주성안길 지점 1관의 예매 가능한 좌석 정보를 확인하는 쿼리문
-- 필요정보 : CGV청주성안길(theater 테이블), 1관(screen_room 테이블), 예매 가능한 좌석 정보
-- 확인정보 : 
select se_name from seat
	join screen_room on sr_num = se_sr_num
    where sr_name like '1관' and sr_th_branch like 'CGV청주성안길';
select se_name from seat
	where se_sr_num =
		(select sr_num from screen_room
			where sr_name like '1관' and sr_th_branch like 'CGV청주성안길');
-- CGV청주성안길 컨저링 3가 오늘 09:00에 있을 때 해당 영화의 선택 가능한 전체 좌석을 확인
-- 필요정보 : 해당 영화의 상영관 정보를 알아야 좌석 정보를 알 수 있음
-- 			해당 영화 예매 내역 중 예약된 좌석 현황
-- 			해당 영화의 예매 가능한 좌석 정보를 확인
-- 확인정보 : se_name
select se_name from seat
	where se_sr_num =
    (select sr_num from screen_room join screen on sc_sr_num = sr_num
    where sr_th_branch like 'CGV청주성안길' and
		  sc_date like '2021-06-03%' and
		  sc_start_time like '09:00' and
          sc_mo_num = (select mo_num from movie where mo_title like '%컨저링 3%'));
-- CGV청주성안길 지점에서 오늘 09:00에 시작하는 컨저링 3 영화의 상영관 번호를 확인하는 쿼리문
select sr_num from screen_room join screen on sc_sr_num = sr_num
    where sr_th_branch like 'CGV청주성안길' and
		  sc_date like '2021-06-03%' and
		  sc_start_time like '09:00' and
          sc_mo_num = (select mo_num from movie where mo_title like '%컨저링 3%');
-- 해당 영화 예매 내역 중 예약된 좌석 현황 : '예약된 좌석명'
select se_name from seat where se_num in
	(select re_se_num from reservation where re_sc_num = '상영시간번호' );
-- 해당 영화에서 (오늘 09:00 컨저링 3) 예약 가능한 좌석
-- 예약 가능한 좌석은 전체 좌석에서 예약된 좌석을 제외한(포함하지 않은) 좌석
select se_name from seat
	where se_sr_num = ('상영관 번호')
    and se_name not in ('예약된 좌석명');

-- abc123 회원이 관람했던 영화 리스트를 확인
select mo_title from movie
	where mo_num in (select sc_mo_num from screen
    join reservation on sc_num = re_sc_num
    where re_me_id = 'abc123' );