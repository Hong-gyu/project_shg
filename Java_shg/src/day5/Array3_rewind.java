package day5;

public class Array3_rewind {

	public static void main(String[] args) {
		/* 정수 num 의 약수를 배열에 저장한 후 출력하는 코드 작성
		 * 단, 약수의 갯수가 10개를 넘어가는 경우 최대 10개만 출력
		 * */
		
		/* 반복횟수 : i는 1부터 num보다 작거나 같을때까지 1씩 증가
		 * 규칙성 : num를 i로 나누었을때 나머지가 0과 같으면 배열 cnt번지에 i를 저장한 후 cnt 증가 cnt가 10과 같으면 반복문 종료
		 * 반복문 종료 후 : 배열에 있는 값을 0번지부터 cnt개 출력
		 * */
		
		int i, num=12;	
		int [] arr = new int[10];
		int cnt=0;
		for(i=1; i<=num; i+=1) {
			if(num%i==0) {
				arr[cnt]=i; 
				cnt+=1;
				if(cnt==10){
				break;
				}
			}
		}
		for(i=0;i<cnt;i+=1) { // 배열에 있는 값을 0번지부터 cnt개 출력
			System.out.print(arr[i]+" ");
		}
		
		

	}

}
