package day3;

public class For4 {

	public static void main(String[] args) {
		/* 1부터 10까지의 짝수들만 출력하는 코드 작성
		 * i는 1부터 10까지
		 * 짝수
		 *  */
		
		
		int i;
		for(i=1; i<=5; i++) {
			System.out.print(2*i + " ");
		}

		System.out.println("");
		System.out.println("");
		
		int j;
		for(j=1; j<=10; j++) {
			if(j%2==0) {
				System.out.print(j + " ");
			}
		}
		System.out.println("");
		System.out.println("");
		
		int k;
		for(k=2; k<=10; k=k+2) {
			System.out.print(k+" ");
		}
		
		
		// for(초기화; 조건문; 증감문) {
		//	  실행문
	}

}
