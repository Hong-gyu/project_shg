package day1;

public class Variable1 {

	public static void main(String[] args) {
		// 변수선언은 변수타입v변수명 
		// 변수타입에는 정수형, 실수형, 논리형
		
		// 정수형 변수 선언
		byte num1 = 1;
		short num2 = 32767;
		int num3 = 2147483647; // 일반적으로 숫자만 넣으면 int 로 인식함
		long num4 = 2147483648L;  // 롱 타입에 숫자로 의미하게 하려면 숫자 끝에 알파벳 L 을 붙여야 함(단, int 로 표현 할 수 없는 숫자에 한함)
		char ch1 = '한';
		int num5 = 0b111;  //정수 앞에 0b 를 붙이면 2진수, 2진수111은 10진수 7
		int num6 = 0111;  // 정수 앞에 0을 붙이면 8진수, 8진수111은 10진수 73
		int num7 = 0x111;  // 정수 앞에 0x를 붙이면 16진수, 16진수111은 10진수 273
		int num8 = 111; // 정수 앞에 아무것도 안붙이면 10진수
		System.out.println(ch1);
		System.out.println(num5);  //7
		System.out.println(num6);  //73
		System.out.println(num7);  //273
		System.out.println(num8);  //111
		// 1byte = 8bit = 0000001
		// bite num 1 = 2; = 2byte = 16bit = 00000010 // 3byte = 00000011 
		// 복습1 -> 123 = 1 * 10^2 + 2 * 10^1 + 3 * 10^0 -> 83(8) 
		// 복습2 -> 1의 보수 2의 보수(음수표현) -1+1=0 2진법으로 표현 연습
		
		// 실수형 변수 선언 (실수형에는 지수부와 가수부가 있다 정도만 알면 됨)
		float dnum1 = 1.12345678901234567F; // 롱 타입 뒤에 숫자로 의미하게 하려면 L을 붙이듯이 Float에는 F를 붙임
		double dnum2 = 1.12345678901234567;
		System.out.println(dnum1);
		System.out.println(dnum2);
		
		// 논리형 변수 선언
		boolean stop = true;
		System.out.println(stop);
		// 문자열 변수 선언
		String str ="Hello";
		System.out.println(str);
		
		// 변수명 작성 규칙
		// 동일한 변수명은 중복선언 할 수 없음
		
		
		
	}

}
