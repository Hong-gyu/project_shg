package day2;

import java.util.Scanner;

public class Test2_3 {

	public static void main(String[] args) {
		// 국어 성적을 입력 받고 국어 과목을 패스 했는지 안했는지 확인하는 코드 작성(국어 성적이 60점 미만이면 Fail, 60점 이상이면 Pass)
		
		int korScore;
		System.out.print("국어 성적을 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println((num >= 60) ? "Pass" : "Fail");
		System.out.println("국어 과목을 패스 했습니까? " + (num >= 60));
		String result = (num >= 60) ? "Pass " : "Fail";
		System.out.println(num + "점은 " + result);
		System.out.println("국어 과목을 패스 했습니까? " + result);

		// 국어 성적이 A학점인지 아닌지 판별하는 코드 작성(A학점 : 90점 이상, 100점 이하)
		
		boolean result1 = (num >= 90 && num <= 100);
		System.out.println("국어 성적은 A학점입니까? " + result1);
				
		/* 조건선택연산자를 통해 국어 성적의 학점을 출력하는 코드 작성 */
		String result2 = num >= 90 && num <= 100 ? "A" : num >= 80 && num < 90 ? "B" : num >= 70 && num < 80 ? "C" : num >= 60 && num < 70 ? "D" : "F";
		System.out.print("국어 성적 : " + result2);
		
		
		
		
		scan.close(); // 자꾸 까먹음
	}

}
