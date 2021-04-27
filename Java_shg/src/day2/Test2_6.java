package day2;

import java.util.Scanner;

public class Test2_6 {

	public static void main(String[] args) {
		// 성적을 입력받아 입력받은 성적을 A, B, C, D, F 로 출력하는 코드 작성(A : 90이상 100이하, B : 80이상 90미만, C : 70이상 80미만, D : 60이상 70미만, F : 0이상 60미만, 잘못된 성적 : 0미만 100초과)

		int num;
		System.out.print("양의 성적을 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		String result =
				(num >=90 && num <= 100) ? "A" :
					(num >=80 && num < 90) ? "B" :
						(num >=70 && num <80) ? "C" :
							(num >=60 && num <70) ? "D" :
								(num >= 0 && num <60) ? "F" : "잘못된 성적";
		System.out.println(result);
		
		if(num >=90 && num <= 100) {
			System.out.println(num + "점은 A");
		} else if((num >=80 && num < 90)) {
			System.out.println(num + "점은 B");
		} else {
			if (num >=70 && num <80) {
				System.out.println(num + "점은 C");
			} else if(num >=60 && num <70) {
				System.out.println(num + "점은 D");
			} else {
				System.out.println(num + "점은 F"); {
					System.out.println("잘못된 성적");
				}
			}
		}
	}

}
