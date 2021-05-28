/* select [ all | distinct ] 속성1, 속성2, ... 속성n from 테이블1
				[join 테이블2 on 테이블1.속성명 = 테이블2.속성명]
				[where 조건]
                [group by 속성명]
                [order by 속성명1 [asc|desc], 속성명2 [asc|desc]};
*/

-- 고객 명단 확인(고객 전체 정보)
-- select * from 고객;
-- 고객 명단에서 고객들의 등급을 확인
-- select 등급 from 고객; -- [all|distinct]를 생략하면 all이 기본값으로 적용
-- select 문에서 테이블명 앞에 데이터베이스명을 안쓰면 현재 선택된 데이터베이스에 따라 쿼리문이 실행되지 않을 수도 있다
-- select distinct 등급 from 고객; -- 중복 미허용
-- select 속성 from 테이블 where 조건;
-- 고객의 등급을 확인(고객아이디와 등급 확인)
-- select 고객아이디, 등급 from 고객;
-- 검색 결과의 속성 이름을 변경하는 키워드 as -> 해당 검색 결과에서만 바뀜
-- select 고객아이디 as '아이디' , 등급 from 고객; 
-- 아이디가 apple인 고객의 주문 내역 확인
-- select * from 주문 where 주문고객 = 'apple';
-- 제품명이 p01인 제품이 주문 내역 확인
-- select * from 주문 where 주문제품 = 'p01' ;
-- 제조업체가 한빛제과인 제품명을 확인
-- select 제품명 from 제품 where 제조업체 = '한빛제과';
-- 5개 이상 주문한 고객의 아이디를 확인
-- select distinct 주문고객 as '아이디' from 주문 where 수량 >=5;
-- 단가가 2000원 이상 3000원 이하인 제품명
-- select 제품명, 단가 from 제품 where 2000 <= 단가 and 단가 <= 3000;
-- 조건에서 속성 = '문자열' 로 확인하면 해당 문자열과 완전히 일치하는 것들을 검색함
-- select * from 고객 where 고객이름 like '오'; -- 이때 like 는 =(같다) 와 같은 역할
-- 고객 이름이 세글자인 고객의 리스트 확인
-- select * from 고객 where 고객이름 like '___';
-- 고객의 성이 김씨인 고객의 리스트 확인
-- select * from 고객 where 고객이름 like '김%';
-- 속성의 값이 null인지 아닌지를 확인할 때 is null 또는 is not null을 이용
-- 나이가 null이 아닌 고객의 이름을 확인
-- select 고객이름 from 고객 where 나이 is not null;
-- 정렬은 order by 속성명1 [ asc | desc ], 속성명2, [ asc | desc ], ... 로 정렬할 수 있음 order by 속성명 [ asc | desc ]
-- order by는 where과 별개
-- asc : 오름차순, 기본값 // desc : 내림차순
-- 고객을 고객 이름순으로 정렬
-- select * from 고객 order by 고객이름 desc;
-- 고객의 등급을 기준으로 정렬
-- select * from 고객 order by 등급 asc;
-- 고객의 등급을 기준으로 정렬한 후 이름순으로 정렬
-- select * from 고객 order by 등급 asc, 고객이름 asc;
-- 가입된 고객의 수
-- select count(고객아이디) from 고객;
-- 가입된 고객 중 최고령자의 나이
-- select max(나이) from 고객;
-- 가입된 고객 중 최연소자의 나이
-- select min(나이) from 고객;
-- 판매된 제품 수(총 판매 수량)
-- select sum(수량) as '판매량' from 주문;
-- 제품의 평균가격
-- select avg(단가) as '평균가격' from 제품;
-- 아이디가 apple 인 회원의 평균 주문 수량을 확인
-- select 주문고객, avg(수량) as '평균주문수량' from 주문 where 주문고객='apple';
-- group by는 where절 다음에 order by 앞에 있어야 함
-- 주문 제품별 총 판매 수량을 확인
-- select 주문제품, sum(수량) as '총 판매수량' from 주문 group by 주문제품;
-- 고객 별 총 주문수량
-- select 주문고객, sum(수량) as '총 주문수량(누적)' from 주문 group by 주문고객;
-- 제조업체 별 제품수와 제품들의 최고가, 최저가 확인
-- select 제조업체, count(*) as '제품수', max(단가) as '최고가', min(단가) as '최저가' from 제품 group by 제조업체;
-- having : 그룹에서 조건을 걸고 싶을 때 사용하는 절. 집계 함수를 이용할 수 있다
-- 제조업체의 제품수가 3개 이상인 제조업체
-- select 제조업체 from 제품 group by 제조업체 having count(제품명) >= 3 ;

