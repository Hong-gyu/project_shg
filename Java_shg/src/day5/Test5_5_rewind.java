package day5;

import java.util.Scanner;

public class Test5_5_rewind {

	public static void main(String[] args) {
		/* 1부터 10사이의 랜덤한 수 6개를 생성하여 배열에 저장한 후 출력하는 코드
		 * 단 생성된 랜덤한 수는 중복될 수 있음 */
		
		// min < i < max
		
		int min=1, max=10;  // 1부터 10사이, 합 초기값 0
		int i, r;
		int [] arr=new int[6]; // 6개 수 배열
		for(i=0;i<arr.length;i+=1) {
			r = (int)(Math.random()*(max-min+1)+min); // 랜덤한 수
			arr[i] = r;
		}

		for(i=0;i<arr.length;i+=1) {
			System.out.print(arr[i]+" "); // ??
		}
		
	}
	
}
