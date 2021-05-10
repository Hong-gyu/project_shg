package day10;

public class Circle {
	/* 도형 원을 클래스로 만드려고 한다.
	 * 멤버변수 : 중심점(x,y), 반지름
	 * 멤버 메소드 : 원 정보 출력, 중심점 이동, 반지름 변경
	 * 위의 내용을 토대로 Circle 클래스를 생성하고 멤버변수를 선언해보세요 */
	
	// 중심좌표(x,y), 반지름(radius)
	// private int x, y, radius;
	
	
	private Point center = new Point();
	private int radious;
	
	/* 기능 : 원의 중심점을 이동하는 메소드  
	 * 매개변수 : 이동할 중심점의 위치 x y -> int x, int y
	 * 리턴타입 : 없음 => void
	 * 메소드명 : move
	 * */

	public void move(int x, int y) {
		// center의 x,y좌표를 매개변수 x,y로 이동시키는 코드
		center.move(x, y);
	}
	
	/* 기능 : 원의 정보를 출력하는 메소드
	 * 매개변수 : 없음
	 * 리턴타입 : void
	 * 메소드명 : print
	 * */
	public void print() {
		/* 다음과 같이 출력되도록 코드를 작성하세요
		 * 중심점 : (?,?)
		 * 반지름 : ?  */
		System.out.print("중심점 : ");
		center.print();
		System.out.print("반지름 : ");
	}
	
	
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public int getRadious() {
		return radious;
	}
	// 반지름의 길이를 수정하는 메소드(setter에서 이미 만들어져있기 때문에 추가로 만들 필요 없음)
	public void setRadious(int radious) {
		this.radious = radious;
	}


}
