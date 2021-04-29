package day4;

public class For8 {

	public static void main(String[] args) {
		/* a부터 z까지 출력하는 코드 작성
		 * 반복횟수 = 초기값은 a부터 시작하고 z까지 1단계씩 증가
		 * 규칙성 = 출력
		 * 반복문 종료 후 : 없음
		 * */
		int i;
		char op = 'A';
		
		for(op='A', i=0; i<=25; i+=1) {
			System.out.print((char)(op+i)+" "); // 그냥 (ch+i)를 치면 숫자 96 이후로 나오니까 문자 값으로 강제변환 해줘야 함
		}
	
		System.out.println("");
		
		char ch;
		for(ch='a'; ch<='z'; ch+=1) {
			System.out.print(ch+" ");
		}
		
	}

}
