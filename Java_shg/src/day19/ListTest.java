package day19;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		// List(Rewind11) - 향상된 for문을 사용하는 예제
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("안녕");
		list.add("Hi");
		list.add("Hello");
		for(String tmp : list) {
			System.out.println(tmp);
		}
	}

}
