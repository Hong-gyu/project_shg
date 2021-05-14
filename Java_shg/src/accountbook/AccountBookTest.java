package accountbook;

import java.util.Scanner;

public class AccountBookTest {

	public static void main(String[] args) {
		AccountBookProgram2 abp = new AccountBookProgram2();
		int menu = 0;
		int subMenu = 0;
		Scanner scan = new Scanner(System.in);
		do {
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
		} while(menu!=5);
	}
}
