package day8;

import java.util.Scanner;

public class Test8_3_2 {

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

		// 성적 입력
		int [] score=new int[4]; // 이렇게 접근하는지 몰랐음
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<score.length;i+=1) {
			score[i]=scan.nextInt(); // 이부분을 이렇게 하는지 몰랐음
		}		
		scan.close();
		
		// 합격여부 결정
		int sum=0; 
		boolean pass = true;   // ture : 합격, false : 불합격 
		for(int tmp : score) { // 배열에 있는 값을 확인하는 것이라며 향상된 for문으로 활용
			sum+=tmp;
		}
		double avg = (double)sum/score.length;
		if(avg<60) {
			pass=false;
		}
		// 과락 여부 
		for(int tmp : score) {
			if(tmp < 40) {
				pass=false;
			}
		}
		
		if(pass=true) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		

	}

}
