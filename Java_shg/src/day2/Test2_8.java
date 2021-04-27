package day2;

import java.util.Scanner;

public class Test2_8 {

	public static void main(String[] args) {
		/* 두 정수와 산술 연산자를 입력받아 입력받은 연산자에 맞는 연산 결과를 출력하는 코드 작성 // 복습할것
		 * 예시 
		 * 두 정수와 연산자를 입력하세요 : 1 + 2
		 * 1 + 2 = 3
		 * 예시
		 * 두 정수와 연산자를 입력하세요 : 1 / 2
		 * 1 / 2 = 0.5
		 *  */
		
		
		/* 입력받은 연산자가 + 이면 +한 결과를 출력하고
		 * 입력받은 연산자가 - 이면 -한 결과를 출력하고
		 * 입력받은 연산자가 * 이면 *한 결과를 출력하고
		 * 입력받은 연산자가 / 이면 /한 결과를 출력하고
		 * 입력받은 연산자가 % 이면 %한 결과를 출력
		 * 
		 * */
	
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 1을 입력하세요 : ");
		int num1 = scan.nextInt();
		System.out.print("문자를 입력하세요 : ");
		char ch = scan.next().charAt(0);
		System.out.print("정수 2를 입력하세요 : ");
		int num2 = scan.nextInt();
		System.out.println(""+ num1 + ch + num2);
		System.out.print("두 정수와 산술 연산자를 입력하세요(예 : 1 + 2) : ");
	
		
		
		}
		
	}

