package day19;

public class Rewind7 {

	public static void main(String[] args) {
		/* 상속
		 * 	- 부모클래스의 멤버변수/메소드를 물려 받는 것
		 *  - extends 키워드를 이용해서 상속 : 부모클래스 extends 자식클래스
		 *  - 상속하는 이유 : 코드의 중복을 제거하고 쉽게 클래스를 만들기 위함
		 *  - 서로 다른 자식 클래스들의 객체들을 부모클래스에서 쉽게 관리하기 위함
		 *  - 클래스 상속에서 부모는 한 클래스
		 *  - 인터페이스 상속에서 부모는 여러 인터페이스 */
		
		/* 메소드 오버라이딩 : 부모 클래스에 있는 메소드를 자식 클래스에서 재정의 하는 것
		 *  - 부모 클래스의 메소드 선언부(매개변수, 리턴타입)가 동일해야 함 (cf. 매개변수가 다르면 오버로딩)
		 *  - 접근제한자는 좁은 범위로 줄일 수 없음
		 *  	-> 부모클래스 메소드의 접근제한자가 public이면 해당 메소드를 자식 클래스에서 오버라이딩 할 때 접근제한자는 public만 가능(default, protected, private으로 변경 불가능) */
		
		/* 클래스 타입변환 : 부모와 자식 관계에서 가능
		 * 	- 자동 : 자식 클래스의 객체를 부모 클래스의 객체로 변환하는 경우
		 * 		-> Parent p = new Child();
		 *  - 강제(조건) : 부모 클래스의 객체를 자식 클래스의 객체로 변환하는 경우
		 *  	-> Parent p = new Child(); 
		 *  	-> Child c = (Child)p; */

		/* 추상클래스
		 * 	- Calendar 가 대표적
		 *  - abstract를 붙여줌 
		 *  - 객체를 생성할 수 없음(자식 클래스를 이용하여 객체를 생성해야 함)
		 *  - 추상 메소드가 있을 수 있음(추상메소드 : 메소드 선언부만 있고 구현부가 없는 메소드)
		 *  - 자식 클래스에서 무조건 오버라이딩을 해야 함(자식 클래스가 일반 클래스 인 경우) */
	}

}
