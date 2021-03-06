-- select 속성(찾고자 하는 값) from 메인테이블(메인테이블) join 서브테이블(메인테이블과 연관된 테이블) on 서브테이블 속성 = 메인테이블 속성(메인테이블 속성과 서브테이블 속성 맞추기) where 찾고자 하는 속성 = '속성이름';
-- apple 고객이 주문한 가격을 확인
select 주문번호, 주문고객, (수량 * 단가) as '가격' from 주문 join 제품 on 주문제품 = 제품번호 where 주문고객 = 'apple';
-- 그냥 만두가 판매된 갯수
select sum(수량) from 주문 join 제품 on 주문제품 = 제품번호 where 제품명 = '그냥만두';