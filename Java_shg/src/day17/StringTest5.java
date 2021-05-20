package day17;

import java.util.Scanner;

public class StringTest5 {

	public static void main(String[] args) {
		/*
		// substring(index), substring(int beginindex, int endindex)
		String str = "안녕하세요";
		System.out.println("안녕하세요".substring(2)); // 2번지부터 마지막 번지까지 부분 문자열 생성
		System.out.println(str); // substirng 은 원본을 수정하는 것이 아니라 새로운 문자열을 생성하는 것을 확인
		System.out.println(str.substring(2, 3)); // 2번지부터 3번지 전까지인 2번지까지의 새로운 부분 문자열을 생성
		*/
		/* 주민등록번호를 입력해서 생년월일 부분을 추출하여 년도 월 일을 출력하는 코드 작성 
		 * 예시 :
		 * 주민번호를 입력하세요 : 020101-3456789
		 * 2002년 1월 1일
		 * 주민번호를 입력하세요 : 020101-1234567
		 * 1902년 1월 1일 */
		
		System.out.print("주민번호를 입력하세요 : ");
		Scanner scan=new Scanner(System.in);
		String str = scan.next();
		String year = str.substring(0, 2);
		String month =str.substring(2, 4);
		String day = str.substring(4, 6);
		String gender = str.substring(7, 8);
		System.out.println(str.substring(0, 6));
		if(str != null && (gender.equals("3") || gender.equals("4") )) {
			year="20"+year;
		} else if (str != null && (gender.equals("1") || gender.equals("2"))) {
			year="19"+year;
		}
		System.out.println(year+"년 "+month+"월 "+day+"일");
		System.out.println("----------------------------");
		switch (gender) {
		case "1","2" : 
			year = "19"+year;
			break;
		case "3","4" :
			year = "20"+year;
			break;
		}
		System.out.println(year+"년 "+month+"월 "+day+"일");
		scan.close();
	}

}
