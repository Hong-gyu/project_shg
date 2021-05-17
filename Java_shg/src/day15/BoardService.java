package day15;

public interface BoardService {
	/* 기능 :  게시글 등록하는 메소드
	 * 매개변수 : 게시글 정보 -> Board board
	 * 			게시글 제목, 내용, 작성자, 작성일이 주어지면 게시글을 등록하는 메소드
	 * 리턴타입 : void
	 * 메소드명 : insert */
	void insert(Board board); // 접근제한자를 생략하면 기본으로 public 이 적용됨

	/* 기능 :  게시글 삭제하는 메소드
	 * 	 		게시글 번호가 주어지면 해당 게시글 번호를 삭제한 후 삭제 여부를 알려주는 메소드 (URL 주소명으로 입력해서 들어갈 경우에도 삭제할 수 있음) => 실패할 수 있음
	 * 매개변수 : 게시글 정보 -> Board board
	 * 			게시글 번호 -> int num
	 * 리턴타입 : 삭제 여부 
	 * 메소드명 : delete */
	boolean delete(int num);
	
	/* 기능 :  게시글 수정하는 메소드
	 * 	  		게시글 번호와 수정할 게시글 정보가 주어지면 게시글을 수정하는 메소드
	 * 매개변수 : 게시글 정보 -> Board board
	 * 리턴타입 : void
	 * 메소드명 : update */
	void update(Board board);
	
	/* 기능 :  게시글 번호가 주어지면 게시글을 전달하는 메소드
	 * 			게시글 번호가 주어지면 주어진 게시글에 대한 게시글 정보(제목, 내용, 작성자, 작성일)를 알려주는 메소드
	 * 매개변수 : 게시글 번호 -> int num
	 * 리턴타입 : 게시글 정보
	 * 메소드명 : getBoard */
	Board getBoard(int num);
	
	/* 기능 :  게시글 리스트를 가져오는 메소드
	 * 			게시글 정보(제목, 내용, 작성자, 작성일)들을 가져오는 메소드
	 * 매개변수 : 없음
	 * 리턴타입 : 게시글 정보들 -> Board []
	 * 메소드명 : getBoardList */
	Board [] getBoardList ();
	
	/* 기능 :  검색어가 들어간 게시글 리스트를 가져오는 리스트
	 * 매개변수 :  => String search
	 * 리턴타입 : 검색어가 들어간 게시글 리스트 -> Board []
	 * 메소드명 : getBoardList */
	public Board[] getBoardList(String search); // 메소드 오버로딩을 이용해서 가능하기 때문에 유사한 기능이라면 굳이 메소드명을 새로 만들지 않아도 됨
}
class Board {
	//게시글 번호, 제목, 내용, 작성자, 등록일자 멤버변수 선언
	private int num;
	private String contents;
	private String title;
	private String writer;
	private String registerDate;
}
