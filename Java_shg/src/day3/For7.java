package day3;

import java.util.Scanner;

public class For7 {

	public static void main(String[] args) {
		/* 두 정수의 최대 공약수를 구하는 코드를 작성하세요.
		 * 약수 : 나누어서 떨어지는 수
		 * 공약수 : 공통으로 있는 약수
		 * 6의 약수 1, 2, 3, 6
		 * 8의 약수 1, 2, 4, 8
		 * 12의 약수는 1, 2, 3, 4, 6, 12
		 * 최대 공약수 : 공약수 중 가장 큰 수
		 * 8과 12의 최대 공약수 는 4
		 * 
		 *  */
		
		/* 반복횟수 : (i는 1부터 num1 까지 1씩 증가) 두 정수의 약수를 구함
		 *  - 초기화
		 *  - 조건문
		 *  - 실행문
		 *  - 증감문
		 * 규칙성 : (i가 num1의 약수이고 i가 num2의 약수이면 i를 변수 gcd(새로운 변수) 에 저장)
		 * 반복문 종료 후 : 가장 큰 수 출력
		 *  */ 
		
		// 두 정수 각각의 공약수를 구함
		// 공약수 중 가장 큰 수를 출력
		
		int i;
		int num1;
		int num2;
		int gcd=1;
		System.out.print
		("두 정수를 입력하세요 : ");
		Scanner scan=new Scanner(System.in);
		num1=scan.nextInt();
		num2=scan.nextInt();
		for(i=1; i<=num1; i+=1) {
			if(num1%i==0 && num2%i==0) {  // 첫번째 정수가 i로 나누어 떨어지고, 두번째 정수도 i로 나누어 떨어지면
				gcd=i;			// 그 숫자들은 gcd 안에 있다
				// System.out.print(num1+" 과(와)"+" "+num2+" 의 최대 공약수는 "+i+" "); // 첫번째 정수와 두번째 정수의 최대 공약수는 i 이다
			}
		}
		System.out.println(num1+" 과(와)"+" "+num2+" 의 최대 공약수는 "+gcd+" ");	// gcd 안에 있는 숫자 중 가장 큰 숫자를 출력한다
		
	
		scan.close();
	}

}
