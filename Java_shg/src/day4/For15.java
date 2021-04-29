package day4;

public class For15 {

	public static void main(String[] args) {
		/* 100 이하의 모든 소수를 출력하는 코드 작성
		 * 소수 : 2, 3,
		 * */
		int num, i;
		int cnt = 0;
		for(num=1;num<=100;num+=1) {
			for(i=1, cnt=0;i<=num;i+=1) {  // i는 1부터 i는 num보다 작거나 같을때까지 i는 1씩 증가 // cnt=0 변수 초기화 해줘야 소수들을 계속 출력함
				if(num%i==0) {
						cnt+=1;
					}
				}
			if(cnt==2) {
				System.out.print(num+" ");
			} 
		}
		
	}

}
