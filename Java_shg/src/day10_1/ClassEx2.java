package day10_1;

import day10.A; // day10 패키지에 있는 A를 가져오려 함. 
import day10.B; // day10 패키지에 있는 B를 가져오려 함.
import day10.C; // day10 패키지에 있는 C를 가져오려 함. 패키지가 다르기때문에 day10에 있는 것을 가져올 수 없음
import day10.D; // day10 패키지에 있는 D를 가져오려 함.
import day10.ClassEx1; // day10 패키지에 있는 ClassEx1을 가져오려한다.
public class ClassEx2 {

	public static void main(String[] args) {
		//
		
		A a = new A();
		a.num = 10; // public  : 클래스 A 와 ClassEx1은 같은 패키지에 있기 때문에 에러가 발생하지 않음
		B b = new B();
		// b.num = 10; // protected : 클래스 B 와 ClassEx2는 다른 패키지에 있기 때문에 에러가 발생
		C c = new C();
		// c.num = 10; // default : 클래스 C와 ClassEx2는 다른 패키지에 있기 때문에 에러가 발생
		D d = new D();
		// d.num = 10; 에러발생 -> num의 접근제한자가 private 이기 때문
		


	}

}
