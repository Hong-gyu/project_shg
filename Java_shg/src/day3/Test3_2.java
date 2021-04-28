package day3;

import java.util.Scanner;

public class Test3_2 {

	public static void main(String[] args) {
		/* 정수를 입력받아 입력받은 정수가 0, 양수, 음수인지 판별하는 코드 작성*/
		
		int num;
		System.out.print("정수를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		num=scan.nextInt();
		
		if(num==0) {
			System.out.println("입력한 정수는 [ 0 ] 입니다.");
		} else if (num>0) {
			System.out.println("입력한 정수는 [ 양수 ] 입니다.");
		} else {
			System.out.println("입력한 정수는 [ 음수 ] 입니다.");}
		
		scan.close();
		
	}

}
