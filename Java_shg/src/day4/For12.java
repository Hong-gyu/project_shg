package day4;

public class For12 {

	public static void main(String[] args) {
		/* 중첩for문(이중for문) - for 문 실행문 안에 for문 
		 * 하나의 *를 이용하여 다음과 같이 출력되도록 작성하세요.
		 * *****
		 * *****
		 * *****
		 * *****
		 * *****
		 *  */
		
		int i, k;
		// * 를 이용하여 ***** 출력
		for(k=1;k<=5;k+=1) {
			for(i=1;i<=5;i+=1) {
				System.out.print("*");
				
			}
			System.out.println(" ");

			
		}
			
		
		
		
		
		

	}

}
