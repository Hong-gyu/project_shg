package day19;

public class Rewind6 {

	public static void main(String[] args) {
		/* 클래스 
		 *  - 메소드 : 하나의 기능을 하도록 모아놓은 코드
		 *  - 매개변수 : 메소드를 실행하기 위해 필요한 정보
		 *  - 리턴타입 : 메소드 실행 후 알려주는 정보
		 *  - 메소드 선언부 : 리턴타입 메소드명(매개변수) {}
		 *  - 리턴값은 해당 메소드를 호출한 메소드에게 알려줌
		 *  - 리턴값이 없는 경우 void를 사용
		 *  - 매개변수는 값 또는 주소값을 복사해서 사용
		 *  - 매개변수가 일반변수인 경우 원래값(메소드를 호출한 곳에서 알려준 값)이 변경 안됨
		 *  - 매개변수가 참조변수인 경우 원래값이 변경 될 수 있음
		 *  - 메소드 오버로딩 : 동일한 이름의 메소드가 여러개 존재할 수 있음(단, 매개변수가 다르거나 매개변수의 타입이 다른 경우)  */
		
		/* 멤버변수
		 *  - 클래스에 나타낼 정보
		 *  - 멤버 메소드에서 멤버변수를 사용하여 동작 
		 *  - 멤버변수는 생성자에서 초기화 할 수 있음
		 *  - 멤버변수가 참고변수이면 객체를 꼭 만들어 놓아야 함
		 *  	-> 명시적 초기화 또는 생성자 또는 초기화 블록 */
		
		/* 생성자(constructor using fields) 
		 *  - 멤버변수를 초기화 하는 곳
		 *  - 일반적으로 접근제한자가 public
		 *  - 이름이 클래스와 같음
		 *  - 리턴타입을 쓰지 않음
		 *  - new 를 통해 객체를 생성한 후 호출
		 *  - 객체 생성 후 임의로 호출 할 수 없음 
		 *  - 생성자 오버로딩을 통해 다양한 형태의 생성자를 만들 수 있음
		 *  - 생성자가 없으면 기본 생성자가 만들어 짐
		 *  - this를 사용하여 다른 생성자를 호출 할 수 있음 */
		
		/* 객체 선언 및 생성
		 *  - 클래스명 객체명 = new 클래스명() 
		 *  - 객체는 생성을 해야 멤버 메소드와 멤버 변수를 사용할 수 있음
		 *  - 객체를 생성하지 않고 멤버메소드와 멤버 변수를 사용하면 NullPointerException이 발생함 */
		
		/* 멤버 메소드를 호출하는 방법
		 *  - 객체명.메소드명(매개변수); */
		
		/* 접근제한자
		 * 	- public	: 본인 + 같은 패키지 + 자식 + 다른 패키지
		 * 	- protected	: 본인 + 같은 패키지 + 자식
		 * 	- default	: 본인 + 같은 패키지
		 * 	- private	: 본인 */
		
		/* static
		 * 	- 멤버변수나 메소드를 클래스 멤버 변수 또는 메소드로 만듦
		 *  - 클래스 변수/메소드는 모든 객체가 공유
		 *  - 클래스 변수/메소드는 클래스당 1개만 존재
		 *  - static이 안 붙은 멤버변수/메소드를 객체 멤버 변수/메소드라 함
		 *  - 객체 변수/메소드는 각 객체마다 각각 1개씩 존재
		 *  - 클래스 변수는 객체 메소드에서 사용할 수 있다
		 *  - 객체 변수는 클래스 메소드에서 바로 사용할 수 없다(변환 필요)
		 *  - 클래스 메소드는 객체 메소드에서 사용할 수 있다
		 *  - 객체 메소드는 클래스 메소드에서 바로 사용할 수 없다(변환 필요)
		 *  - 클래스 변수/메소드는 객체 없이 호출 가능하지만 객체 변수/메소드는 객체가 있어야 호출이 가능 */
		
		/* final 
		 *  - 변할 수 없다
		 *  - 변수 앞 : 상수로 된다
		 *  - 메소드 앞 : 오버라이딩을 할 수 없음
		 *  - 클래스 앞 : 부모클래스가 될 수 없음
		 *  */

	}

}
