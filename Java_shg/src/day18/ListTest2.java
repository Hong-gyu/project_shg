package day18;

import java.util.ArrayList;
import java.util.Scanner;

public class ListTest2 {

	public static void main(String[] args) {
		/* 오늘의 할일을 저장하는 리스트를 생성한 후 오늘의 할 일을 입력받고, 받은 후에 출력하는 코드 작성
		 * 오늘의 할일은 종료를 입력하면 종료하고 출력하면 됨
		 * 예시
		 * 오늘의 할일을 입력 : 출근
		 * 오늘의 할일을 입력 : 오전수업
		 * 오늘의 할일을 입력 : 점심
		 * 오늘의 할일을 입력 : 오후수업
		 * 오늘의 할일을 입력 : 퇴근
		 * 오늘의 할일을 입력 : 종료
		 * 오늘의 할일
		 * 1. 출근
		 * 2. 오전수업
		 * 3. 점심
		 * 4. 오후수업
		 * 5. 퇴근 */
		
		ArrayList <String> list = new ArrayList<String>();
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.print("오늘의 할일을 입력 : ");
			String str = scan.next();
			if(str.equals("종료")) {				break;			}
			list.add(str);
		}
		System.out.println("오늘의 할일");
		for(int j =0 ; j < list.size() ; j ++) {
			System.out.println(j+1+". "+list.get(j));
		}
		/* for(int i = 0 ; i < 10 ; i++) {
			System.out.print("오늘의 할일을 입력 : ");
			String str = scan.next();
			if(str != "종료") {				list.add(str);			}
			else {				break;			}
		}
		for(int j =0 ; j < 10 ; j ++) {
			System.out.println("오늘의 할일");
			System.out.println(""+(j+1)+". "+list);
		} */

		scan.close();
	}

}
