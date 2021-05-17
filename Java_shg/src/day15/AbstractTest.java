package day15;

public class AbstractTest {

	public static void main(String[] args) {
		/* 추상클래스 
		 *  - 공통된 멤버변수(필드)와 메소드의 이름을 통일하려고 사용 => 시간 절약 
		 *  - 선언 : 
		 *  	public abstract class 클래스명 {
		 *  
		 *  	}
		 *  - 추상클래스를 이용하여 객체를 생성할 수 없다. => 추상클래스를 상속한 자식 클래스를 만든 후 객체를 생성해야 한다.
		 *  - 추상클래스는 추상메소드를 생성할 수 있다.
		 *  - 추상클래스는 선언부(기능명)만 있고 구현부(실제기능)는 없는 메소드
		 *  - 추상클래스에 추상 메소드가 있으면 추상 클래스를 상속받은 자식 클래스에서 (자식클래스가 일반클래스인 경우) 추상 메소드를 무조건 오버라이딩 해야 한다
		 *    -> 구현부가 없기 때문에 구현해줘야 함
		 *    추상메소드가 있으면 일반 클래스가 될 수 없고 추상클래스이어야 한다.
		 *  */
		
		/* 클래스 A 에 객체 a를 생성 */
		A a = new A(); // 객체 생성
		// 추상클래스 B에 객체 b를 생성
		// B b = new B(); // 오류 발생
		// 추상클래스 B를 상속받은 클래스 C의 객체 c를 생성
		C c = new C(); // 객체 생성
		// 클래스 C(자식)를 이용하여 객체를 생성한 후 추상클래스 B의 객체에 저장
		B b1 = new C(); // 클래스 타입변환(자동)

	}

}

class A {}
abstract class B {
	abstract void print ();
}
class C extends B {

	@Override
	void print() {
		// TODO Auto-generated method stub
		
	}}
