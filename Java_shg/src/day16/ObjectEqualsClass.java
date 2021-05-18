package day16;

public class ObjectEqualsClass {

	public static void main(String[] args) {
		/* Object 클래스
		 *  - 모든 클래스의 조상
		 *  - Object클래스에서 제공하는 메소드를 오버라이딩해서 잘 사용해야 한다.
		 *  - equals() 
		 *  	=> Object 클래스의 equals는 두 객체의 주소가 같은지를 확인 
		 * 		=> 클래스에서 equals를 오버라이딩해서 원하는 값을 확인하는 메소드로 수정해야 함
		 * 		=> Object 클래스의 자식 클래스는 equals()를 오버라이딩 해서 객체의 멤버변수의 값이 같으면 같은 객체로 판별 할 수 있다.
		 *  - toString() 
		 *   */ 
		
		String str1 = new String("abcd");
		String str2 = str1;
		System.out.println("str2 = str1");
		System.out.println("두 문자열 주소 비교 : "+(str1 == str2));
		System.out.println("str2 = new String(\"abcd\")");
		str2 = new String("abcd");
		System.out.println("두 문자열 주소 비교 : "+(str1 == str2));
		System.out.println("두 문자열 비교 : "+str1.equals(str2));
		
		Num n1 = new Num();
		Num n2 = new Num();
		System.out.println("n1과 n2 주소 비교 : "+(n1 == n2));
		System.out.println("n1과 n2가 같다 : "+(n1.equals(n2)));
		n2.setNum(10);
		System.out.println("n1과 n2가 같다 : "+(n1.equals(n2)));
	}
}

class Num {
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // 주소가 같으면 같은 값을 공유하기 때문에 무조건 true
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Num other = (Num) obj;
		if (num != other.num)
			return false;
		return true;
	}
	/* @Override
	 public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(!(obj instanceof Num)) { // 매개변수 obj를 Num 클래스의 객체로 타입변환이 가능하지 않다면 false를 리턴(다른 클래스의 객체와 비교할 필요가 없어서)
			return false;
		}
		Num tmp = (Num) obj; 		// 매개변수의 num와 내 num가 같은지를 비교
		if(num==tmp.num) {
			return true;
		}
		return false;
		
	} */
	
}

class Test {
	Name name;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}

class Name {
	String name;
}