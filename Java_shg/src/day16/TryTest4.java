package day16;

import java.util.Scanner;

public class TryTest4 {

	public static void main(String[] args) {
		/* 두 정수와 산술연산자를 입력받아 산술연산 결과를 출력하는 코드 작성
		 * */
		try {
			System.out.print("두 정수와 산술 연산자를 입력하세요(예 : 1 + 2) : ");
			Scanner scan=new Scanner(System.in);
			int num1 = scan.nextInt();
			char ch = scan.next().charAt(0);
			int num2 = scan.nextInt();
			if(ch == '+') {
				System.out.println(""+ num1 + ch + num2+" = "+(num1 + num2));
			} else if(ch == '-') {
				System.out.println(""+ num1 + ch + num2+" = "+(num1 - num2));
			} else if(ch == '*') {
				System.out.println(""+ num1 + ch + num2+" = "+(num1 * num2));	
			} else if(ch == '/') {
				System.out.println(""+ num1 + ch + num2+" = "+((double)num1 / (double)num2));			
			} else if(ch == '%') {
				System.out.println(""+ num1 + ch + num2+" = "+(num1 % num2));	
			} else {
				throw new Exception("잘못된 연산자입니다.");
			}
			scan.close();
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException 발생(0으로 나눌 수 없습니다)");
		} catch (RuntimeException e) {
			System.out.println("RuntimeException 발생(예외가 발생했습니다)");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("프로그램을 종료합니다.");			
		}
	}
}
