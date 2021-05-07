package day9;

public class CardGame5_user {

	public static void main(String[] args) {
		/* 카드 게임
		 *  1) 실제 포커 게임은 모양과 숫자를 다 고려해야 하지만 여기에선 숫자만 고려, 카드는 7장
		 *  2) 카드는 1에서 13이 4개씩(하트, 다이아, 세잎, 스페이스)
		 *  - 포커 : 같은 숫자가 4개
		 *  - 풀하우스 : 트리플 1개, 페어 1개 또는 트리플 2개
		 *  - 스트레이트 : 연속된 숫자가 5개 이상
		 *  - 트리플 : 같은 숫자 3개 
		 *  - 투 페어 : 같은 숫자 2개씩 2개 -> 페어가 2개
		 *  - 페어 : 같은 숫자가 1개
		 *  - 탑 : 위의 모든 조건이 없는 경우 가장 큰 수
		 * */		
		// 랜덤한 수 7개 생성
		int [] arr = new int [] {1,1,1,3,3,3,3}; // 비교 배열
		System.out.println("포커 : "+poker(arr));   // 내가 못한 부분
		int [] tmp = tripleList(arr);
		System.out.print("트리플 : ");
		for(int t : tmp) {
			System.out.print(t+" ");
		}
		System.out.println();
	}
	
	/* 포커를 확인할 수 있는 메소드 정리
	 * 기능
	 * 	선생님 : 배열이 주어지면 배열에 포커가 있는지 확인하여 있으면 해당 숫자를, 없으면 0을 알려주는 메소드
	 * 	나 : 1~13의 숫자 중 7장을 받아 같은수가 4개 인지 확인하여 같은숫자가 4개이면 포커라고 알려주는 메소드
	 * 매개변수
	 * 	선생님 : 배열 => int [] card  
	 * 	나 : 숫자 1 ~ 13, 랜덤한 수 7개 = int min, int max, int r(7개 - 반복문을 통해 생성)
	 * 리턴타입
	 * 	선생님 : 포커의 숫자 => 정수 => int
	 * 	나 : 같은 수가 4개인지 아닌지 => boolean // 인지 아닌지는 boolean 으로 해야 함
	 * 메소드명 : poker
	 * */
	
	// 선생님
	
	public static int poker(int []card) {
		int count=1;
		for(int i = 0; i<card.length-1 ; i+=1) {
			if(card[i]==card[i+1]) {
				count+=1;
				if(count==4) {
					return card[i];
				}
			} else {
				count=1;
			}
		}
		return 0;
	}
	
	/* 트리플을 확인 할 수 있는 메소드를 정리해보세요. 트리플이 있다면 해당 트리플의 숫자를 확인 할 수 있는 메소드 만들기
	 * 기능 : 배열이 주어지면 배열에 트리플이 있는지 확인하여 해당숫자를, 없으면 0을 알려주는 메소드
	 * 매개변수 : 배열 => int [] card
	 * 리턴타입 : 트리플의 숫자들 => 정수 배열 int []
	 * 메소드명 : tripleList
	 * */
	
	public static int[] tripleList(int []card) {
		int count = 1; // 같은 숫자가 있는 갯수(같은수 값 초기화)
		int res = 0;
		int [] triple = new int [2];
		int num = 0; 
		for(int i=0; i<card.length-1; i+=1) { 
			if(card[i]==card[i+1]) { // 배열 i와 배열 i+1 이 같을 경우
				count+=1; // count 1 증가
				num = card[i];
			} else { // 아니면
				if(count==3) {
					triple[res]=num;
					res+=1;
				}
				count = 1;  // count 1 초기화
			}
		}
		if(count==3) {
			triple[res]=num;
			res+=1;	
		}
		if(res==0) {
			return null;			
		} else if(res==2) {
			return triple;
		} else {
			int [] tmp = new int[1];
			tmp [0] = triple[0];
			return tmp;
		}
	}
	
	/* 트리플 기능을 하도록 메소드를 정리하고 코드를 작성하세요.
	 * 기능 : 배열
	 * 매개변수 : 배열 => int [] card
	 * 리턴타입 : 트리플인 숫자 => 정수 => int
	 * 메소드명 : triple
	 * */
	public static int triple(int [] card) {
		int count = 1; // 같은 숫자가 있는 갯수
		int res = 0;
		int [] triple = new int [2];
		int num = 0; 
		for(int i=0; i<card.length-1; i+=1) { 
			if(card[i]==card[i+1]) { // 배열 i와 배열 i+1 이 같을 경우
				count+=1; // count 1 증가
				num = card[i];
			} else { // 아니면
				if(count==3) {
					triple[res]=num;
					res+=1;
				}
				count = 1;  // count 1 초기화
			}
		}	
		if(count==3) {
			triple[res]=num;
			res+=1;	
		}
		if(res==0) {
			System.out.println("트리플 없음");			
		} else {
			for(int i = 0 ; i<res ; i+=1) {
				System.out.println(triple[i]+ " ");
			}
			System.out.println();
		}
		return 0;

	}

}
