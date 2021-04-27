package day2;
import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {
		// 변수 num에 정수를 입력 받아 입력 받은 정수가 짝수이면 짝수라고 출력하는 코드
		
		int num;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요 = ");
		num=scan.nextInt();
		if(num % 2 == 0) {
			System.out.println("짝수");
		}
		if(num % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
				

	}

}
