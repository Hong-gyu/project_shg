package day5;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		/* 입력받은 문자가 q또는Q이면 종료하는 예제
		 * */
		
		char ch = 'a';
		Scanner scan=new Scanner(System.in);
				
		do {
			System.out.print("알파벳을 입력하세요(종료하려면 q또는Q를 입력하세요) : ");
			ch=scan.next().charAt(0);
		} while(ch!='q' && ch!='Q');
		
		
		scan.close();

	}

}
