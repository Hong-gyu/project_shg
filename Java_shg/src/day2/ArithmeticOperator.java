package day2;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// 산술연산자 / 예제
		System.out.println(" 1 / 2 = " + 1/2); // 정수 / 정수만 값이 0(소수점 버려짐) 나머지는 0.5(실수)
		System.out.println(" 1.0 / 2 = " + 1.0/2);
		System.out.println(" 1 / 2.0 = " + 1/2.0);
		System.out.println(" 1.0 / 2.0 = " + 1.0/2.0);
		
		int num1 = 1, num2 = 2;
		System.out.println(num1 / num2);
		System.out.println((double)num1 / num2);  // (강제 타입변환-변화시키고자 하는 변수명 앞에 (변수종류) 입력) 을 통해 일시적으로 실수로 변환하여 계산함
		
		System.out.println("3 % 2 = " + 3 % 2);  // ???
		System.out.println("7 % 4 = " + 7 % 4); // ???
		
		char ch1 = 'A';
		ch1 = (char)(ch1 + 1);
		
		System.out.println(ch1);
		
		char ch2 = '6';		// char + int = int 가 되어서 char에 그냥 저장할 수 없으므로 강제 타입 변환을 해야 함
		ch2 = (char)(ch2 + 1);
		
		System.out.println(ch2);

		
	}

}
