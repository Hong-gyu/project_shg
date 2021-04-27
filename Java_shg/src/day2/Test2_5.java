package day2;

import java.util.Scanner;

public class Test2_5 {

	public static void main(String[] args) {
		// 정수를 입력받아 6의 배수이면 6의 배수라고 출력하고, 2의 배수이면 2의 배수라고 출력하고, 3의배수라면 3의배수라고 출력하고, 2,3,6의 배수가 아니면2,3,6의 배수가 아닙니다 라고 출력하는 코드 작성
		// 단, 6, 12와 같이 6의 배수인 경우는 6의 배수입니다 라고 하나만 출력되어야 함
		
		int num;
		System.out.print("양의 정수를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		if(num % 2 == 0 && num % 3 == 0) {
			System.out.println("6의 배수");
		} else if (num % 2 == 0) {
				System.out.println("2의 배수");
		} else {
					System.out.println((num % 3 == 0) ? "3의 배수" : "2,3,6의 배수가 아닙니다");
				}
			}
		
	} // 순서를 바꿔도 가능함(선생님은 순서 바꿔서 함 6의 배수, 2의배수 3의배수 순)

