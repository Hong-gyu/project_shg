package day12;

public class InheritanceTest {

	public static void main(String[] arg) {
		/* 클래스 상속 : 부모 클래스의 멤버 변수/메소드를 물려받는 것
		 *  - class 자식클래스명 extends 부모클래스명 {
		 *  
		 *  }
		 * 	- 접근제한자가 private 이면 물려받지 못함
		 * 		-> 부모클래스에 해당 변수에 대한 getter 와 setter 를 만들어서 자식 클래스에서 사용
		 * 	- 접근제한자가 default 이면 같은 패키지가 아닌 경우 물려받지 못함
		 * 	- 접근제한자가 public, protected 이면 물려 받음 */
		
		/* 클래스 상속 이유
		 *  - 코드 중복 제거
		 *  - 부모클래스에 구현된 메소드를 사용할 수 있기 때문에 효율이 좋음 */
		
		/* 상속을 할 수 있는 경우
		 *  - A(자식클래스)는 B(부모클래스)이다가 성립하면 상속을 할 수 있다.
		 *  예) 사람은 동물이다.(O) -> 동물 클래스를 상속받아 사람 클래스를 만들 수 있다.
		 *      동물은 사람이다.(X) -> 사람 클래스를 상속받아 동물 클래스를 만들 수 없다.
		 *  예) 스마트폰은 폰이다.(O) -> 스마트폰 : 자식클래스, 폰 -> 부모클래스       
		 *  	스마트폰은 카메라이다.(X)
		 *  예) 사각형은 도형이다.(O)
		 *  	삼각형은 도형이다.(O)
		 *  	원은 도형이다.(O)
		 *  	=> 도형 : 부모클래스, 삼각형, 사각형, 원 : 자식클래스
		 *   */
		
		/* 상속받은 자식클래스의 생성자
		 *  - 자식클래스의 생성자를 호출하면 자식클래스의 생성자가 실행되는데, 자식클래스 생성자 안에 부모생성자가 있어서 먼저 호출이 됨
		 *  - 자식클래스의 생성자 안에 부모클래스의 생성자가 없으면 부모클래스의 기본 생성자가 자동으로 호출이 됨
		 *  - 부모클래스의 생성자는 super()를 통해 호출
		 *  - 부모클래스의 생성자를 호출하려면 super()위에 코드가 없어야 함
		 *  - 부모클래스의 생성자를 super()를 통해 호출하면 본인 생성자 this()를 이용할 수 없음
		 * */
		
		/* super
		 *  - 부모클래스의 객체
		 *  - 생성자 : super()
		 *  - 멤버 호출
		 *   1) super.멤버변수
		 *   2) super.멤버메소드()
		 *  - 단, 접근제한자에 따라 부모클래스의 메소드를 호출 할 수 없을 수도 있다. 
		 * */
		
		/* this
		 *  - 내 클래스의 객체
		 *  - 생성자 : this()
		 *  - 멤버 호출
		 *   1) this.멤버변수
		 *   2) this.멤버메소드()
		 *  - 접근제한자 상관없이 호출 가능
		 * */
			
		Parent p = new Parent();
		p.print();
		Child c = new Child();
		c.print();
		// c.num2 = 10;
		c.num3 = 10;
		c.num4 = 10;
		c.print();
	
	}
}
class Parent{
	public int num;
	private int num2; // -> getter setter를 이용해야 자식클래스에 전달할 수 있음
	protected int num3;
	int num4;
	public void print () {
		System.out.println("num : "+num);
	}
}

class Child extends Parent {
	public void print2 () {
		// System.out.println("num2 : "+num2);
		System.out.println("num3 : "+num3);
		System.out.println("num4 : "+num4);
	}
	
}