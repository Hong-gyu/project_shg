package day6;

public class ClassEx1 {

	public static void main(String[] args) {
		int x=1;
		// 일반 변수는 자동으로 초기화되지 않음
		Point1 point = new Point1();
		System.out.println("main의 x : " +x);
		System.out.println("point의 x : "+point.x);
		point.x=3;
		System.out.println("point의 x : "+point.x);
		Point1 point2=new Point1(1,2);
		System.out.println("point2의 x : "+point2.x);

	}

}

// 2차원 좌표 평면의 점을 나타내는 클래스 : Point1
// x좌표, y좌표 => 정수
class Point1{ // 모든 클래스는 생성자가 필수
	int x, y; // 멤버 변수여서 변수명이 파란색으로 표기됨. 멤버변수는 자동으로 초기화 됨
	public Point1() {}
	public Point1(int x1, int y1) {
		this.x=x1;
		this.x=y1;
	}
}
// 클래스에 생성자 코드가 없다면 자동으로 기본 생성자가 추가 됨
// public 클래스명(타입 변수명1, 타입 변수명2, ... ) {
// 		멤버변수명1=변수명1;
//		멤버변수명=변수명2;
//		...
// } 
