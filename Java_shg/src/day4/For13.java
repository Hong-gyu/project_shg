package day4;

public class For13 {

	public static void main(String[] args) {
		/* 이중 반복문을 이용한 예제
		 * 
		 * 구구단 전체를 출력하는 코드
		 * */
		

		int i, j;
		for(j=2;j<=9;j+=1) {
			for(i=1;i<=9;i+=1) {
				System.out.println(j+" * "+ i +" = "+(j*i));
			}
		}

	}

}
