package day5;

public class Star1_homework {

	public static void main(String[] args) {
		/* ****	i = 1	*=4
		 * ****	i = 2	*=4
		 * ****	i = 3	*=4
		 * ****	i = 4	*=4
		 * ****	i = 5	*=4
		 */
		
		int i, j, k;
		for(k=1;k<=5;k+=1) { // 줄이 바뀌면 여기를 바꾸고
			for(i=1;i<=4;i+=1) {  // 별의 갯수가 달라지면 여기를 바꾸고
				System.out.print("*");
			}
			System.out.println();
		}
		
		/* *		k=1		* = 1
		 * **		k=2		* = 2
		 * ***		k=3		* = 3
		 * ****		k=4		* = 4				
		 * *****	k=5		* = 5
		 * 
		 * */
		System.out.println();
		
		for(k=1;k<=5;k+=1) { // 줄이 바뀌면 여기를 바꾸고
			for(i=1;i<=k;i+=1) {  // 별의 갯수가 달라지면 여기를 바꾸고
				System.out.print(("*"));
			}
			System.out.println();
		}
		
		/*     ****		k=1		* = 1
		 *     ****		k=2		* = 2
		 *     ****		k=3		* = 3
		 *     ****		k=4		* = 4				
		 *     ****		k=5		* = 5
		 * 
		 * */
		
		System.out.println();
		
		for(k=1;k<=5;k+=1) { // 줄이 바뀌면 여기를 바꾸고
			for(i=1;i<=4;i+=1) {  // 별의 갯수가 달라지면 여기를 바꾸고
				System.out.print(" ");
			}
			for(i=1;i<=4;i+=1) {  // 별의 갯수가 달라지면 여기를 바꾸고
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*       *	k=1 공=4 *=1
		 *      **	k=2 공=3 *=2
		 *     ***	k=3 공=2 *=3
		 *    ****	k=4	공=2 *=4
		 *   *****	k=5	공=1 *=5
		 * 
		 * */
		
		
		System.out.println();
		
		for(k=1;k<=5;k+=1) { // 줄이 바뀌면 여기를 바꾸고 (출력 줄 수)
			for(i=1;i<=(5-k);i+=1) {  // 별의 갯수가 달라지면 여기를 바꾸고 (콘솔 출력값 AB 에서 A)
				System.out.print((" "));
			}
			for(i=1;i<=k;i+=1) {  // 별의 갯수가 달라지면 여기를 바꾸고 (콘솔 출력값 AB 에서 B)
				System.out.print(("*"));
			}
			System.out.println();
		}
		
		// 연습문제 
		/*     *		k = 1 공 = 8 * = 1
		 *    ***		k = 2 공 = 6 * = 3
		 *   *****		k = 3 공 = 4 * = 5
		 *  *******		k = 4 공 = 2 * = 7
		 * *********	k = 5 공 = 0 * = 9
		 * */
		
		System.out.println();
		
		System.out.println("     *");
		for(k=1;k<=5;k+=1) { // 줄이 바뀌면 여기를 바꾸고 (출력 줄 수)
			for(i=1;i<=(5-k);i+=1) {  // 별의 갯수가 달라지면 여기를 바꾸고 (콘솔 출력값 AB 에서 A)
				System.out.print((" "));
			}
			for(i=1;i<=k;i+=1) {  // 별의 갯수가 달라지면 여기를 바꾸고 (콘솔 출력값 AB 에서 B)
				System.out.print(("*"));
			}
			for(j=0;j<=k;j+=1) {  // 별의 갯수가 달라지면 여기를 바꾸고 (콘솔 출력값 AB 에서 B)
				System.out.print(("*"));
			}
			System.out.println();
		}
		
		/* *********
		 *  *******
		 *   *****
		 *    ***
		 *     *
		 */
		
		System.out.println();
		
		
		for(k=1;k<=5;k+=1) { // 줄이 바뀌면 여기를 바꾸고 (출력 줄 수)
			for(j=1;j<=k;j+=1) {  // 별의 갯수가 달라지면 여기를 바꾸고 (콘솔 출력값 ABC 에서 A)
				System.out.print((" "));
			}
			for(i=1;i<=(5-k);i+=1) {  // 별의 갯수가 달라지면 여기를 바꾸고 (콘솔 출력값 ABC 에서 B)
				System.out.print(("*"));
			}
			for(i=0;i<=(5-k);i+=1) {  // 별의 갯수가 달라지면 여기를 바꾸고 (콘솔 출력값 ABC 에서 C)
				System.out.print(("*"));
			}
			System.out.println();
		}
		

	}
	
}
