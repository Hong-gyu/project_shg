package day6;

public class VariableEx1 {
	static int num=10; // VariableEx1 클래스의 멤버변수 num
	public static void main(String[] args) {
		/* 지역변수 : 우리가 지금까지 사용한 일반 변수(특정 지역에서만 사용가능한 변수)
		 *  - 선언된 위치부터 해당 {}안 끝까지 사용 가능
		 * 멤버변수 : 클래스 안에 있는 변수로, 해당 클래스의 모든 곳에서 사용 가능
		 * */
		
		int i; // i는 현재 선언된 11번째 줄 위치에서 main 메소드 안에서 선언했기 때문에 선언위치부터 main메소드 끝까지(21번째 줄) 사용 가능
		for(i=1;i<=5;i+=1) {
			System.out.print("*");
		}
		System.out.println(i);
		
		for(int k=1; k<=5; k+=1) {  // k는 반복문 안에서 선언했기 때문에 k는 현재 선언된 17번째 줄 위치에서 18번째 줄까지 사용 가능
			System.out.print("*");
		}
		System.out.println();
		System.out.println(num);
	}
	public static void test() {
		// i = 10; // 에러 발생(test 메소드 에서는 i라는 변수를 선언하지 않았기 때문)
		System.out.println(num);
	}
}
