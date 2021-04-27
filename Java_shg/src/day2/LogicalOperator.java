package day2;

public class LogicalOperator {

	public static void main(String[] args) {
		// 논리 연산자 예제
		
		// !(NOT) 연산자
		System.out.println("4는 짝수인가 ? "+ (4 % 2 == 0));
		System.out.println("4는 홀수가 아닌가 ? "+ !(4 % 2 == 1));
		
		// &&(AND) 연산자
		// 변수 num가 2의 배수이고 3의 배수이면 6의 배수이다.
		int num1 = 6;
		System.out.println(num1 + "는 6의 배수인가 ? "+ (num1 % 2 == 0 && num1 % 3 == 0));
		
		int num2 = 8;
		System.out.println(num2 + "는 6의 배수인가 ? "+ (num2 % 2 == 0 && num2 % 3 == 0));

		int num3 = 12;
		System.out.println(num3 + "는 6의 배수인가 ? "+ (num3 % 2 == 0 && num3 % 3 == 0));
		
		
		// 표현 중에 ~ 하고 는 && ~ 하거나 는 || (shift \\ ) 
		
		// ||(OR) 연산자
		// 청소년은 14세부터 19세까지이다. 나이가 age인 학생은 청소년이 아닌지 확인 하는 예제
		// 청소년이 아닌 사람은 14세 미만 또는 19세 초과
		
		int age1 = 20;
		System.out.println(age1 + "살은 청소년인가? 아닌가? " + (age1 < 14 || age1 > 19) );
		
		int age2 = 9;
		System.out.println(age2 + "살은 청소년인가? 아닌가? " + (age2 < 14 || age2> 19) );
		
		// ^(XOR) 연산자 ( 이런게 있구나 정도 - 실제 코딩에서는 안쓰임)
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		// = 대입연산자
		// 1) 오른쪽에 있는 값을 왼쪽에 저장할 때 사용
		// 2) 왼쪽에는 변수 1개가 와야 함
		// 3) = 과 ==를 혼동하면 안됨
		/** 
		 * int num1 = 1, num2 = 2
		 * num1 + num2 = 3 ? 틀림 -> num2 = 3 - num1
		 */
		
		
	}

}
