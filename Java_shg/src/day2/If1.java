package day2;

public class If1 {

	public static void main(String[] args) {
		// if문 예제1 (기본문법1 - 조건식이 참이면 실행문을 실행시키고, 조건식이 거짓이면 아무것도 안함)
		int num = 1;
		
		if(num == 0) {
			System.out.println("0입니다.");
		}

		// if문 예제2 - else (기본문법2 - 조건식이 참이면 실행문 1을 실행하고, 조건식이 거짓이며 실행문 2를 실행)
		if(num == 0) {
			System.out.println("0입니다.");
		} else { 
			System.out.println("0이 아닙니다. ");
		}

		// if문 예제3 - else if (기본문법3 - 조건식1 이 참이면 실행문 1을 실행하고, 조건식1 이 거짓이고, 조건식2가 참이면 실행문2를 실행하고, 조건식1과 2 모두가 거짓이면 실행문 3을 실행) 

		if(num == 0) {
			System.out.println("0입니다.");
		} else if(num==1) { 
			System.out.println("1입니다. ");
		} else { 
			System.out.println("0과 1이 아닙니다. ");
		}	
		
		// if문에서 else나 else if는 있을 수도 있고 없을수도 있지만 if는 필수
	}

}
