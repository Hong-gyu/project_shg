package day8;

public class Test8_4 {

	public static void main(String[] args) {
		// 1부터 10까지 한 줄로 출력되는 코드
		
		for(int i = 1; i <=10 ; i+=1) {
			System.out.print(i+" ");
			}
					
		/* 다음과 같이 출력되도록 코드 작성 
		 * 1 2 3 4
		 * 5 6 7 8
		 * 9 10 */
		System.out.println("\n-------------");
		// 1~10까지의 숫자를 배열에 저장하고 배열 값을 출력하는데 4의 배수 이면 줄을 바꿔서 출력
	
		for(int i = 1; i <=10 ; i+=1) {
			System.out.print(i+" ");
			if(i%4==0) {
				System.out.println();
			}
		}
		System.out.println("\n-------------");
		// 1~10까지의 숫자를 배열에 저장하고 배열 값을 출력하는데 4의 배수 이면 줄을 바꿔서 출력
	
		for(int i = 1; i <=12 ; i+=1) {
			System.out.print(i);
			if(i%4==0) {
				System.out.println("");
			} else {
				System.out.print(",");
			}
		}
		System.out.println("\n-------------");
		// 1~10까지의 숫자를 배열에 저장하고 배열 값을 출력하는데 4의 배수 이면 줄을 바꿔서 출력
	
		for(int i = 1; i <=12 ; i+=1) {
			System.out.print(i);
			String str=i%4==0?"\n":",";
			System.out.print(str);
		}
		System.out.println("\n-------------");
		// 다음과 같이 출력되도록 코드 작성
		// 2 1 4 3
		// 6 5 8 7
		// 10 9 12 11
	
		for(int i = 1; i<=12 ; i+=1) {
			if(i%2==0) {
				System.out.print(i-1+" ");
			} else {
				System.out.print(i+1+" ");
			}
			if(i%4==0) {
				System.out.println();
			}
		}
	}
}
