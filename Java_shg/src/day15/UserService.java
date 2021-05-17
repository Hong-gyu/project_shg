package day15;
// 회원과 관련된 처리를 하는 기능을 모아놓은 인터페이스
public interface UserService {
	/* 추상메소드 만들기 */ // -> 구현구가 없기 때문에 (매개변수)까지 하고 세미콜론(;)으로 마무리
	
	/* 기능 : 회원의 아이디와 비밀번호가 주어졌을때 로그인 가능 여부를 알려주는 메소드
	 * 매개변수 : 아이디와 비밀번호 -> String id, String pw
	 * 리턴타입 : 로그인 가능 여부 -> boolean
	 * 메소드명 : login */	
	boolean login(String id, String pw);
	
	/* 기능 : 회원의 아이디와 비밀번호, 이메일, 전화번호가 주어지면 해당 정보로 회원가입하여 가입 여부를 알려주는 메소드
	 * 매개변수 : 회원 아이디, 비밀번호, 이메일, 전화번호 -> String id, String pw, String email, String phoneNum
	 * 			-> 회원정보 => User user 
	 * 리턴타입 : 회원가입 성공여부 -> boolean
	 * 메소드명 : signUp */
	boolean signUp(User user);
	
	/* 기능 : 회원의 이메일, 전화번호를 수정하는 메소드
	 * 매개변수 : 이메일, 전화번호(String email, String phoneNum)
	 * 			-> 회원정보 => User user
	 * 리턴타입 : 없음 -> void
	 * 메소드명 : modifyUser */
	void modifyUser(User user);
}
class User {
	private String id;
	private String pw;
	private String email;
	private String num;
}