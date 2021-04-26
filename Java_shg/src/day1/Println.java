package day1;

public class Println {

	public static void main(String[] args) {
		/* system.out.println() : ()안에 있는 내용을 콘솔에 출력하는 기능
		                          내용을 출력 후 엔터를 침(줄바꿈) cf. print는 다음 저장되는 내용을 한 줄로 표기함
		 * System.out.println(문자열);
		 * System.out.println(정수);
		 * System.out.println(실수);
		 * System.out.println(논리형);
		 * System.out.println(문자); 
		 */
		System.out.println("Hello");
		System.out.println("Hello"); 
		System.out.println(1);
		System.out.println(1);
		System.out.println(3.14);
		System.out.println(true);
		System.out.println('A');

		System.out.print("Hello");
		System.out.print("Hello"); 
		System.out.print(1);
		System.out.print(1);
		System.out.print(3.14);
		System.out.print(true);
		System.out.println('A');
		
		System.out.println(1+2+3);   // 정수 1+2+3
		System.out.println("1"+2+3); // 문자열 1 + 정수2 => 문자열 12 + 정수3 => 문자열12, 정수3  "문자열"정수정수
		System.out.println("1"+(2+3)); // 문자열 1 + (정수 2+3) 문자열정수+정수
		System.out.println(1+2+"3");  // 정수 1 + 2 + 문자열 3 정수정수+문자열
	}

}
