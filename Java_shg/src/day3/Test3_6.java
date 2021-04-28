package day3;

public class Test3_6 {

	public static void main(String[] args) {
		/* 1부터 10까지의 짝수 들의 합을 구하는 예제
		 * i는 1부터 10까지의 짝수
		 * 합*/
		
		int i, sum=0;
		for(i=1; i<=10; i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("1부터 10까지의 짝수들의 합은 "+sum);		
		
		for(i=2; i<=5; i++) {
		}
		System.out.println("1부터 10까지의 짝수들의 합은 "+sum);
		
		for(i=2; i<=10; i+=2) {
			sum=sum+i;
			}
		System.out.println("1부터 10까지의 짝수들의 합은 "+sum); // 여기는 왜 60인지 확인
	}

}
