package day1;

import java.util.Scanner;

public class Test1_3 {

	public static void main(String[] args) {
		// 두 정수와 문자를 입력 받아 출력하는 예제를 작성하세요
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 1을 입력하세요 : ");
		int num1 = scan.nextInt();
		System.out.print("문자를 입력하세요 : ");
		char ch = scan.next().charAt(0);
		System.out.print("정수 2를 입력하세요 : ");
		int num2 = scan.nextInt();
		System.out.println(""+ num1 + ch + num2);
		System.out.print("두 정수와 문자를 입력하세요(예 : 1 + 2) : ");
		num1 = scan.nextInt();
		ch = scan.next().charAt(0);
		num2 = scan.nextInt();
		System.out.println(""+ num1 + ch + num2);
	
		
		
		
		// 예시
		// 정수 1을 입력하세요 : 1
		// 문자를 입력하세요 : +
		// 정수 2를 입력하세요 : 2
		// 1+2
		// 예시 
		// 두 정수와 문자를 입력하세요 : 1 + 2 
		// 1 + 2

		
		scan.close();
		
	}

}
