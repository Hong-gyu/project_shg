package day5;

import java.util.Scanner;

public class Test5_4_rewind {

	public static void main(String[] args) {
		/* 학생 3명의 성적을 입력받은 후 총점과 평균을 출력하는 코드
		 * */

		int i, sum=0;
		double avg;
		Scanner scan=new Scanner(System.in);
		int []arr=new int[3];
		for(i=0;i<arr.length;i+=1) {
			System.out.print("학생 성적을 입력하세요 : ");
			arr[i]=scan.nextInt();
			/* sum = 0 + arr[0]
			 * sum = 0 + arr[0] + arr[1]
			 * sum = 0 | arr[0] + arr[1] + arr[2] */
			sum=arr[i];
			avg=(double)sum/arr.length;
			System.out.println("총점은 "+sum+" 점 입니다.");
			System.out.println("평균은 "+avg+" 점 입니다."); // ??
			
		}
		
		scan.close();
		
		
	}

}
