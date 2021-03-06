package day15;

public class ClassCastExceptionTest {

	public static void main(String[] args) {
		Figure f1 = new Rect (); // 자동 형 변환
		Figure f2 = new Figure ();
		Rect r1 = (Rect)f1;
		// Rect r2 = (Rect)f2;		// 클래스 타입 변환이 불가능하여 예외 발생
		if(f2 instanceof Rect) {
			Rect r2 = (Rect)f2;
			System.out.println("타입 변환 성공");
		}
	}
}

class Figure {}
class Rect extends Figure {}
