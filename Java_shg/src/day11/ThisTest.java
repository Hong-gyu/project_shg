package day11;

public class ThisTest {

	public static void main(String[] args) {
		/* this 객체
		 * 클래스 안에서만 사용(멤버 메소드, 생성자에서 사용 가능)
		 * 객체 인데 '나' 를 의미
		 * 멤버변수의 이름과 매개변수의 이름이 같은 경우 필수로 사용
		 * this () : 해당 클래스의 생성자
		 * this() 생성자는 생성자 안에서 첫줄에 와야한다.
		 * */
		TestA t = new TestA(5);
		t.print();
	}
}
class TestA{
	private int num;
	public TestA(int num) {
		// 멤버변수 파란색 num에 매개변수 갈색 num의 값을 저장
		// 메소드에서 우선순위는 멤버변수보다 매개변수가 더 높음
		// 그래서 멤버변수와 매개변수의 이름이 같을 때 num라고 부르면 매개변수가 불려짐
		// 이름이 다르면 this를 굳이 안써도 됨
		this.num = num; // this를 안붙이면 숫자가 0이 나옴
	}
	public void print() {
		System.out.println("num : " + num);
	}
}
