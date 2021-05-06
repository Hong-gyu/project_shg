package day8;

import java.util.Scanner;

public class Test8_1 {

	public static void main(String[] args) {
		/* 1~9사이의 정수를 입력받아 각 숫자가 몇번 입력됐는지 출력하는 코드 작성
		 * -1이 입력되면 입력 종료하고 각 숫자가 몇번 입력됐는지 출력
		 * 예시
		 * 입력 : 1
		 * 입력 : 1
		 * 입력 : 9
		 * 입력 : 3
		 * 입력 : 2
		 * 입력 : -1
		 * 1 : 2번
		 * 2 : 1번
		 * 3 : 1번
		 * 4 : 0번
		 * 5 : 0번
		 * 6 : 0번
		 * 7 : 0번
		 * 8 : 0번
		 * 9 : 1번
		 * */ 
		
		
		/* 1~9사이의 정수를 입력받아
		 * */


		// 반복문을 이용해서 정수를 입력받아 출력하는 코드
		
		int num;
		int [] arr = new int [10];
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.print("입력(1~9) : ");
			num=scan.nextInt();
			if(num<1 || num>9) {
				break;
			}
			arr[num]+=1;
		}
		
		for(int i=1; i<arr.length;i+=1) {
			System.out.println(i+" : "+arr[i]+"번");
		}
		scan.close();

		
		
		/* 각 숫자가 몇번 입력됐는지 확인
		 * */

		/* 출력
		 * */

		/* -1이 입력되면 입력 종료 
		 * */

		/* 숫자 중복 여부 확인 
		 * */
	}
	
}
