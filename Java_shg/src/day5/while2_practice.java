package day5;

public class while2_practice {

	public static void main(String[] args) {
		/* while문과 continue를 이용한 짝수 출력
		 * */

		int i=1, num=10;
		while(i<=num) {
			if(i%2!=0) {
				i+=1;
				continue;
			}
			System.out.print(i+" ");
			i+=1;
		}
		
		System.out.println();
		
		i=0;
		while(++i<=num) {
			if(i%2!=0) {
				continue;
			}
			System.out.print(i+" ");
		}
		
		System.out.println();
		// for문으로 한 예제를 while문으로, while문 한 예제를 for문으로 바꿔보는 연습
		
	}

}
