package board;

import java.util.Scanner;

public class BoardTest {

	public static void main(String[] args) {
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
		do {
			// 메뉴 출력
			System.out.println("------메뉴------");
			System.out.println("1.게시글 등록");
			System.out.println("2.게시글 수정");
			System.out.println("3.게시글 삭제");
			System.out.println("4.게시글 목록 확인");
			System.out.println("5.게시글 상세 확인");
			System.out.println("6.프로그램 종료");
			System.out.println("---------------");
			System.out.print("메뉴를 선택하세요 : ");
			// 메뉴 선택
			menu = scan.nextInt();
			// 선택된 메뉴에 따라 기능 안내문 출력
			switch (menu) {
			case 1 : System.out.println("등록"); break;
			case 2 : System.out.println("수정"); break;
			case 3 : System.out.println("삭제"); break;
			case 4 : System.out.println("목록"); break;
			case 5 : System.out.println("상세"); break;
			case 6 : System.out.println("프로그램 종료"); break;
			default : System.out.println("잘못된 메뉴입니다.");
			}
		} while (menu != 6);
		
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

}
