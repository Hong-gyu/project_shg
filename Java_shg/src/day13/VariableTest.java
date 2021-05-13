package day13;

import board.Board;

public class VariableTest { // 접근제한자 public, 클래스 VariableTest

	public static void main(String[] args) { // 클래스 VaribaleTest 의 멤버변수
		// 정답, (오답), [언급없음]
		// 몰랐음
		
		int num5 = 0; // [main의 객체변수], 일반변수,
		// 지역변수
		String str3 = "Hello"; // main의 객체(변수), 참조변수
		// 지역변수
		int [] arr = new int[5]; // [main의 객채변수], 참조변수, 배열
		// 지역변수
		Board[] board = new Board[5]; // 참조변수, 배열
	}

}

class A{ // 클래스 A
	int num1; // (클래스 A의 멤버변수), 일반변수
	// 객체 멤버변수
	static int num2; // 클래스 (A 의) 멤버변수, 일반변수
	String str1; // (클래스 A의 멤버변수), 참조변수
	// 객체, 객체 멤버변수
	static String str2; // 클래스 (A 의) 멤버변수, 참조변수
	// 객체
	public A(int num3, int num4) { // 클래스 A 의 생성자,
		// 일반변수(int num3, int num4), 매개변수
		num1 = num3; // 메소드 A 의 객체변수, (참조변수)
		num2 = num4; // 메소드 A 의 객체변수, (참조변수)
	}
	
}
// final 클래스 string을 통해 자식 클래스를 만들 수 없다.
// class SubString extends String{