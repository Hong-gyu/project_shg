package day7;

public class MethodEx5 {

	public static void main(String[] args) {
		// *****을 출력하도록 메소드를 생성하여 테스트
		
		printChar('*', 9);
		System.out.println();
		System.out.print(printChar2('*', 5));
		System.out.println();
		System.out.print(printChar2('*', 3)+printChar2('%',1));

	}
	
	/* 기능 : 주어진 문자(ch)를 주어진 정수(count) 반복하여 출력하는 메소드
	 * 매개변수 : *, 정수
	 * 리턴타입 : 
	 * 메소드명 : printChar1
	 * */
	
	public static void printChar(char ch, int count) {
		for(int i=0;i<count;i+=1) {
			System.out.print(ch);
		}
	}
	
	/* 기능 : 주어진 문자(ch)를 주어진 정수(count) 반복하여 하나의 문자열로 알려주는 메소드
	 * 매개변수 : *
	 * 리턴타입 : 문자열
	 * 메소드명 : printChar2
	 * */
	
	public static String printChar2(char ch, int count) {
		String str=""; // 문자열 + 문자 = 문자열
		for(int i=0;i<count;i+=1) {
			str=str+ch; // i=0일 때, ""+'*'=>"*" // i=1일 때, "*"+'*'=>"**" i=count-1 -> *이 count개
		}
		return str;
	}
	
	

}
