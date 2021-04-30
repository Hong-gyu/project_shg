package day5;

public class while1 {

	public static void main(String[] args) {
		/* 1부터 5까지 while문을 이용하여 출력하는 예제
		 * */
		int i = 1; // 초기화	(기준값)
		while(i<=5) { // 조건문	(범위)
			System.out.print(i+" "); // 실행문1	(출력방법)
			i+=1; // 실행문1(편의상 증감식)	(증감)
		}
		System.out.println(i);

	}

}
