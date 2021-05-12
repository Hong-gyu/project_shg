package day12;

public class InheritanceTest2 {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("010-1***-5***", "로즈골드", "아이폰12");
		sp.print();
		Phone ph = new Phone("010-1***-5***","화이트","초콜릿");
		ph.print();
	}

}

// 폰 클래스(부모클래스)
class Phone {
	private String num;
	private String color;
	private String model;
	public Phone(String num, String color, String model) {
		System.out.println("(부모클래스 생성자) 폰 생성자입니다.");
		this.num = num;
		this.color = color;
		this.model = model;
	}
	public Phone() {
		System.out.println("(부모클래스 기본생성자) 폰 기본생성자입니다.");
	} // 기본생성자
	public void print() { // 부모클래스 객체
		System.out.println("번호 : "+num);
		System.out.println("색상 : "+color);
		System.out.println("모델 : "+model);
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
}

// 스마트폰 클래스(자식클래스)
class SmartPhone extends Phone {
	int camera; // 카메라 화소(단위 : 만)
	public SmartPhone(String num, String color, String model) {
		// 부모클래스의 생성자가 없으면 super();가 생략되어 있음
		// System.out.println(); -> 에러발생 : super() 생성자 위에 코드가 있으면 안됨
		super(num, color, model);
		// this(); -> 에러 발생 : 부모클래스의 생성자를 2번 호출하는 경우
		System.out.println("(자식클래스 생성자) 스마트폰 생성자입니다.");		
	}
	public SmartPhone () {}
}
