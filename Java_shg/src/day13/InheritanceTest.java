package day13;

public class InheritanceTest {

	public static void main(String[] args) {
		/* 클래스 상속
		 *  - 모든 클래스는 부모 클래스의 생성자를 호출한다
		 *  - super()를 통해 직접 호출하지 않으며 부모클래스의 기본생성자를 자동으로 호출한다
		 *  - 부모클래스는 하나만 존재 -> 부모가 존재할 수 있고, 조부모가 존재할 수 있지만 부모가 두 분씩 있을 순 없다.
		 * */
		
		/* 메소드 재정의(메소드 오버라이드/오버라이딩)
		 *  - 부모클래스의 메소드를 자식 클래스가 재정의 하는 것
		 *  - 부모클래스의 메소드와 선언이 똑같은 메소드를 입력하고 구현부를 수정
		 * */
		/* final : 수정할 수 없는
		 *  - 변수 : 상수
		 *  - 메소드 : 오버라이딩 불가능 => 자식클래스에서 해당 메소드를 재정의 할 수 없다
		 *  - 클래스 : 상속할 수 없다 => 해당 클래스는 부모클래스가 될 수 없다
		 * */
		
		
		Child c = new Child(1,2,3);
		c.print();
		c.print2();
		String S;
	}

}

class Parent{
	private int num1; // 일반변수, 멤버변수
	protected int num2; // 일반변수, 멤버변수
	public int num3; // 일반변수, 멤버변수
	public void print() { // 
		System.out.println("(부모) num1 : "+getNum1());
		System.out.println("(부모) num2 : "+num2);
		System.out.println("(부모) num3 : "+num3);
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
	public final void menu() {
		System.out.println("메뉴입니다.");
	}
	public Parent(int num1, int num2, int num3) {
		// super();
		this.setNum1(num1);
		this.num2 = num2;
		this.num3 = num3;
	}
}
class Child extends Parent {
	public int num4; // 메소드 재정의(메소드 오버라이드/오버라이딩)
	public Child(int num1, int num2, int num3) {
		super(num1, num2, num3);
	}
	public void print2() {
		System.out.println("자식 "+getNum1());
		System.out.println("자식 "+num2);
		System.out.println("자식 "+num3);
	}
	// 오버라이드/오버라이딩
	// 접근제한자를 좁힐 수 없다.
	// 부모클래스의 메소드가 public 이면 private이나 protected로 수정 할 수 없다
	@Override
	public void print() { 
		super.print();
		System.out.println("(오버라이드) num4 : "+num4);
	}
	// 오버로드/오버로딩
	public void print(int num1) { 
		super.print();
		System.out.println("num4 : "+num4);
	}
	// 부모클래스에 있는 menu 메소드가 fianl 이기 때문에 오버라이딩이 안됨
	// public void menu() {
	// }
}