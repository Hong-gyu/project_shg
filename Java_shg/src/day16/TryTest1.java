package day16;

public class TryTest1 {

	public static void main(String[] args) {
		/* 예외처리의 종류
		 *  1. 직접처리 : try catch 
		 * 		기본문법 : 
		 * 			try {
		 * 				예외가 발생할 수 있는 코드;  -> 예외가 발생 안하면 finally 로 예외가 발생하면 catch 첫번쨰로
	 	 * 			} catch(예외클래스1 e) {
	 	 * 					예외1가 발생했을 때 실행할 코드1;
	 	 * 			} catch(예외클래스2 e) {
	 	 *				 	예외2가 발생했을 때 실행할 코드1;
	 	 *			} catch(Exception e) {
	 	 *					예외1, 예외2를 제외한 모든 예외가 발생했을 때 실행할 코드3;
	 	 *			} finally { // finally는 필수는 아님
	 	 *					항상 실행;
	 	 *			}
	 	 *	2. 떠넘기기 : throws
	 	 *		- 메소드에서 예외가 발생한 경우 직접 예외처리를 하지 않고 호출한 메소드에게 예외처리를 떠넘길 수 있다.
	 	 *		- 메소드에 throws를 이용하여 해당 메소드에서 발생할 수 있는 예외 종류들을 알려줘야 한다. 단, 실행예외(RuntimeException)인 경우 throws에 알려주지 않아도 됨
	 	 *	 * */
		
		/* 예외 
		 *  - try catch 또는 throws 를 이용하지 않고 조건문과 리턴값을 이용하여 예외처리를 할 수 있다.
		 *  - 하지만 메소드에 리턴값이 이미 있는 경우는 조건문과 리턴값을 이용하여 예외처리를 할 수 없다.
		 *  - 조건문과 리턴값을 이용한 예외처리는 한계가 있기 때문에 잘 사용되지 않는다.*/
		
		int num1 = 1, num2 = 0;
		/* 예외 발생 시 catch에서 해당 예외 클래스나 조상 클래스가 있으면 예외를 처리
		 * 나누기에서는 ArithmeticException 이 발생할 수 있음 
		 * ArithmeticException 의 부모 : RuntimeException
		 * RuntimeException 의 부모 : Exception
		 * */
		try {
			System.out.println(num1 / num2);			
		} catch(Exception e) {						// Exception(조상) 이기 때문에 예외처리 실행
			System.out.println("예외 발생 : 0으로 나눌 수 없습니다.");
		}
		System.out.println("예외 처리를 1번 실행하였습니다");
		try {
			System.out.println(num1 / num2);
		} catch(ArithmeticException e) {			// ArithmeticException 본인이기 때문에 예외처리 실행
			System.out.println("예외 발생 : 0으로 나눌 수 없습니다.");
		}
		System.out.println("예외 처리를 2번 실행하였습니다");
		try {
			System.out.println(num1 / num2);			
		} catch(RuntimeException e) {				// RuntimeException은 ArithmeticException의 부모 이기 때문에 예외처리 실행
			System.out.println("예외 발생 : 0으로 나눌 수 없습니다.");
		}
		System.out.println("예외 처리를 3번 실행하였습니다");
		try {
			System.out.println(num1 / num2);			
		} catch(ClassCastException e) { 			// ClassCastException은 ArithmeticExcepiton의 조상이 아니기 때문에 예외처리 실행불가
			System.out.println("예외 발생 : 0으로 나눌 수 없습니다.");
		}
		System.out.println("예외 처리를 4번 실행하였습니다");
		System.out.println("프로그램을 종료합니다.");
	}
}