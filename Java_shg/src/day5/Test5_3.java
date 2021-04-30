package day5;

import java.util.Scanner;

public class Test5_3 {

	public static void main(String[] args) {
		/*콘솔에서 정수를 5번 입력받은 값을 출력하는 코드*/
		
		
		Scanner scan=new Scanner(System.in);
		
		int i, num;
		for(i=1;i<=5;i+=1) {
			System.out.print("입력 : ");

			num=scan.nextInt();
			System.out.println("출력 : "+num);
		}

		/*콘솔에서 정수를 5번 입력받아 저장한 후 저장된 값을 출력하는 코드 */
	
		int [] arr = new int[5]; // arr.length 는 배열의 수 만큼 적용함
		for(i=0;i<5;i+=1) {
			System.out.print("입력 : ");
			arr[i]=scan.nextInt();
			System.out.println("출력 : "+ arr[i]);
			
		}
		
	}

}
