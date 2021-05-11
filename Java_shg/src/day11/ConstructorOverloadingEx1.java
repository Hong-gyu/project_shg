package day11;

public class ConstructorOverloadingEx1 {

	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A(1,2); // public A 밑에꺼가 실행됨
		// A a3 = new A(1.0, 2); // 실수가 정수로 자동형변환이 안되기 때문에 에러
		A a4 = new A('a', 3); // 문자가 정수로 자동형변환이 되기 때문에 에러X
	}
}

/* 생성자는 여러개 있을 수 있다 -> 생성자 오버로딩
 * 생성자 오버로딩은 매개변수의 종류가 다른 경우 만들 수 있다
 * 매개변수의 갯수가 다른 경우 가능
 * 매개변수의 타입이 다른 경우 가능 */

class A { // A라는 클래스
	private int num1; // 멤버변수1
	private int num2; // 멤버변수2
	public void A() {} // 생성자와 이름이 같은 메소드
	public A() {} // 멤버변수3
	// public A(int num10, int num11) { // 매개변수 이름만 다른것은 에러

	// 기본생성자		
	public A(int num1, int num2) { // 우클릭을 통해 만들 수 있음
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	 
	/* 복사생성자 : 생성자의 매개변수로 같은 클래스의 객체가 오는 경우
	 * 기본문법 : 
	 * 	public 클래스명(클래스명 객체명) {
	 * 	
	 * 	} */
	public A(A a) {
		num1 = a.num1;
		num2 = a.num2;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	// }

}
