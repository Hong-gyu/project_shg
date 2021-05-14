package accountbook;

import java.util.Scanner;

public class AccountBook {

	public static void main(String[] args) {
		/* 가계부 프로그램 구현하려고 한다. 이 때 필요한 클래스를 만들어보세요.
		 * 클래스 : 설계도
		 * 구분(게시글 번호 처럼 배열로 해서 작성순서 저장) 
		 * 날짜(registerDate)
		 * 입출금분류(입금, 출금)(int or string)
		 * 입금분류(월급, 용돈, 이자, 기타수익, ...)(string)
		 * 입금액(int)
		 * 입금처(회사명, 사람이름, ... )(string)
		 * 입금내용(5월 월급, 금요일 점심값, 이자, ...)(string)
		 * 입금방법(현금, 계좌이체)(int or string)
		 * 출금분류(관리비, 통신비, 교통비, 보험, 식비, ... )(string)
		 * 출금액(int)
		 * 출금처(한국아파트, SK텔레콤, 한국택시, 한국보험, 김밥천국, ... )(string)
		 * 출금내용(5월 관리비 지출, 점심값 지출, ... )(string) 
		 * 출금방법(현금결제, 계좌이체, 카드결제)(int or string)
		 * */
	}
}

class AccountBook1 {
	// 멤버변수 선언
	private Item [] arr; // 가계부 내역들을 저장할 수 있는 배열
	private int count; // 저장된 내역들 갯수
	private int total; // 내역에 기입된 금액의 총 양


	// 생성자
	
		
	// 메소드 구현
	
	/* 기능 : 입력된 내역을 배열에 저장하는 메소드
	 * 매개변수 : 입력한 내역
	 * 리턴타입 : 없음 -> void
	 * 메소드명 : save */
	
	/* 입력한 내역 = */
	
	/* 기능 : 금액을 확인하는 메소드
	 * 매개변수 : 입금 합계, 출금 합계, 잔액 -> int inputSum, int outputSum, int balance
	 * 리턴타입 : 없음 -> void
	 * 메소드명 : moneyConfirm  */

	
	/* 기능
	 *  1. 가계부 입력 ( 입출금 분류 - 날짜 - 분류 - 금액 - 처 - 내용 - 방법 순으로 입력) - 프로그램 클래스
	 *  2. 가계부 수정 - 프로그램 클래스
	 *  3. 가계부 삭제 - 프로그램 클래스
	 *  4. 금액 확인 ( 총 입금액, 총 출금액, 잔액) - 가계부 클래스
	 *  5. 작성 내용 확인 ( 게시글 번호 조회 - 게시글 했던거 참조)
	 *  6. 작성 내용 상세 확인 ( 게시글 상세 조회 - 게시글 했던거 참조)
	 *  7. 프로그램 종료*/
	
	
	// getter, setter 생성
	public Item[] getArr() {
		return arr;
	}
	public void setArr(Item[] arr) {
		this.arr = arr;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}

}

