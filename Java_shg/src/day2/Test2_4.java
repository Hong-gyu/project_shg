package day2;
import java.util.Scanner;

public class Test2_4 {

	public static void main(String[] args) {
		// 입력받은 정수 num 가 3의 배수인지 아닌지 출력하는 코드 작성
		/* 예시
		 * 정수를 입력하세요 : 6
		 * 6은 3의 배수 입니다
		 * 예시
		 * 정수를 입력하세요 : 4
		 * 4는 3의 배수가 아닙니다*/
		
		
		int num;
		System.out.print("양의 정수를 입력하세요 = ");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
			if(num % 3 == 0) {
				System.out.println(num + "은(는) 3의 배수입니다");
			 	} else {
			 		System.out.println(num + "은(는) 3의 배수가 아닙니다");
			 		}
		

			scan.close();
	}

}
