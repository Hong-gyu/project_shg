package board;

public class Board {
	
	/* public 클래스 클래스명 {
	 * 		접근제한자 멤버변수
	 * 		접근제한자 메소드
	 * 		생성자
	 * }*/
	
	/* 게시글에 필요한 멤버변수를 선언하세요.
	 * 멤버변수 : 게시글번호, 제목, 내용, 작성자, 등록시간, 조회수, 좋아요수, 게시글 타입
	 * 제목 : boardTitle (String)
	 * 내용 : boardContents (String)
	 * 작성자 : boardWriter (String)
	 * 등록시간 : boardTime (int)
	 * 조회수 : boardView (int)
	 * 좋아요수 : boardLike (int)
	 * 게시글번호 : boardList (int)
	 * 타입 : boardType (String) */
 
	
	// 1. 멤버변수 선언
	private int num; 
	private String title = "";
	private String contents = new String();
	private String writer = "";
	private String registerDate = "";
	private int views;
	private int like;
	private String type = "";
	
	// 2. getter, setter 설정
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	// 3-1. 생성자 생성(자동입력-마우스)
	/* 생성자 생성(기본생성자, 복사생성자, ... )
	 * - 일반변수는 일반 초기화(숫자나 정수 등 간단하게 표기가 되니까 초기화가 쉬움)
	 * - 참조변수는 객체 생성 후 초기화(참조변수는 변수가 다양하게 발생할 수 있기때문에 변수를 새롭게 초기화 하기 위해 new를 사용하고 그 뒤는 변수타입을 같이 적어줌)
	 * */
	public Board(int num, String title, String contents, String writer, String registerDate, String type) {
		this.num = num;
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		this.registerDate = registerDate;
		this.type = type;
		// 조회수, 좋아요 는 굳이 생성 안해도 기본으로 0이 되어야 하므로 굳이 만들어 줄 필요가 없음
	}	
	// 3-2. 생성자 생성(직접입력)
//		public Board () {
//		int num = 1;
//		String title = new String();
//		String contents = new String();
//		String writer = new String();
//		String registerDate = new String();
//		int views = 0;
//		int like = 0;
//		String type = new String();
//	}
	
	// 4. 메소드 생성(기능에 맞게 메소드 생성하면 됨)
	/* 기능 : 게시글 정보 출력하는 메소드
	 * 매개변수 : 필요 없음
	 * 리턴타입 : void
	 * 메소드명 : print */
	
	public void print () {
		System.out.println("번호 : " + num);
		System.out.println("제목 : " + title);
		System.out.println("작성자 : " + writer);
		System.out.println("조회수 : " + views);
		System.out.println("좋아요 : " + like);
		System.out.println("작성일 : " + registerDate);
		System.out.println("내용 : " + contents);
		System.out.println("게시글타입 : " + type);
	}

	
	
	
	
	

}
