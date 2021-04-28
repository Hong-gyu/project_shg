package day3;

public class For3 {

	public static void main(String[] args) {
		/* 구구단 7단을 출력하는 코드 작성
		 * 7 * 1 = 7
		 * ...
		 * 7 * 9 = 63
		 * 
		 * 고정값 7
		 * 변동값 1 ~ 9
		 * 출력값 = 63
		 * 
		 * 반복횟수 : i는 1부터 9까지 1씩 증가
		 * 규칙성 : 출력
		 * */
		
		int i;
		for(i = 1 ; i <= 9; i++ ) {
			System.out.println("7 X"+" "+i+" = "+(7*i));
		}
		
	
		
	}

}
