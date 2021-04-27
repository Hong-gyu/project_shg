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
	
		
		System.out.print("두 정수와 산술 연산자를 입력하시오 : ");
		Scanner scan = new Scanner(System.in);
		int num1=scan.nextInt();
		char ch=scan.next().charAt(0);	
		int num2=scan.nextInt();
		
		if(ch=='+') {
			System.out.print(""+ num1 + num2 +" =" + (num1+num2));
		} else if(ch=='-') {
			System.out.print(""+ num1 + num2 +" =" + (num1-num2)); // num1-num2 는 왜 오류되는지 + 값은 왜 안나오는지
		} else if(ch=='*') {
			System.out.print(""+ num1 * num2 +" =" + (num1*num2));
		} else if(ch=='/') {
			System.out.print(""+ num1 / num2 +" =" + (num1/num2));
		} else if(ch=='%') {
			System.out.print(""+ num1 % num2 +" =" + (num1%num2));
		}
			
	
		scan.close();
		
		}
		
	}

