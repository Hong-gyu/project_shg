package day2;

import java.util.Scanner;

public class Test2_7 {

	public static void main(String[] args) {
		// 평년 월의 마지막 일수를 출력하는 코드 작성
		// 1월 : 31일, 2월 : 28일, 3월 : 31일, ... 12월 : 31일
		// 31일 : 1, 3, 5, 7, 8, 10, 12
		// 30일 : 4, 6, 9, 11
		// 28일 : 2
		// 예시
		// 월을 입력하세요 : 2
		// 2월은 28일까지 있습니다.
		
		int num;
		System.out.print("월을 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		if(num==1 | num==3 | num==5 | num==7 | num==8 | num==10 | num==12) {
			System.out.println(num + "월은 31일까지 있습니다.");
		} else if(num==4 | num==6 | num==9 | num==11) {
				System.out.println(num + "월은 30일까지 있습니다."); 
				} else {
					System.out.println(num + "월은 28일까지 있습니다(평년기준, 윤달은 29일 입니다.)");
					
				}
		
		
		
		
		
		}
	}
