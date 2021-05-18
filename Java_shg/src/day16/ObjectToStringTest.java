package day16;

public class ObjectToStringTest {

	public static void main(String[] args) {
		/* toString () : 클래스의 멤버변수 값을 문자열로 바꿀 때 사용하는 메소드
		 * System.out.println(객체명)을 하면 객체의 toString()이 자동으로 호출됨 */
		Student s = new Student("홍길동", 1,1,1);
		System.out.println(s);
		System.out.println(s.toString());

	}

}

class Student {
	private String name;
	private int grade;
	private int classNum;
	private int num;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public int getClassNum() {
		return classNum;
	}


	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}
	
	
	
	public Student(String name, int grade, int classNum, int num) {
		super();
		this.name = name;
		this.grade = grade;
		this.classNum = classNum;
		this.num = num;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + ", classNum=" + classNum + ", num=" + num + "]";
	}
	
}