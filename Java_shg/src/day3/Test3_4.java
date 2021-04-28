package day3;

import java.util.Scanner;

public class Test3_4 {

	public static void main(String[] args) {
		/* 두 정수와 산술연산자를 입력받아 계산 결과를 출력하는 예제를 switch문으로 작성하세요*/
		
		int num1;
		String str;
		String result;
		int num2;
		System.out.print("두 정수와 산술연산자를 입력하세요 : ");
		Scanner scan=new Scanner(System.in);
		
		num1=scan.nextInt();
		str=scan.next();
		num2=scan.nextInt();
		result=""+num1+" "+str+" "+num2+" "+" = ";
		
		switch(str) {
		case "+" :
			System.out.println(result + (num1+num2));
			break;
		case "-" :
			System.out.println(result + (num1-num2));
			break;
		case "*" :
			System.out.println(result + (num1*num2));
			break;
		case "%" :
			System.out.println(result + (num1%num2));
			break;
		case "/" :
			System.out.println(result + (double)num1/num2);
			break;
		default :
			System.out.println(str+"을(를) 잘못 입력하셨습니다");
		
			
			
			
		}
		
		scan.close();
	

	}

}
