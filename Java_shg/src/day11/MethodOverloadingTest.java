package day11;

public class MethodOverloadingTest {

	public static void main(String[] args) {
		Point2 pt = new Point2();
		pt.print();
		pt.move(4, 5);
		pt.print();
		Point2 pt2 = new Point2(10,20);
		pt.move(pt2);
		pt.print();
		System.out.println(1);
		System.out.println("1");
		System.out.println('1');
		
		Point2 pt3 = new Point2();
		Point2 pt4 = new Point2(0,0);
	}
}

class Point2 {
	private int x, y;
	public Point2 () {
		this(0,0); // 해당 클래스의 생성자
	}
	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Point2(Point2 pt) {
		this(pt.x, pt.y);
	}
	public void print() {
		System.out.println("(" + x + "," + y + ")");
	}
	
	/* 기능 : 이동할 x,y좌표가 주어지면 해당 좌표로 이동하는 메소드
	 * 매개변수 : 이동할 좌표 x, y -> int x, int y
	 * 리턴타입 : void
	 * 메소드명 : move */

	public void move(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	/* 기능 : 이동할 좌표가 Point2의 객체로 주어지면 해당 좌표로 이동하는 메소드
	 * 매개변수 : 이동할 좌표 Point2의 객체 => Point2 pt
	 * 리턴타입 : void
	 * 메소드명 : move */
	
	public void move(Point2 pt) { // 현재 pt는 클래스에서 처음 만들어졌지만 앞에 변수타입이 Point2이므로 같은 class Point2 안에서 직접 접근할 수 있음
		x = pt.x; // 여기 못함
		y = pt.y; // 여기 못함
	}
}
