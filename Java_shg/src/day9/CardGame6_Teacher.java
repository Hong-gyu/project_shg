package day9;

public class CardGame6_Teacher {

	public static void main(String[] args) {
		/* 카드 게임
		 *  1) 실제 포커 게임은 모양과 숫자를 다 고려해야 하지만 여기에선 숫자만 고려, 카드는 7장
		 *  2) 카드는 1에서 13이 4개씩(하트, 다이아, 세잎, 스페이스)
		 *  - 포커 : 같은 숫자가 4개
		 *  - 풀하우스 : 트리플 1개, 원페어 1개(또는 투페어 1개) // 트리플 2개
		 *  - 스트레이트 : 연속된 숫자가 5개 이상
		 *  - 트리플 : 같은 숫자 3개 
		 *  - 투 페어 : 같은 숫자 2개씩 2개 -> 페어가 2개
		 *  - 페어 : 같은 숫자가 1개
		 *  - 탑 : 위의 모든 조건이 없는 경우 가장 큰 수
		 * */		
		
		// 카드가 주어지면 해당 카드의 가장 큰 등급을 출력하는 코드 작성
		// 아래와 같이 풀하우스, 트리플, 페어로 판별 가능 한 경우 풀하우스 하나만 출력
		
		int [] arr = new int [] {1,2,3,4,5,6,7}; // 비교 배열
		
		System.out.println("포커 : "+poker(arr));
		
		System.out.println("트리플 : "+triple(arr));
		
		System.out.println("원페어 : "+onePair(arr));
		
		System.out.println("투페어 : "+twoPair(arr));
		
		System.out.println("풀하우스 : "+fullHouse(arr));
		
		System.out.println("스트레이트 : "+straight(arr));

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
	 * 기능 : 배열에 트리플이 있으면 해당 숫자를 알려주고 없으면 0을 알려주는 메소드
	 * 매개변수 : 배열 => int [] card
	 * 리턴타입 : 트리플인 숫자 => 정수 => int
	 * 메소드명 : triple
	 * */

	public static int triple(int [] card) {
		int [] res = tripleList(card);
		if(res==null || res.length==2){  		// 트리플이 아닌 경우
			return 0;
		}
		return res[0];
	}

	/* 페어를 확인 할 수 있는 메소드를 정리해보세요. 페어가 있다면 해당 페어의 숫자들을 알려주고, 없으면 null을 알려주는 기능을 정리하고 구현
	 * 기능 : 배열에 페어가 있으면 페어의 숫자들을 알려주고, 없으면 null을 알려주는 메소드
	 * 매개변수 : 배열 => int [] card
	 * 리턴타입 : 페어의 숫자들 => 정수 배열 int []
	 * 메소드명 : pairList
	 * */
	 
	public static int[] pairList(int [] card) {
		int count = 1; // 같은 숫자가 있는 갯수(같은수 값 초기화)
		int [] pairList = new int [3];
		int num = 0; 
		int res = 0;
		for(int i=0; i<card.length-1; i+=1) { 
			if(card[i]==card[i+1]) { // 배열 i와 배열 i+1 이 같을 경우
				count+=1; // count 1 증가
				num = card[i];
			} else { // 페어이면
				if(count==2) {
					pairList[res]=num;
					res+=1;
				}
				count = 1;  // count 1 초기화
			}
		}
		if(count==2) {
			pairList[res]=num;
			res+=1;	
		}
		if(res==0) {
			return null;			
		} else if(res==1) {
			return pairList;
		} else {
			int [] tmp = new int[2];
			tmp [0] = pairList[0];
			return tmp;
		}
	}
	
	/* 원페어를 확인 할 수 있는 메소드를 정리해보세요.
	 * 기능 : 배열에 원페어가 있으면 해당 숫자를 알려주고 없으면 0을 알려주는 메소드
	 * 매개변수 : 배열 => int [] card
	 * 리턴타입 : 페어인 숫자 => 정수 => int
	 * 메소드명 : onePair
	 * */
	
	public static int onePair(int [] card) {
		int [] res = pairList(card);
		if(res==null && res.length==1) {
			return res[0];
		}
		return res[0];
	}
	/* 투페어를 확인 할 수 있는 메소드를 정리해보세요.
	 * 기능 : 배열에 투페어가 있으면 해당 숫자를 알려주고 없으면 null을 알려주는 메소드
	 * 매개변수 : 배열 => int [] card
	 * 리턴타입 : 페어인 숫자들 => 정수 배열 => int []
	 * 메소드명 : onePair
	 * */
	
	public static int [] twoPair(int [] card) {
		int [] res = pairList(card);
		if(res==null || res.length==1) {
			return null;
		}
		return res;
	}

	/* 풀하우스를 확인 할 수 있는 메소드를 정리해보세요
	 * 기능 : 풀하우스가 있으면 풀하우스 숫자를, 없으면 0을 알려주는 메소드
	 * 예시 : 2, 2, 2, 3, 3, 4, 5 => 2 풀하우스
	 * 		2, 2, 2, 9, 9, 9, 10 => 9 풀하우스
	 * 매개변수 : 배열 => int []card
	 * 리턴타입 : 풀하우스의 숫자 => 정수 => int
	 * 메소드명 : fullHouse 
	 * */
	
	public static int fullHouse(int [] card) {
		// 트리플이 없으면 풀하우스가 될 수 없기 때문에 0을 리턴
		int [] triple = tripleList(card);
		if(triple == null) {
			return 0;
		}
		// 1) 배열에 트리플이 2개이면 풀하우스		// tripleList 이용
		if(triple.length==2) {
			if(triple[0]>triple[1]) {
				return triple[0];
			}
			return triple[1];
		}
		// 2) 배열에 트리플이 2개가 아니면 배열에 트리플이 1개이고 페어가 1개 이상이면 풀하우스 // triple 와 pairList 이용
		int [] pair = pairList(card);
			if(pair !=null) {
				return triple[0];
			}
		
		return 0;
	}
		
	/* 스트레이트를 확인 할 수 있는 메소드를 정리해보세요
	 * 기능 : 스트레이트가 있으면 스트레이트 숫자를, 없으면 0을 알려주는 메소드
	 * 원래는 마운틴이라고 해서 10, 11, 12, 13, A(14) 가 있는데 여기에서는 제외
	 * 백스트레이트라고해서 1,2,3,4,5 가 있는데 여기에서는 그냥 5 스트레이트로 판단
	 * 매개변수 : 배열 => int [] card
	 * 리턴타입 : 스트레이트의 숫자 => 정수 => int
	 * 메소드명 : straight 
	 * */
	
	public static int straight(int []card) {
		int count = 1; // count 초기값 1
		int num = 0;
		for(int i = 0; i<card.length-1 ; i+=1) { // 초기화, 범위, 증감식
			if(card[i]+1==card[i+1]) { // card i번지 배열의 숫자와 card i+1번지 배열의 숫자가 연속되는지 
				count+=1;			// 같으면 count 1 증가
				num = card[i+1];	// 비교한 두 수 중 두번째 숫자를 num에 저장
			} else {
				if(count >=5) {
					return num;
				}
				count=1;			// 아무것도 아니면 count 1로 초기화
			}
		}
		// 스트레이트가 마지막 숫자를 포함할 때
		if(count >=5) {
			return num;
		}
		return 0;
	}
}
