package accountbook;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountBookTest {

	public static void main(String[] args) {
		AccountBookProgram2 abp = new AccountBookProgram2();
		int menu = 0;
		int subMenu = 0;
		Scanner scan = new Scanner(System.in);
		do {
			try {
			abp.menuPrint();
			menu = scan.nextInt();
			switch(menu) {
			case 1 :			abp.insertItem();			break;
			case 2 : 			abp.update();				break;
			case 3 : 			abp.delete();				break;
			case 4 : 
				abp.printSubMenu();
				subMenu=scan.nextInt();
				switch(subMenu) {
				case 1 : 				abp.printItemListDetail();		break;
				case 2 : 				abp.printItemListSimple();		break;
				case 3 : 				abp.printItem();				break;
				case 4 : 				abp.total();					break;
				default :	 System.out.println("잘못된 메뉴입니다.");
				}
				break;
			case 5 :	abp.closeAccountBook();				break;
			default : 		System.out.println("잘못된 메뉴입니다.");
			}	
			}
			catch(InputMismatchException e) {
				System.out.println("예외 : 값을 잘못 입력했습니다.");
				scan.nextLine(); // 공백(스페이스) 를 포함한 문자열을 엔터까지 가져옴
				menu=0;
			} 
		} while(menu!=5);
	}
}
