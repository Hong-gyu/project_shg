package day18;

public class MathTest {

	public static void main(String[] args) {
		// abs() : 절대값 구하기
		System.out.println("abs()");
		System.out.println(Math.abs(-1));
		System.out.println(Math.abs(-1.23)); // 오버로딩 : 동일한 클래스 여러개 vs 오버라이딩 : 부모클래스 받는 것
		// ceil : 올림
		System.out.println("ceil()");
		System.out.println(Math.ceil(1.1));
		// floor() : 내림
		System.out.println("floor()");
		System.out.println(Math.floor(1.9));
		// rint() : 가까운 정수값의 실수
		System.out.println("rint()");
		System.out.println(Math.rint(1.45)); 
		System.out.println(Math.rint(3.67));
		// round() : 반올림한 정수값
		System.out.println("round()");
		System.out.println(Math.rint(1.45));
		System.out.println(Math.rint(3.67));
		// max() : 최대값 
		System.out.println("max()");
		System.out.println(Math.max(1.23, 1.24));
		// min() : 최소값 
		System.out.println("min()");
		System.out.println(Math.min(1.25, 1.23));
		// random() : 0보다 크거나 같고 1보다 작은 임의 실수값 생성하는 메소드 
		System.out.println("ranodm()");
		System.out.println(Math.random());
		// pow() : a의 b제곱
		System.out.println("pow()");
		System.out.println(Math.pow(2, 3));
		// sqrt(a) : 루트 a
		System.out.println("sqrt()");
		System.out.println(Math.sqrt(4));

	}

}
