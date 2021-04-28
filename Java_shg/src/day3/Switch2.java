package day3;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		/* 계절을 영어로 입력받아 입력받은 계절을 한글로 출력하는 예제
		 * 예시
		 * 계절을 영어로 입력하세요 : spring
		 * 봄입니다.*/

		String season;
		System.out.print("계절을 영어로 입력하세요(첫 문자는 대문자로 입력하세요) : ");
		Scanner scan=new Scanner(System.in);
		season=scan.next();
		
		switch(season) {
		case "Spring" :
			System.out.println("입력한 계절은 봄입니다.");
			break;
		case "Summer" :
			System.out.println("입력한 계절은 여름입니다.");
			break;
		case "Fall" :
			System.out.println("입력한 계절은 가을입니다.");
			break;
		case "Winter" :
			System.out.println("입력한 계절은 겨울입니다.");
			break;
		default :
			System.out.println("잘못 입력하셨습니다.");
		}
		
		scan.close();
		
	}

}
