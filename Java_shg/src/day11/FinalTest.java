package day11;

public class FinalTest {

	public static void main(String[] args) {
		/* final : 변경 불가
		 *  - 변수 앞 final :  상수
		 *  - 메소드 앞 final : 메소드 오버라이딩 불가능
		 *  - 클래스 앞 final : 상속 불가능 (예 : String)
		 *  - 생성자에서 final 변수를 초기화 할 수 있다. 단, 한번 초기화 한 후에는 변경할 수 없다 
		 *  */
		FinalTest ft = new FinalTest();
		System.out.println(ft.sum(1, 2));
		// TestC.PI2 = 5; // 에러발생 : 상수를 수정하려고 했기 때문
		TestC c = new TestC();
		// c.PI = 3; // 에러발생 : 상수를 수정하려고 했기 때문 
	}
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
}

class TestC {
	public final double PI = 3.14;
	public static final double PI2 = 3.14;
	public final int MAX_COUNT;
	public TestC() {
		MAX_COUNT = 10; // final 변수를 생성자에서 초기화
	}
}
