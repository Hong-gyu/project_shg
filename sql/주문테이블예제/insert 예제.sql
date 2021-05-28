-- insert 기본 문법
-- insert into 테이블명[ (속성명1, 속성명2, ... 속성명 n) ] 
-- values(값1, 값2, ... , 값n);

-- 테이블 명 여페 속성명들이 생략되면 values에서 값들을 순서대로 넣어주어야 함

-- student 테이블에 학생 정보 추가 
use portal;
-- desc student 



insert into student ( st_num, st_id, st_res_num, st_dep, st_name, st_pw )
values('2020160001', 'abc123', '010527-1234567', '컴퓨터공학과', '홍길동', 'abc123');
-- 위의 insert와 아래의 insert 중 속성 순서가 다른 경우
insert into student ( st_id, st_num, st_res_num, st_dep, st_name, st_pw )
values('abc124', '2020160002', '010528-1234567', '컴퓨터공학과', '이순신', 'abc124');

-- 테이블명 옆에 속성을 생략한 경우 (학번, 아이디, 주민번호, 학과, 이름, 비번 순으로 추가해야함 - 내가 정의한 순서)
insert into student
values('2020160003', 'abc125', '010529-1234567', '컴퓨터공학과', '유관순', 'abc125');

select * from studentclass;

-- 여러 행을 추가하는 경우
insert into student
values('2020160005', 'abc127', '010524-1234567', '컴퓨터공학과', '이성계', 'abc127')
, ('2020160006', 'abc128', '010525-1234567', '컴퓨터공학과', '정몽주', 'abc128')
, ('2020160007', 'abc129', '010526-1234567', '컴퓨터공학과', '장수왕', 'abc129');