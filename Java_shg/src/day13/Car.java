package day13;

public class Car {
	/* 전원, 기어, 차종, 제조사
	 * 멤버변수 private
	 * */
	
	// 멤버변수 선언
	// 전원 on - off
	private boolean power; // boolean 기본값 false
    // 수동 : 1,2,3,4,5,R  자동 : P, R, N, D
	private char gear;
	private String type, company;
	
	// getter, setter
	public boolean isPower() {
		return power;
	}
	public char getGear() {
		return gear;
	}
	public void setGear(char gear) {
		this.gear = gear;
	}
	public String getType() {
		return type;
	}
	public String getCompany() {
		return company;
	}
	
	// 메소드 구현
	public void turnOn()  {power=true;}
	public void turnOff() {power=false;}
	public void print () {
		System.out.println("전원 : " + power);
		System.out.println("기어 : " + gear);
		System.out.println("차종 : " + type);
		System.out.println("제조사 : " + company);
	}
	
	// 생성자
	public Car(String type, String company) {
		this.type=type;
		this.company=company;
	}
	
}
