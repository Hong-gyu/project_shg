package day6;

import java.util.Scanner;

public class MethodEx1 {

	public static void main(String[] args) {
		// 메소드 예제
		// 메소드명(값);
		System.out.println(add(-71,22));
		add2(-71,22);
		printMultiTable(8);
		int num1=8, num2=12;
		int res=gcd(num1, num2);
		System.out.println(res);

	}
	
	/* 기능 : 두 정수가 주어지면 두 정수의 합을 알려주는 메소드
	 * 매개변수 : 두 정수 => int num1, num2;
	 * 리턴타입 : 두 정수의 합 => 정수 -> int
	 * 매소드명 : add
	 * */
	
	public static int add(int num1, int num2) { // 선생님 :  "1과 2를 더하세요"
		int res = num1+num2; // 학생 : "암기완료"
		return res; // 결과값을 return을 통해 알려줌, 리턴값이 없을 수 있음(리턴타입이 없는 경우, void라는 키워드로 대체)
	} // 기능을 만든 상태
	
	/* 기능 : 두 정수가 주어지면 두 정수의 합을 콘솔에 출력하는 메소드
	 * 매개변수 : 두 정수 => int num1, num2;
	 * 리턴타입 : 없음 => void
	 * 매소드명 : add2
	 * */
	
	public static void add2(int num1, int num2) { // 선생님 :  "1과 2를 더하세요"
		int res = num1+num2; // 학생 : "암기완료"
		System.out.println(num1+" + "+num2+" = "+res);// return이 없으므로 void로 대체
	} // 기능을 만든 상태
	

	/* 기능 : 두 정수와 산술연산자가 주어지면 두 정수의 산술연산결과를 알려주는 메소드
	 * 매개변수 : 두 정수, 산술연산자 => int num1, int num2, char ch;
	 * 리턴타입 : 산술연산자 적용 => 실수(정수/정수=실수가 될 수 있기 때문)
	 * 매소드명 : calculate
	 * */
	
	public static double cal(int num1, char ch, int num2) {
		return 0.0;
	}
	
	/* 기능 : 두 정수와 최대공약수를 알려주는 메소드
	 * 매개변수 : 두 정수 = int num1, int num2, 
	 * 리턴타입 : 최대 공약수 => for(i=1; i<=num1*num2; i+=1) {
	 * 								if(num1%i==0 && num2%i==0){
	 * 									result 0.0
	 * 								}
	 * 						}
	 * 매소드명 : gcd
	 * */
	public static int gcd(int num1, int num2) {
		int i, gcd = 1;
		for(i=1; i<=num1; i+=1) {
			 if(num1%i==0 && num2%i==0){
				 gcd=i;
			 }
		}
		return gcd;
	}
	
	
	/* 기능 : num단을 출력하는 메소드
	 * 매개변수 : 두 정수 (int num)
	 * 리턴타입 : void => void
	 * 매소드명 : printMultiTable
	 * */
	public static void printMultiTable(int num) {
		int i;
		for(i=1; i<=9; i+=1) {
			System.out.println(num+" X "+i+" = "+num*i);
		} 
	}
}
		
