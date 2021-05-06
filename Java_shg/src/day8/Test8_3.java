package day8;

import java.util.Scanner;

public class Test8_3 {

	public static void main(String[] args) {
		/* 4개의 성적을 입력받아 합격인지 불합격인지 판별하는 코드를 작성
		 * 합격기준
		 *  - 모든 성적이 과락이 없어야 함
		 *  - 평균 60점 이상
		 *  - 과락 : 성적이 40점 미만
		 *  
		 *  예시1(과락이 있는 경우)
		 *  성적 : 40, 30 , 100, 100
		 *  불합격입니다.
		 *  예시2(합격)
		 *  성적 : 60 40 100 100
		 *  합격입니다.
		 *  예시3(평균이 60미만)
		 *  성적 : 40, 50 40 60
		 *  불합격입니다.
		 * */ 
		
		System.out.print("성적 : ");
		Scanner scan1=new Scanner(System.in);
		int num1=scan1.nextInt();
		int num2=scan1.nextInt();
		int num3=scan1.nextInt();
		int num4=scan1.nextInt();
		
		int arg=num1+num2+num3+num4/4;
		boolean pass=num1>=40 && num2>=40 && num3>=40 && num4>=40; 
		if(pass==true && arg>=60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		scan1.close();
	
		

	}

}
