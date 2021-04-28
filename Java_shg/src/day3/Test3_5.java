package day3;

public class Test3_5 {

	public static void main(String[] args) {
		/*월의 마지막 일 수를 출력하는 예제를 switch문으로 작성하세요
		 * 31일 : 1, 3, 5, 7, 8, 10, 12
		 * 30일 : 4, 6, 9, 11
		 * 28일 : 2*/

		int month = 2;
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12 : 
			System.out.println("입력한 월의 마지막 일 수는[31일] 까지 있습니다.");
			break;
		case 2 : 
			System.out.println("입력한 월의 마지막 일 수는[28일] 까지 있습니다.");
			break;
		case 4 : case 6 : case 9 : case 11 : 
			System.out.println("입력한 월의 마지막 일 수는[30일] 까지 있습니다.");
			break;
		default :
			System.out.println("잘못 입력하셨습니다");		
			}

	}
	
}
