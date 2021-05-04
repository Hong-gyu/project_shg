package day7;

public class MethodEx4 {

	public static void main(String[] args) {
		// 재사용성이 높은 메소드를 잘 만들줄 알아야 한다!!!
		// 최대 공약수를 이용하여 최소 공배수를 구하는 메소드를 작성
		/* 두 정수를 A, B라 하고, 최대공약수를 G, 최소공배수를 L이라고 했을때
		 * A=Ga, B=Gb로 표현할 수 있고, L=G*a*b
		 * L=A*B/G 로 나타낼 수 있다.
		 * */
		System.out.println(gcd1(8,12)); // 알려주는 메소드가 재사용성이 높음
		gcd2(8, 12); // 칠판에 적고간 void 는 재사용성이 낮음
		System.out.println(lcm(8,12)); // gcd1으로 최소공배수를 구하는 메소드를 만듦
	}
	
	/* 기능 : 두 정수의 최대 공약수를 알려주는 메소드
	 * 매개변수 : 두 정수 최대공약수
	 * 리턴타입 : 리턴 => 정수
	 * 메소드명 : gcd1
	 * */
	
	public static int gcd1(int num1, int num2) {
		int res = 1;
		for(int i=1; i<=num1; i+=1) {
			if(num1%i==0 && num2%i==0) {
				res=i;
			}
		}
		return res;
	}
	
	/* 기능 : 두 정수의 최대 공약수를 출력하는 메소드
	 * 매개변수 : 두 정수 최대공약수
	 * 리턴타입 : 없음  => 정수
	 * 메소드명 : gcd2
	 * */
	public static void gcd2(int num1, int num2) {
		int res = 1;
		for(int i=1; i<=num1; i+=1) {
			if(num1%i==0 && num2%i==0) {
				res=i;
			}
		}
		System.out.println(num1+"과 "+num2+"의 최대공약수 : "+res);
	}
	
	/* 기능 : 두 정수의 최소공배수를 알려주는 메소드
	 * 매개변수 : 두 정수
	 * 리턴타임 : 최소공배수 => 정수 int
	 * 메소드명 : lcm */
	
	public static int lcm(int num1, int num2) {
		int res=num1 * num2 / gcd1(num1, num2);
		return res;
	}
	

}
