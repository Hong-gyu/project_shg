package day5;

public class Array1 {

	public static void main(String[] args) {
		/* 배열 선언 */
		int [] arr1;
		int arr2 [];
		
		int arr3[] = new int[5]; // 일반적으로 많이 사용
		int arr4[] = {1,2,3,4};
		int arr5[] = new int[] {1,2,3,4};
		
		int [] arr6 = new int[5]; // 일반적으로 많이 사용
		int [] arr7 = {1,2,3,4};
		int [] arr8 = new /*new는 연산자*/ int[] {1,2,3,4};

		int [] arr9, arr10; // arr9 : 배열, arr10 : 배열
		int arr11[], arr12; // arr11[] : 배열, arr12 : 일반변수
		
		// 객체 : new 연산자를 통해 만들어진 저장공간
		// 변수 : 일반 타입으로 만들어진 저장공간
		// 배열의 시작 번지는 0번지(예:0,1,2,3,4  5번지 배열의 마지막 번지는 전체크기-1)
		// 배열의 값 가져오기 : 배열명[번지]
		// 예) 배열의 첫번째 값을 가져오고 싶다 -> 배열명[0]
		
		System.out.println(arr8[2]);
		
		System.out.println("");
		// 배열 arr6의 두번째에 10을 저장
		arr6[1]=10;
		// 배열 arr6의 두번째 값을 콘솔 출력
		System.out.println(arr6[1]);
		
	}

}
