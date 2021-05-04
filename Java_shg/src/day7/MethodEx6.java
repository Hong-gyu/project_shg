package day7;

public class MethodEx6 {

	private static final TriangleShape LEFT_TRIANGLE = null;
	private static final TriangleShape RIGHT_TRIANGLE = null;

	public static void main(String[] args) {
		/* 다음과 같이 출력하는 메소드 만들기
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * */
	
		/* 다음과 같이 출력하는 메소드 만들기
		 *     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		 * */

		printLeftTriangle('*',6);
		printRightTriangle('*',5);
		printTriangle('*',8,TriangleShape.LEFT_TRIANGLE);
		printTriangle('*',8,TriangleShape.RIGHT_TRIANGLE);
	}
	
	/* 기능 : 주어진 문자(ch)를 주어진 횟수(count) 만큼 알려주는 메소드
	 * 매개변수 : char ch, int count
	 * 리턴타입 : char
	 * 메소드명 : printStar
	 * */
	
	public static void printLeftTriangle(char ch, int count) {
		for(int i=1;i<=count;i+=1) {
			for(int j=1; j<=i; j+=1) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
	
	public static char printRightTriangle(char ch, int count) {
		for(int i=1;i<=count;i+=1) {
			for(int k=1;k<=count-i;k+=1) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k+=1) {
				System.out.print(ch);
			}
			System.out.println();
		}
		return ch;
	}		  // 여기 다시

		
	/* 기능 : 주어진 문자를 이용하여 n줄 삼각형 출력하는데 주어진 삼각형 종류에 맞게 출력하는 메소드
	 * 매개변수 : char ch, int n, TriangleShape shape
	 * 리턴타입 : 없음 => void
	 * 메소드명 : printTriangle
	 * */
	public static void printTriangle(char ch, int n, TriangleShape shape) {
		switch(shape) {
		case LEFT_TRIANGLE :
			printLeftTriangle(ch, n);
			break;
		case RIGHT_TRIANGLE :
			printRightTriangle(ch, n);
			break;
		}
		
	}

}
enum TriangleShape{LEFT_TRIANGLE, RIGHT_TRIANGLE};
