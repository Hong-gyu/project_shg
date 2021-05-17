package day15;

public class Interface {

	public static void main(String[] args) {
		/* 인터페이스(기능명세 )
		 *  - 메소드는 추상메소드만 있을 수 있다.
		 *    => abstract라는 키워드가 없어도 자동으로 추가 됨
		 *  - 변수는 있을 수 없고 상수(클래스 상수)만 있을 수 있다.
		 *    => static final 이라는 키워드가 없어도 자동으로 추가 됨
		 *  - 매개변수의 다형성을 인터페이스를 이용해서라도 적용 할 수 있다.
		 *  - 인터페이스를 이용하여 객체를 만들 수 없다. 
		 *  - 인터페이스는 구현 클래스를 생성한 후 객체를 만들 수 있다.
		 *  - 상속은 extends, 구현은 implements를 이용
		 *  - 구현클래스는 여러개의 인터페이스를 구현할 수 있다. */
		
		/* 매개변수의 다형성 : 메소드의 매개변수를 부모클래스로 설정하면 해당 부모클래스를 상속받은 자식클래스들이 매개변수로 올 수 있다. */
		
		/* 추상클래스
		 * 객체변수, 객체상수, 클래스변수, 클래스상수, 객체메소드, 클래스메소드, 추상메소드, 
		 *   vs
		 * 인터페이스
		 * 클래스상수, 추상메소드
		 * */
		
		/* 일반클래스, 추상클래스, 인터페이스 비교
		 * 	   			일반클래스 		추상클래스			인터페이스
		 * 멤버변수			O				O				X
		 * 상수				O				O				O
		 * 메소드				O				O				X
		 * 추상메소드			X				O				O
		 * 객체생성			O				X(자식클래스로 생성)	X(구현클래스로 생성 후)
		 * 상속갯수			1				1				여러개
		 * */
		
		/* 인터페이스의 상속
		 *  - 클래스의 상속과는 다르게 인터페이스의 상속은 다중 상속이 가능(클래스 : 부모 1명, 인터페이스 : 부모 여러명) */
	}
}