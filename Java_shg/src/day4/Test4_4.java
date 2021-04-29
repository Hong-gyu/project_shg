package day4;

import java.util.Scanner;

public class Test4_4 {

	public static void main(String[] args) {
		/* 랜덤 숫자 출력하기 및 맞추기 */
		int min = 0, max = 100;
		/* Math.random():A
		 * 0 <= A < 1
		 * */
		
		int r = (int)(Math.random()*(max-min+1)+min); // Math.random()은 0보다 크거나 같고 1보다 작은 임의의 실수를 상징하는 기호
		System.out.println("생성된 숫자는 " + r + " 입니다.");
		
		/* 절수를 랜덤으로 생성하여 생성된 숫자를 맞추는 게임
		 * 예시 (랜덤하게 생성된 숫자가 25인 경우)
		 * 정수가 랜덤으로 생성되었습니다. 게임 시작!
		 * 정수를 입력하세요 : 100
		 * down
		 * 정수를 입력하세요 : 40
		 * down
		 * 정수를 입력하세요 : 10
		 * up
		 * 정수를 입력하세요 : 20
		 * up
		 * 정수를 입력하세요 : 25
		 * 정답입니다.
		 * */
		System.out.println("");
		System.out.println("정수가 랜덤으로 생성되었습니다. 게임 시작!");
		System.out.println("");
		int num;
		
		for(;;) {
			System.out.print("정수를 입력하세요("+min+" ~ "+max+") = ");
			Scanner scan=new Scanner(System.in);
			num=scan.nextInt();
			if(r<num) {
				System.out.println("");
				System.out.println("down");
				System.out.println("");
				} else if(r>num) {
					System.out.println("");
					System.out.println("up");
					System.out.println("");
				} else if(r==num) {
					System.out.println("");
					System.out.println("정답입니다.");
					break;
				}
			scan.close();
			}
		}
		
}

