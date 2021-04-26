package day1;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		/* 콘솔 창에서 입력받아 변수에 저장하는 예제 */ // 복습할 것
		Scanner scan = new Scanner(System.in);		// 1. 콘솔에서 각종 데이터를 입력받기 위해서는 스캐너(Scanner)를 사용해야 한다 // 모든 입력은 위에서부터 아래로 실행됨
		
		System.out.print("정수를 입력하세요 : ");  // 2. 안내문구 출력
		int num = scan.nextInt();  // 정수를 입력받을때는 nextInt 코드값을 받음
		System.out.println("입력받은 값 : " + num);
		
		System.out.print("실수를 입력하세요 : ");
		double dnum = scan.nextDouble();
		System.out.println("입력받은 값 : " + dnum);

		System.out.print("문자를 입력하세요 : ");
		char ch = scan.next().charAt(1); // 문자는 nestchar 가 없음  scan.next()의 의미 : 문자열을 읽어옴  문자열.charAt(0)의 의미 : 해당 문자열 중 첫번째 글자를 읽어옴(두번째는 1, 세번째는 2, ...)
		System.out.println("입력받은 값 : " + ch);

		System.out.print("문자열를 입력하세요 : ");
		String str1 = scan.next(); // nextLine은 공백을 포함한 문자열을 가져옴
		System.out.println("입력받은 값 : " + str1);
		
		scan.close();

	}

}
