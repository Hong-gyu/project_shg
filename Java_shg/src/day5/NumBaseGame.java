package day5;

import java.util.Scanner;

public class NumBaseGame {

	public static void main(String[] args) {
		/* 숫자야구 게임
		 * 1 ~ 9사이의 중복되지 않은 3개의 정수를 랜덤으로 생성
		 * B = 숫자는 있지만 위치가 다른 경우
		 * S = 숫자도 있고 위치도 같고
		 * O = 일치하는 숫자가 하나도 없음
		 * 예시 : 395(컴퓨터가 만든 숫자)
		 * 입력하세요(1~9) : 123
		 * 1B
		 * 입력하세요(1~9) : 456
		 * 1B 
		 * 입력하세요(1~9) : 345
		 * 2S
		 * 입력하세요(1~9) : 359
		 * 1S 2B
		 * 입력하세요(1~9) : 678
		 * O
		 * 입력하세요(1~9) : 395
		 * 3S
		 * 정답입니다.
		 * */
		
		int [] com = new int[3];
		int [] user = new int[3];
		int strike=0, ball=0;
		int cnt=0;
		int min=0, max=10;
		int r;
		int i, j, k;
		boolean isDuplicated;
		
		// 컴퓨터가 랜덤으로 중복되지 않은 세 수를 생성
		// 배열에 3개 저장될때까지 반복
		while(cnt<3) {
			// min ~ max 사이의 랜덤한 숫자 생성
			r=(int)(Math.random()*(max-min+1)+min);
			// 배열의 0번지 부터 cnt개 비교해서 중복여부를 확인
			isDuplicated = false; // 조건문 안에 넣어야 됨 (밖에다 하면 중복된 수가 발생했을시 무한루프에 빠짐)
			for(i=0;i<cnt;i+=1) {
				// 중복체크하여 중복되면 중복됐다고 저장
				// 랜덤한 숫자와 배열의 i번지 값이 같으면 isDuplicated true로
				if(r==com[i]) {
					isDuplicated = true;
				}
			}
			
			// 중복되지 않으면 배열에 저장
			if(!isDuplicated) {
				com[cnt]=r;
				cnt+=1;
			}
		}
		// 컴퓨터가 생성한 숫자를 출력(테스트용)
		for(i=0;i<cnt;i+=1) {
			System.out.print(com[i]+" ");
		}
		// 게임을 시작해서 3S 나올때까지 반복
		Scanner scan=new Scanner(System.in);

		System.out.println(" ");
		do {
			// 사용자가 세 수 입력(중복되지 않는다고 가정)
			System.out.print("입력하세요 : ");
			for(i=0; i<user.length; i+=1) {
				user[i]=scan.nextInt();
				
			}
			strike=0;
			ball=0;
			
			// com 배열과 user 배열에서 같은 번지를 비교하여 같은 숫자가 있으면 strike 증가
			for(i=0;i<=cnt;i+=1) {
				if(com[i]==user[i]) {
					strike+=1;
				}
			}
			
			// com 배열과 user 배열에서 다른 번지를 비교하여 같은 숫자가 있으면 ball 증가
			
			// com[0]과 user[1], user[2]와 비교
			// com[1]과 user[0], user[2]와 비교
			// com[2]과 user[0], user[1]와 비교
			
			for(i=0;i<com.length;i+=1) {
				for(k=0;k<user.length;k+=1) {
					if(i==k) {
						continue;
					}
					if(com[i]==user[k]) {
						ball+=1;
					}
				}
			}
			
			// 볼과 스트라이크 갯수를 셈
			// 볼과 스트라이크와 아웃을 판별하여 출력
			
			if(strike!=0) {
				System.out.print(strike+"S");
			}
			if(ball !=0) {
				System.out.print(ball+"B");
			}
			// 볼이 0 이고 스트라이크가 0이면 o 출력
			if(ball ==0 && strike == 0) {
				System.out.print("O");
			}
			System.out.println();

		} while (strike !=3);
		System.out.println("정답입니다.");
		scan.close();
		
	}

}
