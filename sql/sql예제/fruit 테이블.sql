/* 과일가계에서 과일 판매를 관리하려고 한다. 
이를 ERD로 작성한 후 DB와 테이블을 생성하세요.
DB명 : fruit_shop */
-- (조건) 해당 가게에서 판매될 모든 과일은 미리 등록되어있음
-- 과일 입고, 출고, 판매
-- 판매 내역, 구매 내역
-- 예시 :  사과 100개가 입고 되었다. 개당 단가는 1000원 데이터베이스에 저장 
-- create database fruit_shop;

-- (A) 과수원에서 사과 100상자가 입고되었습니다. 상자당 가격은 10,000원에 입고
-- 손님이 사과 1상자를 20,000원에 구매
-- 오늘 과일 판매액 확인
-- 총 매출액 확인
-- 트리거 -> 과일을 입고하거나 판매하면 재고량이 입고/판매량에 맞춰 변하는 트리거 생성
drop table fruit;
CREATE TABLE `fruit` (
	`fr_num`	int	NOT NULL,
	`fr_name`	varchar(20)	NULL,
	`fr_stock`	int	NULL,
	`fr_cost`	int	NULL,
	`fr_in_company`	varchar(20)	NULL,
	`in_num`	int	NOT NULL
);

CREATE TABLE `input` (
	`in_num`	int	NOT NULL,
	`in_name`	varchar(5)	NULL,
	`in_amount`	int	NULL,
	`in_company`	varchar(20)	NULL,
	`in_cost`	int	NULL
);

CREATE TABLE `order` (
	`or_num`	int	NOT NULL,
	`or_cu_num`	int	NOT NULL,
	`or_fr_num`	int	NOT NULL,
	`or_date`	datetime	NULL,
	`or_cu_address`	longtext	NULL,
	`or_amount`	int	NULL
);

CREATE TABLE `customer` (
	`cu_num`	int	NOT NULL,
	`cu_id`	varchar(10)	NULL,
	`cu_pw`	varchar(20)	NULL,
	`cu_res_num`	varchar(13)	NULL,
	`cu_address`	longtext	NULL,
	`cu_pnum`	int	NULL
);

ALTER TABLE `fruit` ADD CONSTRAINT `PK_FRUIT` PRIMARY KEY (
	`fr_num`
);

ALTER TABLE `input` ADD CONSTRAINT `PK_INPUT` PRIMARY KEY (
	`in_num`
);

ALTER TABLE `order` ADD CONSTRAINT `PK_ORDER` PRIMARY KEY (
	`or_num`
);

ALTER TABLE `customer` ADD CONSTRAINT `PK_CUSTOMER` PRIMARY KEY (
	`cu_num`
);

