package day18;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest3 {

	public static void main(String[] args) {
		// 중복되지 않은 6개의 수를 랜덤으로 생성하여 저장한 후 출력하는 코드 작성(단, 숫자의 범위는 1 ~ 45)
		
		HashSet<Integer> set=new HashSet<Integer>();
		while(set.size() < 6) {
			// Integer min = 1;
			// Integer amx = 45;
			// Integer num = Math.random()*(max-min+1)+min); 
			set.add((int)(Math.random()*45)+1);
		}
		System.out.print("로또 : ");
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}

	}

}
