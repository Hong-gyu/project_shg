package day3;

public class Switch1 {

	public static void main(String[] args) {
		/* Switch 문을 이용한 홀짝판별*/
		int num = 11;
		
		switch(num % 2) {
		case 0:
			System.out.println("짝수");
			break;
		default: // case1 로 써도 됨
			System.out.println("홀수");
		}

	}

}
