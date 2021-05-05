package day7;

import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		/* 사용자 번호를 랜덤으로 생성하고, 당첨 번호를 입력 하면 당첨
		 * 1등 : 당첨번호 6개 일치
		 * 2등 : 당첨번호 6개 일치 + 1
		 * 3등 : 당첨번호 5개 일치
		 * 4등 : 당첨번호 4개 일치
		 * 5등 : 당첨번호 3개 일치
		 * 꽝  : 당첨번호 2개 이하
		 * */
	
		int lotto[]=new int[6];
		int user[]=new int[6];
		
		for(int i=0; i<6; i+=1) {
			lotto[i]=(int)(Math.random()*45);	
			for(int j=0; j<i;j+=1) {
				if(lotto[j]==lotto[i]) {
					j+=1;
					break;
				}
			}
		}
		System.out.print("로또번호 : ");
		
		for(int i=0;i<6;i+=1) {
			System.out.print(lotto[i]+" ");
		}

		System.out.println("");
		System.out.print("번호를 입력하세요 : ");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
	}
	
	/* 기능 : 배열이 주어지고, 주어진 배열에서 0번지 부터 count개 까지 확인하여 정수 num가 있는지 없는지 확인하는 메소드(배열에 정수 num 가 있는지 중복체크 )
	 * 매개변수 : 배열([1,2,3,4,5]), 정수 num(7) => int [] arr, int num
	 *			갯수 => int count
	 * 리턴타입 : 있는지 없는지 => 참 또는 거짓 boolean
	 * 메소드명 : contains 
	 * */

	public static boolean contains(int []arr, int num, int count) {
		if(arr.length<count) { // 예외처리 : 배열의 크기보다 count가 큰 경우
			count=arr.length; // 비교할 갯수를 배열의 크기로 수정
		}
		for(int i=0;i<count;i+=1) {
			if(arr[i]==num) { // 배열의 값과 num의 값이 같은 경우(중복된 경우
				return true;
			}
		}
		return false;			
	}
	
	/* 기능 : 컴퓨터가 만든 배열과 사용자가 입력한 배열에서 같은 위치의 숫자를 비교하여 같은 숫자의 갯수를 알려주는 메소드
	 * 매개변수 : 배열 arr1, 배열 arr2 => int [] arr1, int [] arr2
	 * 리턴타입 : 같은 숫자의 갯수 => 정수 => int 
	 * 메소드명 : 같은숫자
	 * 설명 : [1, 2, 3], [3, 4, 5]가 있을때 0 strike
	 * 		 [1, 2, 3], [1, 9, 4]가 있을때 1 strike 
	 * */
	
	public static int 같은숫자 (int lotto[], int user[]) {
		int cnt = 0;
		for(int i=0; i<lotto.length;i+=1) {
			if(lotto[i]==user[i]) {
				cnt+=1;
			}
		}
		return cnt;
	}
	
	/* 기능 : 같은 수에 따라 결과를 출력하는 메소드 
	 * 매개변수 : 같은수 => int ball, int strike
	 * 리턴타입 : 출력은 없음 => void 
	 * 메소드명 : printResult
	 * */
	
	public static void printResult(int ball, int strike) {
		if(컴퓨터 배열=사용자 입력 배열 6개) {
			System.out.print("1등");
		}
		if(컴퓨터 배열=사용자 입력 배열 5개) {
			System.out.print("2등");
		}
		if(컴퓨터 배열=사용자 입력 배열 4개) {
			System.out.print("3등");
		}
		if(컴퓨터 배열=사용자 입력 배열 3개) {
			System.out.print("4등");
		}
		if(컴퓨터 배열=사용자 입력 배열 2개) {
			System.out.print("5등");
		}
		System.out.println();
	}
}
