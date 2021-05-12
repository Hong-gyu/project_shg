package board;

import java.util.Scanner;

public class BoardProgram {
	private Board [] board; // 멤버변수
	private Scanner scan; // 멤버변수
	private int count;  // 현재 저장된 갯수 
	public BoardProgram() {  // 생성자
		// board = new Board[10];
		// scan = new Scanner(System.in); 이 두개가 아래의 this(10)과 같은 의미
		this(10);
	}
	public BoardProgram(int max) { // 생성자
		if(max<=10) {
			max=10;
		}
		board = new Board[max];
		scan = new Scanner(System.in);		
	}
	/* 기능 : 게시글을 추가하는 기능(등록)
	 * 매개변수 : 없음
	 * 리턴타입 : 없음
	 * 메소드명 : insertBoard */
	public void insertBoard () {
		System.out.println("게시글 정보를 입력하세요.");
		System.out.print("제목 : ");
		String title=scan.next();
		System.out.print("작성자 : ");
		String writer=scan.next();
		System.out.print("작성일자 : ");
		String registerDate=scan.next();
		System.out.print("내용 : ");
		String contents=scan.next();
		String type = "게시글"; 
		int num = count+1;
		Board tmpBoard = new Board(num, title, contents, writer, registerDate, type);
		board[count]=tmpBoard;
		count+=1;
	}
	/* 기능 : 게시글 번호를 입력받아 입력받은 게시글을 확인하는 메소드(확인)
	 * 매개변수 : 없음
	 * 리턴타입 : 없음 -> void
	 * 메소드명 : printBoardDetail */
	public void printBoardDetail () {
		System.out.print("확인할 게시글 번호를 입력하세요 : ");
		int num=scan.nextInt();		
		if(num <= count && board[num-1]!=null) {					
			board[num-1].print(); // 게시글 출력
		} else {
			System.out.println("해당 게시글이 없거나 삭제되었습니다.");
		}
	}
	/* 기능 : 게시글 전체를 확인하는 메소드(목록)
	 * 매개변수 : 없음
	 * 리턴타입 : 없음 -> void
	 * 메소드명 : pointBoardList */
	public void pointBoardList() {
		for(int i=0;i<count;i+=1) {
			if(board[i]!=null) {
				board[i].summaryPrint();						
			}
		}
	}
	/* 기능 : 수정할 게시글 번호를 입력 받아 수정하는 메소드(수정) 
	 * 매개변수 : 없음
	 * 리턴타입 : 없음 -> void
	 * 메소드명 : */
	public void modifyBoard () {
		System.out.print("수정할 게시글 번호를 입력하세요 : ");
		int num=scan.nextInt();
		if(num<=count && board[num-1]!=null) {
			System.out.print("수정할 제목을 입력하세요 : ");
			String title=scan.next();
			System.out.print("수정할 내용을 입력하세요 : ");
			String contents=scan.next();
			board[num-1].modify(title, contents);
		} else {
			System.out.println("게시글이 존재하지 않거나 삭제되었습니다.");
		}
	}
	/* 기능 : 게시글 번호를 입력받아 삭제하는 메소드(삭제)
	 * 매개변수 : 없음
	 * 리턴타입 : 없음 -> void
	 * 메소드명 : deleteBoard */
	public void deleteBoard () {
		System.out.print("삭제할 게시글 번호를 입력하세요 : ");
		int num=scan.nextInt();
		if(num<=count) {
			board[num-1]=null;
		}
	}
	/* 기능 : 게시글 프로그램 종료 기능(종료)
	 * 매개변수 : 없음
	 * 리턴타입 : 없음
	 * 메소드명 : closeBoard */
	public void closeBoard () {
		System.out.println("프로그램을 종료합니다.");
		scan.close();
	}
	
}
