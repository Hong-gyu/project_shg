package accountbook;

import java.util.Scanner;

import board.Board;

public class AccountBookProgram {

	private static final Item[] Item = null;
	private Item [] arr; // 가계부 내역들을 저장할 수 있는 배열
	private int count; // 저장된 내역들 갯수
	private int total; // 내역에 기입된 금액의 총 양
	
	/* 기능 : 입/출금내역를 입력하는 메소드
	 * 매개변수 : 입/출금 구분, 날짜, 입/출금 분류, 입/출금 금액, 입/출금처, 입/출금내용, 입/출금방법 -> String type, int registerDate, 
	 * 리턴타입 : 없음 -> void
	 * 메소드명 : inout
	 * */
	
	public void inout () {
		System.out.println("입금인지? 출금인지? : ");
		Scanner scan=new Scanner(System.in);
		String type = scan.next(); 
		System.out.print("날짜 : ");
		String registerDate=scan.next();
		System.out.print("결제타입 :  : ");
		String paymentType=scan.next();
		System.out.print("분류 : ");
		String category=scan.next();
		System.out.print("금액 : ");
		int cost=scan.nextInt(); 
		System.out.print("내용 : ");
		String contents=scan.next();
		int num = count+1;
		Item tmpItem=new Item(type, registerDate, paymentType, category, cost, contents);
		Item [count] = tmpItem;
		count+=1;
		if(type == "입금") {
			// 입금 배열에 저장
		} else {
			// 출금 배열에 저장
		}
		

	}
	
	/* 기능 : 입력된 내역을 배열에 저장하는 메소드
	 * 매개변수 : 입력한 내역
	 * 리턴타입 : 없음 -> void
	 * 메소드명 : save */
	
	/* 기능 : 저장된 내용을 수정하는 메소드(여기 해야함)
	 * 매개변수 : 저장된 내용
	 * 리턴타입 : void
	 * 메소드명 : modify */
	
	/* 기능 : 저장된 내용을 삭제하는 메소드(여기 해야함)
	 * 매개변수 : 저장된 내용
	 * 리턴타입 : void
	 * 메소드명 : delete */
	
	/* 기능 : 금액을 확인하는 메소드
	 * 매개변수 : 입금 합계, 출금 합계, 잔액 -> int inputSum, int outputSum, int balance
	 * 리턴타입 : 없음 -> void
	 * 메소드명 : moneyConfirm
	 * */
	
	/* 기능 : 요약된 작성 내용을 확인하는 메소드(입/출금 구분, 날짜, 금액, 내용)
	 * 매개변수 : 멤버변수 그대로 사용
	 * 리턴타입 : 없음 -> void
	 * 메소드명 : summaryPrint
	 * */
	
	/* 기능 : 상세 작성 내용을 확인하는 메소드(입/출금 구분, 날짜, 금액, 입/출금처, 입/출금내용, 입출금방법)
	 * 매개변수 : 멤버변수 그대로 사용
	 * 리턴타입 : 없음 -> void
	 * 메소드명 : detailPrint
	 * */
	 */

}
