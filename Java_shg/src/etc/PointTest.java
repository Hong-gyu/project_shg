package etc;

public class PointTest {

	public static void main(String[] args) {
		/* 좌표 평면의 점을 관리하는 point 클래스를 생성하세요. (10,10)점의 객체를 생성한 후 점의 정보를 출력하는 코드를 main 메소드에 작성하여 테스트하세요.
		 *  - 점 클래스
		 *  - 정보 : x좌표, y좌표
		 *  - 기능 : 좌표 정보 출력
		 * */
		Point pt1 = new Point();
		pt1.setX(10);
		pt1.setY(10);
		pt1.print();
		
		Point pt2 = new Point(10,10);
		pt2.print();
		
	}

}

class Point {
	// 멤버변수
	private int x, y;
	
	// 메소드
	public void print() {
		System.out.println("좌표 : (" + x + ", " + y+") "  );
	}
	
	// 생성자
	public Point() {}
	
	// constructor using fields
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// getter, setter
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
	
	
}
