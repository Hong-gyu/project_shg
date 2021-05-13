package day13;

public class PolymorphismTest {

	public static void main(String[] args) {
		Car2 c = new Car2();
		c.frontlLeftTire=new KumhoTire();
		c.frontlRightTire=new KumhoTire();
		c.backlLeftTire=new HankookTire();
		c.backlRightTire=new HankookTire();
//		=> 부모클래스에 자식클래스를 활용하여 사용할 수 있다 -> 필드(멤버변수)의 다형성
		// 사고 후 앞 왼쪽 바퀴를 한국 타이어로 교체
		c.frontlLeftTire=new HankookTire(); // -> 필드(멤버변수)의 다형성
		boolean isOk = confirm(c.frontlLeftTire);
		boolean isOk2 = confirm(c.frontlRightTire);
		
	}
	/* 기능 : 타이어에 이상이 있는지 없는지 알려주는 메소드 
	 * 매개변수 : 타이어 -> Tire t
	 * 리턴타입 : 이상여부 -> 참/거짓 -> boolean
	 * 메소드명 : confirm */
	

	// 매개변수의 다형성을 확인하는 예제
	/* A instanceof B : A를 B로 타입변환 할 수 있는지를 확인. 할 수 있으면 결과값이 true. 할 수 없으면 결과값이 false
	 * instanceof 를 이용하면 매개변수의 다형성을 처리하기가 쉬워진다.*/
	public static boolean confirm(Tire t) {
		// 타이어 t가 한국타이어면 예외가 발생하지 않고
		// 금호 타이어면 예외 발생
		// HankookTire ht = (HankookTire) t;
		if(t instanceof HankookTire) {
			HankookTire ht = (HankookTire)t;
			System.out.println("한국타이어 검사 끝!");
			// 한국타이어 검사하는 코드 작성
		} else if(t instanceof KumhoTire) {
			KumhoTire kt = (KumhoTire) t;
			// 금호타이어 검사하는 코드 작성
			System.out.println("금호타이어 검사 끝!");
		}
		return false;
	}
}

class Car2 {
	// 멤버변수(필드)의 다형성
	public Tire frontlLeftTire; // 부모타이어
	public Tire frontlRightTire;
	public Tire backlLeftTire;
	public Tire backlRightTire;
}

class Tire {}

class KumhoTire extends Tire {} // 자식타이어
class HankookTire extends Tire {} // 자식타이어

