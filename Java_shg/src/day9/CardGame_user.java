package day9;

public class CardGame_user {

	public static void main(String[] args) {
		/* 배열에 같은 숫자 3개가 있는지 없는지 알려주는 코드
		 * */
		
		// 같은 숫자 3개가 있는지 없는지
		// 5개짜리 배열에서 같은 숫자의 수 판별 -> 같은수가 3개면 있음 // 같은 수가 1~2개 또는 4~5개면 없음
		// 0번지와 1번지 비교 있으면 count 1 증가 없으면 0 초기화
		// 1번지와 2번지 비교 있으면 count 1 증가 없으면 0 초기화
		// 2번지와 3번지 비교 있으면 count 1 증가 없으면 0 초기화	
		// 3번지와 4번지 비교 있으면 count 1 증가 없으면 0 초기화
		// 전부 다 비교한 후 결과값 count가 3가 되면 "있음", 없으면 "없음" 출력
		
		int [] arr = new int [] {1,1,1,1,3,4,5};
		int count = 1; // 같은 숫자가 있는 갯수(같은수 값 초기화)
		boolean res = false;
		for(int i=0; i<arr.length-1; i+=1) { 
			if(arr[i]==arr[i+1]) { // 배열 i와 배열 i+1 이 같을 경우
				count+=1; // count 1 증가
			} else { // 아니면
				if(count==3) {
					res=true;
				}
				count = 1;  // count 1 초기화
			}
		}
		if(count==3) {
			res=true;	
		}
		if(res){
			System.out.println("트리플 있음");
		} else {
			System.out.println("트리플 없음");
		}
	}

}
