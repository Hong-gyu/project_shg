package day4;

import java.util.Scanner;

public class For10 {

	public static void main(String[] args) {
		/* 반복 횟수가 정해져 있지 않는 예제
		 * 콘솔에서 q나 Q를 입력받을 때까지 반복하는 예제 
		 *  */ 
		
		/* for 문이 필요하고
		 * 스캐너도 필요한데 스캔할 문자는 char 
		 * 그 char는 Q 전까지*/
		
		Scanner scan=new Scanner(System.in);
		
		char ch = 'a';
		for(;ch != 'q' && ch !='Q';) {
			System.out.print("알파벳을 입력하세요(종료하려면 q/Q를 입력하세요) : ");
			ch=scan.next().charAt(0);
						
		}
		
		
		scan.close();

	}

}
