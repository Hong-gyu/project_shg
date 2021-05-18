package day15;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		/* 예외처리 : 예외를 처리
		 * 	- 예외 : 코드로 해결이 가능한 것
		 * 	- 오류 : 코드로 해결이 불가능한 것
		 *  - 예외처리 : 예외가 발생할 수 있는 코드를 예외가 발생했을 때 처리할 수 있도록 작성하는 코드
		 *  - 모든 예외 클래스의 조상은 Exception 클래스 
		 *  - 일반 예외 : 컴파일 과정에서 오류 발생. 실행되지 않음
		 *  - 실행 예외 : 실행되는 과정에서 오류 발생. 일단 실행은 됨
		 *  - 예외가 발생되었을 때 예외처리가 안되어 있다면 프로그램이 중단됨 -> 프로그램이 중단되는 걸 막기 위해 예외처리를 해야 한다.
		 *  - 예외 처리란 예외를 사전에 방지하는 것이 아니라 예외가 발생했을때 프로그램이 중단되는 것을 막는 것을 의미함
		 *  */
		
		/* 실행예외의 종류
		 *  1. NullPointerException : 참조변수를 이용하는 경우 발생. 객체를 생성하지 않고 멤버변수나 멤버 메소드를 호출할 때 발생(참조변수는 null로 초기화가 가능하기 때문)
		 *  	- 해결방법 : 객체나 배열을 생성, 멤버변수나 메소드를 호출하기 전에 조건문을 이용하여 null 인지 체크
		 *  2. ArrayIndexOutOfBoundsException : 객체나 배열을 생성하지 않고 멤버변수나 메소드를 사용하는 경우 발생, 배열을 이용할 때 발생 할 수 있음. 잘못된 배열 번지에 접근하는 경우 발생
		 *  	- 해결방법(예외가 발생하지 않도록 사전에 처리하는 방법) : 배열의 번지는 0부터 arr.length 보다 작다는 걸 기억하거나 향상된 for문을 이용해도 되는 상황이면 적극적으로 이용하자
		 *  3. NumberFormatException : 문자열을 숫자로 변환할 때에 발생할 수 있다. 숫자로 바꾸려는 문자열에 숫자가 아닌 문자들이 있는 경우 발생
		 *  	- 해결방법 : 따로 없음 -> 예외가 발생한 후 처리해야함
		 *  4. ClassCastException : 클래스 타입 변환시 발생할 수 있다.(부모클래스 객체를 자식클래스 객체로 변환할 때 발생가능)
		 *  	- 해결방법 : 조건문과 instanceof 를 이용하자
		 *    */ 
		Scanner scan=new Scanner(System.in);
		System.out.print("두 정수를 입력하세요 : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		// 조건문을 이용하여 예외가 발생하지 않도록 처리(예외 처리)
		if(num2 != 0 ) {
			int res = num1 % num2;
			// num2에 0을 입력하면 예외가 발생
			System.out.print(num1 + "을(를) "+num2+"(으)로 나눈 나머지 : "+res);
		} else {
			System.out.println("0으로 나눌 수 없습니다");
		}
		scan.close();
	}
}