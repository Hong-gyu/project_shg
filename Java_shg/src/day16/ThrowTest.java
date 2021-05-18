package day16;

public class ThrowTest {

	public static void main(String[] args) {
		/* throw : 자바에서 정해놓은 예외가 아닌 개발자가 발생시키는 예외를 만들때 사용
		 *  - throw 예외 객체  
		 *  - 실행 예외가 아닌 일반 예외는 무조건 예외처리를 해야 함
		 *  - 실행 예외는 예외처리를 안해도 프로그램은 실행 됨
		 *  - 실행 예외는 RuntimeException 을 상속받은 예외 클래스들이다(RuntimeException포함)
		 *   */
		int num = 1;
		try {
			if(num == 1){
				// RuntimeException e = new RuntimeException("예외");
				// throw e; 
				throw new RuntimeException("예외");
			}	
		} catch(RuntimeException e) {
			System.out.println("실행 예외 발생");
		} catch(Exception e) {
			System.out.println("예외 발생");
		}
		// Exception 는 실행 예외가 아니기 때문에 예외처리가 필수
		// 예외처리를 안한 아래 코드는 에러 발생
		// RuntimeException은 실행 예외이기 때문에 예외처리를 안해도 에러가 발생하지 않음
		// throw new Exception("예외"); // try로 안감싸져있으니 이건 예외처리 한 것이 아님
		throw new RuntimeException("예외");
	}

}
