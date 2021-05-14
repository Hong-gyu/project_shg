package accountbook;

import java.util.Scanner;

public class AccountBookProgram2 {
	AccountBook2 book;
	Scanner scan=new Scanner(System.in);
	private int count;  // 현재 저장된 갯수 
	
	// 기능
	/* 메뉴출력 
	 * 내역수정
	 * 내역삭제
	 * 내역확인
	 * 내역상세확인
	 * 프로그램 종료*/
	 
	/* 기능 : (메뉴출력) 메뉴를 출력하는 메소드
	 * 매개변수 :  
	 * 리턴타입 : 없음 -> void
	 * 메소드명 : menuPrint
	 * */
	public void menuPrint() {
		System.out.println("------메뉴------");
		System.out.println("1.가계부 입력");
		System.out.println("2.가계부 수정");
		System.out.println("3.가계부 삭제");
		System.out.println("4.가계부 확인");
		System.out.println("5.프로그램 종료");
		System.out.println("---------------");
		System.out.print("메뉴를 선택하세요 : ");
	}
	
	/* 기능 : (서브메뉴출력) 메뉴를 출력하는 메소드
	 * 매개변수 :  
	 * 리턴타입 : 없음 -> void
	 * 메소드명 : printSubMenu
	 * */
	public void printSubMenu() {
		System.out.println("------확인------");
		System.out.println("1. 전체 내역 상세");
		System.out.println("2. 전체 내역 요약");
		System.out.println("3. 선택 내역 상세");
		System.out.println("4. 내역 합계");
		System.out.println("---------------");
		System.out.print("메뉴를 선택하세요 : ");
	}
	
	/* 기능 : (내용생성) 입/출금내역를 저장하는 메소드
	 * 매개변수 : 아이템 내역 그대로 사용 
	 * 리턴타입 : 없음 -> void
	 * 메소드명 : insertItem
	 * */
	public void insertItem () {
		System.out.println("가계부 내역을 입력하세요.");
		Item item = createItem();
		book.insert(item);
	}

	/* 수정할 내역의 번호와 내역정보를 입력받아 내용을 수정하는 메소드
	 * 매개변수 : 수정할 내역 번호
	 * 리턴타입 : 
	 * 메소드명 : update */
	public void update () {
		System.out.print("수정할 가계부 내역 번호를 입력하세요 : ");
		int index=scan.nextInt();
		if(index < 1 || index > book.getCount()) {
			System.out.println("수정할 내역이 없습니다.");
			return ;
		}
		System.out.print("수정할 내역을 입력하세요 : ");
		Item item = createItem();
		book.update(index-1, item);
		System.out.print("수정이 완료되었습니다. ");
	}
	
	/* 내역정보를 입력받아 내역을 생성하여 알려주는 메소드
	 * 매개변수 : 필요없음(입력받을것이기때문)
	 * 리턴타입 : 생성된 내역(Item)
	 * 메소드명 : createItem
	 */
	private Item createItem () {
		System.out.print("구분(입/출금) : ");
		String type = scan.next(); 
		System.out.print("날짜 : ");
		String date=scan.next();
		System.out.print("결제타입(현금/계좌/카드) : ");
		String paymentType=scan.next();
		System.out.print("분류 : ");
		String category=scan.next();
		System.out.print("금액 : ");
		int cost=scan.nextInt(); 
		System.out.print("내용 : ");
		String contents=scan.next();
		Item item=new Item(type, date, paymentType, category, cost, contents);
		return item;
	}
	
	/* 삭제할 내역의 번호와 내역정보를 입력받아 내용을 삭제하는 메소드
	 * 매개변수 : 삭제할 번호
	 * 리턴타입 : 없음->void
	 * 메소드명 : delete */
	public void delete() {
		System.out.println("삭제할 가계부 내역 번호를 입력하세요 : ");
		int index=scan.nextInt();
		if(index < 1 || index > book.getCount()) {
			System.out.println("삭제할 내역이 없습니다.");
			return ;
		}
		book.delete(index-1);
	}
	
	/* 내역 전체를 상세히 출력하는 기능
	 * 매개변수 : 멤버변수 사용
	 * 리턴타입 : void
	 * 메소드명 : printDetail */
	public void printItemListDetail() {
		book.printItemListDetail();
	}
	
	/* 내역 전체를 간략히 출력하는 기능
	 * 매개변수 : 
	 * 리턴타입 : 
	 * 메소드명 : */
	public void printItemListSimple() {
		book.printItemListSimple();
	}
	
	/* 확인할 내역 번호를 입력받아 내역을 상세히 출력하는 메소드
	 * 매개변수 : 
	 * 리턴타입 : 
	 * 메소드명 : */
	public void printItem () {
		System.out.print("확인할 내역의 번호를 입력하세요 : ");
		int index = scan.nextInt();
		if(index < 1 || index > book.getCount()) {
			System.out.println("확인할 내역이 없습니다.");
			return ;
		}
		book.printItem(index-1);
	}
	
	/* 가계부 금액을 출력하는 메소드
	 * 매개변수 : 
	 * 리턴타입 : 
	 * 메소드명 : */
	public void total () {
		System.out.println("내역 합계 : "+book.getTotal()+" 원");
	}
	
	/* 기능 :(프로그램 종료) 프로그램 종료
	 * 매개변수 :  
	 * 리턴타입 : 없음 -> void
	 * 메소드명 : closeAccountBook
	 * */
	public void closeAccountBook () {
		System.out.println("프로그램을 종료합니다.");
		scan.close();	
	}
	
	public AccountBookProgram2 () {
		book = new AccountBook2();
	}
	public AccountBookProgram2 (int max) {
		book = new AccountBook2(max);
	}
}
