package day11;

public class StaticTest {

	public static void main(String[] args) {
		/* 객체 멤버변수
		 *  - 멤버변수를 호출할때 객체 이름으로 호출
		 *  - 객체명.멤버변수명
		 *  - static 없음
		 *  - 객체당 하나씩 존재 */
		
		/* 클래스 멤버 변수(정적 멤버변수, static이 붙은)
		 *  - 멤버변수를 호출할때 클래스 이름으로 호출
		 *  - 클래스명, 멤버변수명(객체명.멤버변수명도 가능
		 *  - static 있음
		 *  - 클래스가 하나 */
		
		// 객체 멤버변수 num1을 호출 -> 객체를 생성한 후 멤버변수를 호출할 수 있다
		// 객체 생성 없이 객체 멤버변수를 호출할 수 없다.
		TestB t1 = new TestB(); // 객체 생성
		TestB t2 = new TestB(); // 객체 생성
		t1.num1=10;
		// t1.num2=30; -> 가능은 하지만 이러한 방법으로 클래스 멤버변수를 잘 사용하지 안ㅇ흠 
		
		// 정적멤버변수 num2를 호출 -> 클래스 이름을 통해 호출
		// 객체 생성이 필수가 아님
		TestB.num2=20;
		
		/* 기아자동차 클래스 
		 *  - 멤버변수 : 제조사, 차종(세단, suv, 버스 등), 생산량(기아자동차 생산량)
		 *  - 객체 멤버변수 : 차종, 
		 *  - 클래스 멤버변수 : 제조사, 생산량 */
		
		/* 객체 멤버 메소드
		 *  - staitc 없음
		 *  - 객체.메소드명() 으로 호출
		 *  - 각 개체마다 메소드를 가지고 있음 */
		
		/* 클래스 멤버 메소드
		 *  - staitc 있음
		 *  - 클래스명.메소드명 으로 호출
		 *  - 하나의 클래스가 메소드를 가지고 있음 */
		
		t2.printNum1();
		TestB.printNum2();

		
		/* 클래스 멤버 변수/메소드 사용시 유의사항
		 *  - 클래스 멤버변수/메소드는 객체 메소드에서 사용 가능
		 *  - 클래스 멤버 변수는 클래스 메소드에서 사용 가능 
		 * */
		
		/* 객체 멤버 변수/메소드 사용시 유의사항
		 *  - 객체 멤버 변수/메소드는 클래스 메소드에서 사용 불가
		 *  - 객체 멤버 변수는 객체 메소드에서 사용 가능 
		 * */
		
		/* 클래스 변수/메소드는 클래스가 메모리에 올라갈때 선언 됨
		 * 객체 변수/메소드는 객체가 생성될 때 선언
		 * 클래스 메소드가 호출 된 시점에 객체가 만들어져 있는지 안 만들어져있는지 알 수 없고, 어떤 객체의 정보를 출력해야 할 지 모르기 때문에 클래스 메소드에서는 객체 변수/메소드를 호출 할 수 없다.
		 * */
	}
}

class TestB{
	// 객체 멤버 변수 정수 num1를 선언
	public int num1;
	// 클래스(정적) 멤버 변수 정수 num2를 선언
	public static int num2; // t1, t2 변수 공유(모든 객체 공유)
	// 객체 멤버 메소드
	public void printNum1() {
		System.out.println("num1 : "+num1); // 객체 멤버 변수는 객체 메소드에서 사용 가능
		num2 = 20; // 클래스 멤버변수/메소드는 객체 메소드에서 사용 가능
		printNum2(); // 클래스 멤버변수/메소드는 객체 메소드에서 사용 가능
	}

	public static void printNum2() {
		System.out.println("num2 : "+num2);
		// num1 = 10; 객체 멤버 변수/메소드는 클래스 메소드에서 사용 불가
		// printnum1(); 객체 멤버 변수/메소드는 클래스 메소드에서 사용 불가
	}
}