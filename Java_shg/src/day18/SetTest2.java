package day18;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SetTest2 {

	public static void main(String[] args) {
		/* 중복되지 않는 5개의 수가 입력 될 때 까지 입력한 후 입력이 완료되면 종료하는 코드
		 * 예시
		 * 정수를 입력하세요 : 1
		 * 정수를 입력하세요 : 2
		 * 정수를 입력하세요 : 3
		 * 정수를 입력하세요 : 4
		 * 정수를 입력하세요 : 1
		 * 정수를 입력하세요 : 2
		 * 정수를 입력하세요 : 3
		 * 정수를 입력하세요 : 5
		 * 입력된 정수 : 12345(출력은 순서에 상관없이)
		 *  */
		HashSet<Integer> set=new HashSet<Integer>();
		Scanner scan=new Scanner(System.in);
		while(set.size() < 5) {
			System.out.print("정수를 입력하세요 : ");
			set.add(scan.nextInt());
			// Integer num = scan.nextInt();
			// set.add(num);
		}
		// System.out.println("입력된 정수 : "+set); - toString 이용한 것
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			// Integer tmp = it.next();
			// System.out.print(tmp + " ");
			System.out.print(it.next() + " ");
		}
		
		scan.close();
		
	}

}
