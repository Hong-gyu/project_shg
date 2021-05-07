package day9;

public class CardGame3_user {

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

	// 내가 한 거
	// public static boolean poker(int min, int max, int r){
	// 		int arr[]=new int[7]; // 랜덤한 수 7개이 있는 배열 
	// 		for(i=1;i<=arr.length;i+=1){ // 랜덤한 수 7번 반복
	//	 		int r = (int)(Math.random()*(max * (max-min+1)+min); // 랜덤한 수 생성
	//			arr[i]=r; // 생성된 랜덤 수를 배열에 저장
	// 		}
	// 		int count = 1;
	// 		boolean res = false;
	// 		for(int i = 0; i<arr.length-1; i+=1){
	// 			if(arr[i]==arr[i+1]{
	//				count+=1;
	// 			} else {
	// 			 if(count==4){
	//				res=true;
	//			}
	// 			count=1;
	//			}
	// 		}
	//		if(count==4){
	//			res=true;
	// 		}
	// 		if(res){ // 배열에 있는 숫자 중 같은수가 4개
	// 				sysout.("포커"); // 포커
	// 		} else { // 없으면
	// 				다음레벨
	// 		}
	// }

	
}
