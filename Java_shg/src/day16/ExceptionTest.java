package day16;

public class ExceptionTest {

	public static void main(String[] args) {
		// 예외 클래스 Exception 살펴보는 예제
		try {
			throw new Exception("예외처리");
		} catch(Exception e) { // 예외가 발생하면 Exception 클래스를 이용하여 객체 e를 선언하고 발생한 예외 객체를 e에 저장
			System.out.println(e.getMessage()); // getMessage() : 생성자에서 넣어준 문자열을 가져오는 메소드
			e.printStackTrace(); // printStackTrace() : 예외가 발생한 위치를 출력해주는 메소드
		}
		System.out.println("종료");
	}

}
