package day10;

/* 2차원 좌표 평면의 점을 나타내는 클래스 : Point
 * 멤버 변수 : x좌표, y좌표
 * 멤버 메소드 : 좌표를 출력하는 기능, 좌표를 이동하는 기능 */
public class Point {
	private int x, y;

	/* 기능    : 멤버변수 x,y좌표를 출력하는 메소드
	 * 매개변수 : 없음(멤버변수 x,y를 이용하기 때문)
	 * 리턴타입 : 없음 => void
	 * 메소드명 : print
	 * */ 
	public void print() {
		// 멤버 변수를 멤버 메소드에서 사용할 경우 따로 선언은 하지 않아도 됨.
		System.out.println("("+ x +","+ y +")");
	}
	
	/* 기능 : 지정된 좌표로 이동하는 메소드
	 * 매개변수 : (멤버변수 x, y 이용), 지정된 좌표 x1/y1
	 * 리턴타입 : 없음 
	 * 메소드명 : move
	 * */
	public void move(int x1, int y1) {
		x=x1;
		y=y1;				
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	/* 초기 x,y 좌표가 주어지면 x1, y1으로 주어지면 주어진 x, y좌표로 멤버변수를 초기화 하는 생성자*/
	public Point(int x1, int y1) {
		x = x1;
		y = y1;
	}
	public Point() {
		
		
	}

}