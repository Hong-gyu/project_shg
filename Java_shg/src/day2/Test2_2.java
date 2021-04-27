package day2;

import java.util.Scanner;

public class Test2_2 {

	public static void main(String[] args) {
		// 두 정수를 입력 받아 입력받은 두 정수의 산술연산 결과를 출력하는 예제 
		
		// 예시
		// 두 정수를 입력하세요 : 1 2
		// 1 + 2 = 3
		// 1 - 2 = -1
		// 1 * 2 = 2
		// 1 / 2 = 0.5
		// 1 & 2 = 1
		        	
		int num1, num2; // 이부분을 int num1 = 1, num2 = 2로 씀)
		Scanner scan = new Scanner(System.in);
		System.out.print("두 정수를 입력하세요 = ");
		
		num1 = scan.nextInt(); // 이부분을 못했음
		num2 = scan.nextInt(); 
		
		System.out.println("1 + 2 = " + (num1 + num2));
		System.out.println("1 - 2 = " + (num1 - num2));
		System.out.println("1 * 2 = " + (num1 * num2));
		System.out.println("1 / 2 = " + ((double)num1 / (double)num2));
		System.out.println("1 & 2 = " + (num1 & num2));
		
		
		scan.close();
	}
}
