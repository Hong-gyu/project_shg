package board;

import java.util.Scanner;

import board.Board;

public class BoardTest {

	public static void main(String[] args) { // static이 있으니 클래스 메소드
		/* 다음 메뉴를 가지는 게시글 콘솔 프로그램을 만드세요.
		 * 1. 게시글 등록
		 * 2. 게시글 수정
		 * 3. 게시글 삭제
		 * 4. 게시글 목록 확인 
		 * 5. 게시글 상세 확인
		 * 6. 프로그램 종료 */
		
		/*  1. 반복문을 출력하여 메뉴를 출력하고 메뉴를 선택하는 작업
		 *  2. 선택한 메뉴가 1이면 선택한 메뉴명(게시글 등록) 출력 ... 선택한 메뉴가 6이면 선택한 메뉴명(프로그램 종료) 출력  -> 조건문(swich)
		 *  3. */
		
		Scanner scan=new Scanner(System.in);		
		int menu = 0;
		int max = 10;
		Board [] board=new Board [max]; // 게시글은 여러개 저장할 수 있어야 하기 때문에 배열로 표현 {1,2,3,4,5}는 배열을 숫자로 표현한 것
		String title, writer, registerDate, contents, type;
		int count = 0; // 저장된 게시글의 갯수(등록할 때 저장할 번지)
		int num;
		int views;
		Board tmpBoard;
		do {
			// 메뉴 출력
			printMenu();
			// 메뉴 선택
			menu = scan.nextInt();
			// 선택된 메뉴에 따라 기능 안내문 출력
			switch (menu) {
			case 1 :
				// 게시글 정보 입력(제목, 작성자, 작성일자, 내용)
				System.out.println("게시글 정보를 입력하세요.");
				System.out.print("제목 : ");
				title=scan.next();
				System.out.print("작성자 : ");
				writer=scan.next();
				System.out.print("작성일자 : ");
				registerDate=scan.next();
				System.out.print("내용 : ");
				contents=scan.next();
				// 타입은 게시글로 지정, 번호는 배열의 번지를 이용(0번지 일때 게시글 번호 1, 1번지 일때 게시글 번호 2, ...)
				type = "게시글"; 
				num = count+1;
				// 입력된 정보를 이용하여 게시글 생성
				tmpBoard = new Board(num, title, contents, writer, registerDate, type);
				// 생성된 게시글을 배열에 저장
				board[count]=tmpBoard;
				count+=1;
					break;			
			case 2 :
				// 수정할 게시글 번호 입력
				System.out.print("수정할 게시글 번호를 입력하세요 : ");
				num=scan.nextInt();
				// 게시글이 있으면 제목과 내용을 입력
				// 게시글 수정
				// 게시글이 존재하고 -> num <= count
				// 게시글이 존재하지 않았으면 -> board[num-1] != null
				
				// 게시글이 있으면 제목과 내용을 입력하고 게시글 수정
				if(num<=count && board[num-1]!=null) { // 게시글 num-1번지가 null이 아니면
					System.out.print("수정할 제목을 입력하세요 : ");
					title=scan.next();
					System.out.print("수정할 내용을 입력하세요 : ");
					contents=scan.next();
					// board[num-1].setTitle(title); // 이부분을 몰랐음
					// board[num-1].setContents(contents);  // 이부분을 몰랐음
					board[num-1].modify(title, contents);
				} else {
					System.out.println("게시글이 존재하지 않거나 삭제되었습니다.");
				}
				break;
			case 3 :
				// 사용자가 삭제할 게시글 번호를 입력하면 삭제
				System.out.print("삭제할 게시글 번호를 입력하세요 : ");
				num=scan.nextInt();
				// 삭제 = 해당 정보를 null
				if(num<=count) {
					board[num-1]=null;
				}
				break;
			case 4 :
				// 모든 게시글 조회
				// 번호, 제목, 작성자, 작성일, 조회수 출력
				for(int i=0;i<count;i+=1) {
					if(board[i]!=null) {
						board[i].summaryPrint(); // 게시글 출력						
					}
				}
				break;
			case 5 :
				// 상세 내용을 확인할 게시글 선택
				System.out.print("확인할 게시글 번호를 입력하세요 : ");
				num=scan.nextInt();		
				// 해당 게시글의 내용 출력
				if(num <= count && board[num-1]!=null) { // 입력한 숫자가 게시글 총 수와 작거나 같고 게시글이 삭제되지 않은 경우
					// 게시글을 확인하면 조회수 1증가
					// 기존 조회수를 가져옴
					// views=board[num-1].getViews();
					// 기존 조회수를 가져오고 기존 조회수에 1을 증가해서 업데이트
					// board[num-1].setViews(views+1);					
					board[num-1].print(); // 게시글 출력
				} else {
					System.out.println("해당 게시글이 없거나 삭제되었습니다.");
				}
				break;
			case 6 : System.out.println("프로그램 종료"); break;
			default : System.out.println("잘못된 메뉴입니다.");
			}
		} while (menu != 6); // 사용자가 입력한 숫자가 6이 아니면 반복
		
		
		
		

		
		/* 1. 1~6번까지의 메뉴를 사용자에게 알려줌
		 * 2. 사용자가 입력한 메뉴 숫자를 입력받아 해당 메뉴의 기능(메소드)를 실행시킴 
		 *  - 예시 1
		 *  사용자 입력 : 1
		 *  콘솔값 : 게시글 등록 메뉴 입니다.
		 *  콘솔값 : 게시글을 등록하세요
		 *   게시글 번호는 자동생성
		 *   게시글 제목
		 *   작성자
		 *   등록시간
		 *   조회수, 좋아요 는 자동생성
		 *   게시글 내용
		 *  등록한 게시글은 배열에 저장
		 *  - 예시 2
		 *  사용자 입력 : 2
		 *  콘솔값 : 게시글 수정 메뉴입니다.
		 *  콘솔값 : 수정 가능한 게시글은 [ 등록한 게시글을 배열에 저장한 수 ] 개 입니다.
		 *  콘솔값 : 게시글을 수정하세요(수정가능한 범위는 제목, 내용 입니다)
		 *  
		 *   
		 * */
		

		scan.close();
	}
	public static void printMenu() {
		System.out.println("------메뉴------");
		System.out.println("1.게시글 등록");
		System.out.println("2.게시글 수정");
		System.out.println("3.게시글 삭제");
		System.out.println("4.게시글 목록 확인");
		System.out.println("5.게시글 상세 확인");
		System.out.println("6.프로그램 종료");
		System.out.println("---------------");
		System.out.print("메뉴를 선택하세요 : ");
	}
}
