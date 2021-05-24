package day18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class MapTest2 {

	public static void main(String[] args) {
		/* 다음 두 기능을 가진 프로그램을 작성하세요 
		 * 1. 회원가입
		 * 2. 로그인 
		 * 3. 종료
		 * Map을 이용하여 회원 정보를 저장하고, 로그인 시도시 로그인 성공하면 성공했다고 알려주는 기능
		 * 예시 
		 * 1. 회원가입
		 * 2. 로그인
		 * 3. 종료
		 * 메뉴 선택 : 1
		 * 회원가입
		 * 아이디 : abc123
		 * 비밀번호 : abc123
		 * 회원가입되었습니다.
		 * 1. 회원가입
		 * 2. 로그인
		 * 3. 종료
		 * 메뉴 선택 : 1
		 * 이미 가입된 회원입니다.
		 * 1. 회원가입
		 * 2. 로그인
		 * 3. 종료
		 * 메뉴 선택 : 2
		 * 아이디 : abc123
		 * 비밀번호 : abcd123
		 * 로그인 성공
		 * 1. 회원가입
		 * 2. 로그인
		 * 3. 종료
		 * 메뉴 선택 : 2
		 * 아이디 : abc123
		 * 비밀번호 : 1234
		 * 로그인 실패
		 * */ 
		
		Scanner scan = new Scanner(System.in);
		HashSet<String> set=new HashSet<String>();
		ArrayList <String> list = new ArrayList<String>();
		HashMap < String, String > map = new HashMap<String, String>();
		Set<String> keySet = map.keySet();
		
		while(true) {
			System.out.println("1.회원가입");
			System.out.println("2.로그인");
			System.out.println("3.종료");
			System.out.print("메뉴선택 : ");
			int num = scan.nextInt();
			switch(num) {
				case 1 :
					if(num==1) {
						System.out.println("회원가입");
						System.out.print("아이디를 입력하세요 : ");
						String id = scan.next();
						System.out.print("비밀번호를 입력하세요 : ");
						String pw = scan.next();
						map.put(id, pw);
						System.out.println(map.size());
						break;
						/* if(map.size()==1) {  // 최초 회원가입시에는 중복체크 안함
							break;
						} else {  // 두번째부터는 중복체크 해야 함
							if(map.containsKey(id)==true) {
							System.out.println("이미 가입된 아이디입니다.");	
							}
						} */
					} 
				case 2 :
					System.out.println("로그인");
					System.out.print("아이디를 입력하세요 : ");
					String id2 = scan.next();
					Iterator<String> it = set.iterator();
					while(it.hasNext()) { // hasNext() : 가져올 객체가 있는지(ture) 없는지(false)
						String tmp = it.next();
						if(tmp.equals(id2)==true) {
							System.out.println("비밀번호를 입력하세요 : ");
							String pw2 = scan.next();
							Iterator<String> it2 = set.iterator();
							while(it.hasNext()) { // hasNext() : 가져올 객체가 있는지(ture) 없는지(false)
								String tmp2 = it.next();
							if(tmp2.equals(pw2)==true) {
								System.out.println("로그인 성공");
							}
						} 
					}
					System.out.print("로그인 실패");
					break;
					}
				case 3 : 
					System.out.println("프로그램 종료");
					break;
			}
		}
	}
}
		// 메뉴출력
		/* 1. 회원가입
		 * 2. 로그인
		 * 3. 종료
		 * 메뉴 선택 : 
		 * */ 
		
		// 회원가입 -> set 이용
		/* 아이디 : key
		 * 비밀번호 : value */		
		
		
		// 로그인
		/* if(map.containsKey(id)==true){
		 * 	sysout("이미 가입된 회원입니다.");
		 * }
		 * if(map.containsValue(pw)==true){
		 * 	sysout("로그인 성공");
		 * } else {
		 *  sysout("로그인 실패");
		 * }
		 *  */
