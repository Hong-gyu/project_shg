package day13;

public class Circle extends Figure {
	/* 원을 그릴 때 좌상점과 우하점으로 그린다면 중심점은 실수로 해야 한다.
	 * 예) (0,0) (1,1)인 원에서 중심점은 (0.5 , 0.5)
	 * 원을 그릴 때 좌상점과 우하점으로 그린다면 중심점은 원이 아닌 타원이 나올 수 있다.
	 * 예) (0,0) (2,3)은 타원
	 * 위와 같은 이유 때문에 원을 그릴 때는 중심점과 반지름을 기준으로 그릴 것이다.
	 * */

	// 우하 x - 좌상 x -> 반지름
	// 우하 y - 좌상 y -> 두개 합쳐서 중심점
	
	private int x, y ; // 중심점 x, y
	private int r; // 반지름

	public Circle(int x, int y, int r) {
		super(x-r, y-r, x+r, y+r); // 부모에서 사용하는 변수 사용하는거 아님?
		this.x=x;
		this.y=y;
		this.r=r;
	}
	
	@Override
	public void print () {
		System.out.println("<원 입니다.>>");
		System.out.println("중심점 : "+x+"px, "+y+"px");
		System.out.println("반지름 : "+r);
	}
}
