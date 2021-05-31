package etc;
public class Student {
	public static void main(String[] args) {
		Student1 st = new Student1(1,1,1,"홍길동");
		st.print();
	}
}
class Student1 {
	private int g, c, s;
	private String n;
	public void print() {
		System.out.println("학년 : "+g+", "+"반 : "+c+", "+"번호 : "+s+", "+"이름 : "+n);
	}
	public void student1() {}
	public int getG() {
		return g;
	}
	public int getC() {
		return c;
	}
	public int getS() {
		return s;
	}
	public String getN() {
		return n;
	}
	public Student1(int g, int c, int s, String n) {
		this.g = g;
		this.c = c;
		this.s = s;
		this.n = n;
	}
}
