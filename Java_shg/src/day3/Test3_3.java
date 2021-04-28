package day3;

import java.util.Scanner;

public class Test3_3 {

	public static void main(String[] args) {
		/* 정수가 2의 배수, 3의 배수, 6의 배수, 2,3,6의 배수가 아닌지 판별하는 예제
		 * 예제를 이중 if문을 이용하여 작성
		 * */ 
		
		int num;
		System.out.print("양의 정수를 입력하세요 : ");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		
		if(num%2==0) {
			if(num%3==0) {
				System.out.println("입력한 정수는 [6의 배수] 입니다.");
			} else if(num%3==0) {
				System.out.println("입력한 정수는 [3의 배수] 입니다.");
			} else if(num%2==0) {
				System.out.println("입력한 정수는 [2의 배수] 입니다.");					
			} else {
				System.out.println("입력한 정수는 [2,3,6의 배수]가 아닙니다.");
			}
		}
		
		
		
		scan.close();

	}

}
