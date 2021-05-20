package day17;

import java.util.Scanner;

public class StringTest1 {
	//charAt()메소드 예제
	public static void main(String[] args) {
		/*
		String 클래스 : ""로 된 문자열 상수에서도 사용 가능
		 - charAt(번지) : 문자열에서 번지에 해당하는 문자를 알려주는 메소드
		   charAt(0) : 문자열에서 0번지에 해당하는 문자를 알려주는 메소드
		 - equals(문자열) : 두 문자열이 같은지 알려주는 메소드
		 - indexOf(문자열A) : 문자열에서 문자열A가 어디에 있는지 번지를 
		   알려주는 메소드. 없으면 -1
		 - length() : 문자열의 길이를 알려주는 메소드
		 - replace(A, B) : 문자열에서 A와 일치하는 곳을 B로 교체한 문자열을 
		   알려주는 메소드, 원본은 바뀌지 않음
		 - substring(index) : index 번지부터 끝까지 부분 문자열을 생성 
		 - substring(begin, end) : begin 번지부터 end 번지 전까지 부분 문자열을 생성
			-> 부분 문자열 생성
			-> 기존 문자열을 수정하는 것이 아니라 새로운 부분 문자열을 생성
		 - toLowerCase() : 문자열을 전부 소문자로
		 - toUpperCase() : 문자열을 전부 대문자로
		 - trim() : 앞뒤 공백을 제거하는 메소드
		 - valueOf(기본타입) : 기본타입값을 문자열로 변경해주는 메소드( * 클래스 메소드)
		 - split(패턴) : 문자열을 패턴을 기준으로 부분 문자열들로 나눈 후 배열로 만듦
		 - compareTo(문자열) : 두 문자열이 같은지를 비교하여 같으면 0, 다르면 사전순에 따라 1 또는 -1을 반환
			->-1 : 문자열 A가 사전순으로 앞
			-> 0 : 문자열 A,B가 같음
			-> 1 : 문자열 A가 사전순으로 뒤 
			-> 문자열B 기준으로 문자열B가 문자열A보다 앞이면 -1 같으면 0 뒤면 1
		 - contains(문자열) : 해당 문자열이 포함되어있는지 아닌지
		같다 
		 - 일반변수 : ==
		 - 참조변수 : equals()
		체이닝 : 메소드를 연속해서 사용하는 것  		 
		래퍼(Wrapper) 클래스
		 - 기본타입을 클래스로 만든 것
		 - 기본타입의 값 + null을 가질 수 있다
		 - 나중에 컬렉션 프레임워크나 제네릭 클래스에서 기본타입이 아닌 클래스가 꼭 필요한 경우가 있다. 이때 사용하기 위해서 사용
		*/
		/* 리눅스 명령어
		ls : 현재 파일에 있는 파일 및 폴더를 확인하는 명령어
		ls -al 현재 폴더에 있는 파일 및 폴더를 자세히 확인하는 명령어
		mkdir 폴더명 : 해당폴더 생성
		cd 폴더명 : 해당 폴더로 이동
		cd .. : 위로가기(상위폴더)
		cd ~ : 홈(최상위폴더)
		cd test : 현재 폴더에서 test로 이동
		cd / test : 최상위폴더 기준으로 test를 찾음(이동)
		rmdir  폴더명 : 해당폴더 삭제
		hostname -I(대문자 i) : 아이피 주소 확인 */
		Scanner scan = new Scanner(System.in);
		System.out.print("문자를 입력 : ");
		//char op = scan.next().charAt(0);
		//Scanner 클래스에서 제공하는 next()라는 메소드를 통해 콘솔에서 입력받은 문자열을 가져옴
		String str = scan.next();
		//String 클래스에서 제공하는 charAt()라는 메소드를 통해 0번지에 있는 문자를 가져옴
		char op = str.charAt(0);
		System.out.println("입력 문자 : " + op);
		scan.close();
	}

}