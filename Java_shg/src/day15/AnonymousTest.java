package day15;

public class AnonymousTest {

	public static void main(String[] args) {
		/* 일반객체
		 *  - 일반적으로 클래스를 생성하고 생성한 클래스를 이용하여 객체를 만듦
		 *   => 객체의 이름이 있음(A a = new A();)
		 *  	class A {
		 *  
		 *  	}
		 *  익명객체
		 *   1. 자식 클래스 대신 익명 객체 사용(자식 클래스가 재사용 되지 않고 딱 한군데에서 사용되는 경우 자식클래스를 만드는 대신 익명 객체를 만들어서 사용)
		 *   2. 구현 클래스 대신 익명 객체 사용(구현 클래스가 재사용 되지 않고 딱 한군데에서 사용되는 경우 구현클래스를 만드는 대신 익명 객체를 만들어서 사용)
		 *   	-> 제공되는 라이브러리를 이용하여 많이 사용
		 *   3. 익명 객체는 재사용이 안될 때 사용. 재사용이 많이 되는 경우에는 사용을 피하자
		 *   4. 익명 객체가 어려우면 굳이 사용안해도 대체 방법이 있다(자식 클래스 생성 또는 구현 클래스 생성)
		 *   5. 익명 객체를 몰라도 된다. 단, [ 메소드 안 ]에서 [ @Override ] 를 본다면 익명 객체를 이용했구나 정도만 떠올리면 됨
		 *   	-> 메소드 안에서 메소드가 구현됐는데 에러가 안난다면 익명객체를 이용한 것이다.
		 *   */	
		// TvRemocon 클래스를 객체를 만든 것과 같은 결과를 가진다.
		// 단 해당 익명 객체를 사용하려면 코드를 복붙해야 되기 때문에 비효율적이다.
		
		Remocon r = new Remocon() { // 익명객체
			@Override // 익명객체
			public void turnOn() { System.out.println("전원 켜짐");} // 익명객체
			@Override // 익명객체
			public void trunOff(){ System.out.println("전원 꺼짐");} // 익명객체
		}; // 익명객체
		r.turnOn(); // 익명객체

	}
}

abstract class Parent {
	public abstract void print();
}
class Child extends Parent {
	@Override
	public void print () {
		System.out.println("안녕");
	}
}

class TemA {
	// private Parent p = new Child();
	// Parent 추상 클래스를 이용하여 새로운 익명 객체를 생성한 후, 생성한 익명 객체의 주소를 p와 저장
	private Parent p = new Parent(){
		int num = 10;
		public void print() {
			System.out.println("Hello");
		}
	};
}

interface Remocon {
	void turnOn ();
	void trunOff();
}
class TvRemocon implements Remocon {
	public void turnOn() { System.out.println("전원 켜짐"); } 
	public void trunOff() {System.out.println("전원 꺼짐"); }
}