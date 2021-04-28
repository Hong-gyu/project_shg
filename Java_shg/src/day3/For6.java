package day3;

import java.util.Scanner;

public class For6 {

	public static void main(String[] args) {
		/* 정수의 약수를 출력하는 코드를 작성하세요.
		 * 예시
		 * 정수를 입력하세요 : 6
		 * 1 2 3 6
		 * 
		 * 6 / 6 = 1
		 * 6 / 3 = 2
		 * 6 / 2 = 3
		 * 6 / 1 = 6
		 * 
		 * 
		 * 반복횟수 : i는 1부터 정수까지 num까지 1씩 증가
		 * 규칙성 : i가 num의 약수이면 i를 출력
		 *        -> 약수 : num%i==0
		 * 반복문 종료 후 : 없음 
		 * */

		int i;
		int num;
		
		Scanner scan=new Scanner(System.in);
		System.out.print("정수를 입력하세요 = ");
		num=scan.nextInt();
		for(i=1; i<=i; i+=1) {  // +=숫자 -> 숫자만큼 증가
			if(num%i==0) {
				System.out.print(i + " ");		
			}
		}
		System.out.println(" ");
		
		// 문제를 풀기가 어려우면 코드로 만들기 전에 절차를 나누어서 따진 후 한글로 작성할 것
		
		scan.close();
		
		

 
		
		
		

	}

}
