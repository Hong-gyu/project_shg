/* 문제 1.	달콤 비스켓과 같은 제조업체에서 제조한 제품의 제품명과 단가를 검색 */
/* 방법 1.	달콤 비스켓의 제조업체를 검색한 후, 눈으로 확인하고 확인한 제조업체로 제품명, 단가를 검색*/
select 제조업체 from 제품 where 제품명 = '달콤비스켓';
select 제품명, 단가 from 제품 where 제조업체 = '한빛제과';
-- => 올바른 방법이 아님(개발자가 해당 작업을 하기 위해 매번 눈으로 확인하고 입력할 수 없기 때문)
/* 방법 2.	서브쿼리를 이용 */
select 제품명, 단가 from 제품 where 제조업체 = (select 제조업체 from 제품 where 제품명 = '달콤비스켓');
/* 문제 2.	banana 고객이 주문한 제품의 제품명과 제조업체를 검색 */
/* 방법 1. 	join 을 통한 해결 */
select 제품명, 제조업체, 주문고객 from 제품 join 주문 on 주문.주문제품=제품.제품번호 where 주문고객 = 'banana' ;
/* 방법 2. 	서브쿼리 이용 */
select 제품명, 제조업체 from 제품 where 제품번호 in (select 주문제품 from 주문 where 주문고객 = 'banana') ;
/* 문제 3.	banana 고객이 주문하지 않은 제품의 제품명과 제조업체를 검색 */
/* 방법 서브쿼리 이용 */
select 제품명, 제조업체 from 제품 where 제품번호 not in (select 주문제품 from 주문 where 주문고객 = 'banana') ;
/* 문제 4.	대한식품의 제조한 모든 제품의 단가보다 비싼 제품의 제품명, 단가, 제조업체를 검색*/
select 제품명, 단가, 제조업체 from 제품 where 제조업체 <> '대한식품' and 단가 >= 4500;
select 제품명, 단가, 제조업체 from 제품 where 단가 > all (select 단가 from 제품 where 제조업체 = '대한식품');
/* 문제 5. 	2013년 3월 15일에 제품을 주문한 고객이름을 검색 */
/* 방법 1. 	join을 통한 해결 */
select 고객이름 from 고객 join 주문 on 주문.주문고객=고객.고객아이디 where 주문일자 = '2013-03-15';
/* 방법 2. 	exists와 서브쿼리 사용 */
select 고객이름 from 고객 where exists (select * from 주문 where 주문일자 = '2013-03-15' and 주문고객 = 고객아이디);