package day5;

public class Array4_rewind {

	public static void main(String[] args) {
		/* 1~10사이의 정수 3개를 랜덤으로 생성하여 배열에 저장한 후 생성된 값들이 중복되었는지 안되었는지 확인하는 코드 작성
		 * 예시
		 * 랜덤 : 3 8 2
		 * 중복되지 않음
		 * 랜덤 : 2 8 8
		 * 중복
		 * 
		 * 
		 * 반복횟수 : i는 1부터 10 사이의 정수
		 * 규칙성
		 * 	- 3개를 랜덤으로 생성
		 * 	- 배열에 저장 후 출력
		 * 반복문 종료 후
		 * 	- 출력된 숫자가 중복되면 중복
		 * 	- 출력된 숫자가 중복되지 않으면 중복되지 않음
		 * 
		 * num1==num2 r1==r2 || r1==r3 || r2==r3
		 * num1==num3 r1==r3
		 * num2==num3 r2==r3
		 * */

		int min=1, max=10;  // 1부터 10사이
		int i, r, k;
		System.out.print("랜덤 : ");
		int [] arr=new int[3]; // 3개 수 배열
		for(i=0;i<arr.length;i+=1) { // i는 1부터 10 사이의 정수
			r = (int)(Math.random()*(max-min+1)+min); // * 	- 3개를 랜덤으로 생성
			arr[i] = r; // * 	- 배열에 저장 후 생성
			System.out.print(arr[i]+" ");
		}
		
		boolean isDuplicated = false;
		
		for(i=0;i<arr.length-1;i+=1) {
			for(k=i+1;k<arr.length;k+=1) {
				if(arr[i]==arr[k]){
					isDuplicated = true;
				}
			}
		}
		if(isDuplicated) {
			System.out.println("중복");
		} else {
			System.out.println("중복아님");
		}
	}
}
