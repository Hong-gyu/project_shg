package day4;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		/* 반복 횟수가 정해지지 않을때는 보통 break를 많이 씀
		 * */
		
		int i;
		for(i=1;i<=5;i+=1) {
				System.out.print("Hello ");
				// if문 없이 break가 나오면 반복문을 쓴 의미가 없어진다.
			}
		
		System.out.println(" ");
		for(i=1;i<=5;i+=1) {
			System.out.print(i+" ");
			// if문 없이 break가 나오면 반복문을 쓴 의미가 없어진다.
			}
		System.out.println(" ");
		
		for(i=1;;i+=1) {
			System.out.print(i+" ");
			if(i==5) { // ~까지만 출력한다 하면 그 숫자를 if 조건문에 넣으면 됨
				break;
				}
			}
		
		System.out.println(" ");
		
		char ch = 'a';
		Scanner scan=new Scanner(System.in);
				for(;;) {
			System.out.print("문자를 입력하세요(종료하려며 q/Q를 입력하세요) : ");
			ch=scan.next().charAt(0);
			if(ch=='q'||ch=='Q') {
				break;
					}
				}
		
		scan.close();
		}
	}
