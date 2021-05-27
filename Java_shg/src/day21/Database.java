package day21;

public class Database {

	public static void main(String[] args) {
		/* 사용자 -> (데이터) -> 처리 -> (정보) -> 의사결정
		 *                    |
		 *                데이터베이스           
		 * */
		
		/* 데이터 : 값
		 * 정보 : 데이터(값)를(을) 처리하여 추출한 의미있는 값들
		 * 정보처리 : 값을 정보로 만들기 위한 수단 또는 과정
		 * 데이터베이스 : 값들의 집합 */
		
		/* 데이터 정의, 제어, 모델링
		 * 개념정의(코끼리 발은 4개, 몸무게는 1톤, 코로 손을 집음), 논리설정
		 * 속성(타원형, 고객아이디) - 개체(사각형, 고객) - 개체 인스턴스(실제값-고객과 관련된 정보)
		 *   - 단일속성(일반타원형으로 표기) : 고객이름, 고객주민번호
		 *   - 다중속성(이중타원형으로 표기) : 고객 연락처
		 *   - 단순속성(개체의 의미 분해 불가) : 가격, 책이름, 코드명 등 
		 *   - 복합속성(개채의 의미 분해 가능) : 주소, 생년월일
		 *   - 유도속성(값이 별도로 저장되지 않은 기존의 다른 속성의 값에서 유도되어 결정되는 속성) : 판매가격(책 개체의 가격과 할인율에 의해 유도됨) */
		    
		/*  개체 - 관계 - 개체 : 다이아(<>)로 표시. 개체와 개체 사이의 관계(1:1, 1:n, n:m)
		 *  	   |
		 *   	  구매(구매일자, 결제방식, ... ) */   
		   
		/*  키 : 릴레이션(테이블)에서 투플(인스턴스)들을 유일하게 구별하는 속성 또는 속성들의 집합
		 *   - 특징 : 유일성(유일하게 구분되어야 함), 최소성(최소한으로 구분되어야 함)
		 *   - 종류
		 *   	1. 슈퍼키(유일성 만족, 고객아이디, (고객아이디+고객이름), (고객이름+주소))
		 *   	2. 후보키(유일성과 최소성만족, 고객아이디, (고객이름+주소))
		 *   	3. 기본키(후보키 중에서 기본적으로 사용하기 위해 선택한 키, 밑줄로 표현, 고객아이디)
		 *   	4. 대체키(기본키로 선택되지 못한 키)
		 *   	5. 왜래키(다른 릴레이션의 기본키를 참조하는 속성, 고객아이디 - 주문고객)
		 *   
		 *   E-R 다이어그램(ERD) */

		/* 외래키의 식별관계 
		 * 	- 릴레이션의 기본키가 외래키로 구성된 경우(강의)
		 * 외래키의 비식별관계
		 * 	- 릴레이션의 기본키가 외래키가 아닌 경우(수강) 
		 * */
	}

}