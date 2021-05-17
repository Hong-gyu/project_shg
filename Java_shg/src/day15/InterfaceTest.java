package day15;

public class InterfaceTest {

	public static void main (String [] ags) {
		/* 타입변환
		 *  - 상속
		 *  	1. 자동 : 
		 *  		부모클래스 객체1 = new 자식클래스();
		 *  		자식클래스 객체2 = 객체1
		 *  	2. 강제 : 
		 *  		부모클래스 객체3 = new 자식클래스();
		 *			자식클래스 객체4 = (자식클래스) 객체3
		 *  - 구현
		 *  	1. 자동 : 
		 *  		구현클래스 객체5 = new 구현클래스();
		 *  		인터페이스 객체6 = 객체5;
		 *  	2. 강제 : 
		 *  		인터페이스 객체7 = new 구현클래스();
		 *  		구현클래스 객체8 = (구현클래스)객체7;
		 *  */
	}
}

class A1 {
	void print( ) {
		System.out.println("Hello");
	}
}

class A2 {
	void print () {
		System.out.println("Hi");
	}	
}

// class AC extends A1, A2 {} // 부모가 A1, A2 둘 다 이면 print를 호출했을때 어떤걸 불러와야하는지 알 수 없음 -> 클래스에서 상속은 부모가 한명만 올 수 있다
interface B1 {
	void print();
}
interface B2 {
	void print();
}
class BC implements B1, B2 {
	@Override
	public void print() {
		System.out.println("안녕");
	}
}
class C1 extends A1 implements B1, B2 { // C1 클래스는 A1 클래스를 상속 받고 B1, B2 인터페이스를 구현한 클래스 이다.
	@Override
	public void print() {
		System.out.println("안녕하세요");
	}	
}
