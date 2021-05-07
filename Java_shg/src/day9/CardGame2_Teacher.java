package day9;

public class CardGame2_Teacher {

	public static void main(String[] args) {
		/* 배열에 같은 숫자 3개가 있으면 있는 숫자들을 배열에 저장하여 알려주는 코드 작성
		 * 예시 : {1,1,1,2,3,4,5} -> 1
		 * 예시 : {1,1,1,2,2,2,5) -> 1, 2
		 *  */
		
		// 같은 숫자 3개가 있는지 없는지
		// 7개짜리 배열에서 같은 숫자의 수 판별
		// 0번지와 1번지 비교 있으면 count 1 증가 없으면 0 초기화
		// 1번지와 2번지 비교 있으면 count 1 증가 없으면 0 초기화
		// 2번지와 3번지 비교 있으면 count 1 증가 없으면 0 초기화	
		// 3번지와 4번지 비교 있으면 count 1 증가 없으면 0 초기화
		// 4번지와 5번지 비교 있으면 count 1 증가 없으면 0 초기화
		// 5번지와 6번지 비교 있으면 count 1 증가 없으면 0 초기화
		// 6번지와 7번지 비교 있으면 count 1 증가 없으면 0 초기화
		// 비교 해서 있는 숫자들을 배열에 저장하여 알려줌 -> 저장할 새로운 배열이 필요?
		
		int [] arr = new int [] {1,2,3,3,4,4,4}; // 비교 배열
		int count = 1; // 같은 숫자가 있는 갯수(같은수 값 초기화)
		int res = 0; // 내가 못한 부분
		int [] triple = new int [2]; // 내가 못한 부분
		int num = 0; // 내가 못한 부분 
		for(int i=0; i<arr.length-1; i+=1) { 
			if(arr[i]==arr[i+1]) { // 배열 i와 배열 i+1 이 같을 경우
				count+=1; // count 1 증가
				num = arr[i]; // 내가 못한 부분
			} else { // 아니면
				if(count==3) {
					triple[res]=num;  // 내가 못한 부분
					res+=1;
				}
				count = 1;  // count 1 초기화
			}
		}
		if(count==3) {
			triple[res]=num;  // 내가 못한 부분
			res+=1;	
		}
		if(res==0) {   // 내가 못한 부분
			System.out.println("트리플 없음");   // 내가 못한 부분			
		} else {   // 내가 못한 부분
			for(int i = 0 ; i<res ; i+=1) {   // 내가 못한 부분
				System.out.println(triple[i]+ " ");   // 내가 못한 부분
			}   // 내가 못한 부분
			System.out.println();   // 내가 못한 부분
		}

	}

}
