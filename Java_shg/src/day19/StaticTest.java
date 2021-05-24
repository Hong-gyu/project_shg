package day19;

public class StaticTest {

	public static void main(String[] args) {
		// Rewind6 보충 설명 - 객체 메소드는 클래스 메소드에서 바로 사용할 수 없다.
		// print(); - 바로 사용 불가
		StaticTest st = new StaticTest(); // 객체로 만든 후
		st.print(); // 호출
	}
	
	public void print() {
		System.out.println("안녕하세요");
	}

}
