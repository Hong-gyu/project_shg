package day8;

public class Test8_2 {

	public static void main(String[] args) {
		/* 다음과 같이 출력되도록 작성하세요
		 * a
		 * ab
		 * abc
		 * abcd
		 * abcde
		 * ...
		 * abc...xyz
		 * */ 
		char ch;
		for(ch='a';ch<='z';ch+=1) {
			System.out.print(ch);
		}		
		
		
		for(ch='a';ch<'z';ch+=1) {
			for(int i=1;i<=9;i+=1) {
				System.out.print(ch+i);
			}
			
		}
		char i, k;
		for(i='a';i<='z';i+=1) { // 줄이 바뀌면 여기를 바꾸고
			for(k='a';k<=i;k+=1) {  // 별의 갯수가 달라지면 여기를 바꾸고
				System.out.print(k);
			}
			System.out.println();
		}
		String str = "";
		for(i = 'a'; i <= 'z'; i+=1) {
			str += i;
			System.out.println(str);
		}
	}

}
