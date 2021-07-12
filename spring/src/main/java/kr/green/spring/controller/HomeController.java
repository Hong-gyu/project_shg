package kr.green.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.green.spring.service.MemberService;
import kr.green.spring.vo.MemberVO;

@Controller
public class HomeController {
	@Autowired
    MemberService memberService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(ModelAndView mv) {
		mv.setViewName("home");
		return mv;
	}
	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public ModelAndView signinGet(ModelAndView mv) {
		mv.setViewName("signin");
		return mv;
	}
	
	@RequestMapping(value = "/signin", method = RequestMethod.POST)
	public ModelAndView signinPost(ModelAndView mv,MemberVO user) {
		System.out.println(user);
		//서비스에게 아이디와 비밀번호를 전달하면, 해당 정보가 DB에 있으면
		//회원 정보를 없으면 null을 반환
		//작업이 다 끝난 후 URI가 /signin인 곳으로 넘어감
		MemberVO dbUser = memberService.signin(user);
		// 회원정보가 있으면 => 로그인에 성공하면 
		if(dbUser != null) {
			mv.setViewName("redirect:/");
			// 회원정보가 없으면 => 일치하는 아이디가 없던지, 비밀번호가 잘못되던지 =>> 로그인 실패
		}else {
			mv.setViewName("redirect:/signin");
		}
		mv.addObject("user",dbUser);
		return mv;
	}
	@RequestMapping(value = "/signup", method=RequestMethod.GET)
	public ModelAndView signupGet(ModelAndView mv) {
		mv.setViewName("signup");
		return mv;
	}
	@RequestMapping(value = "/signup", method=RequestMethod.POST)
	public ModelAndView signupPost(ModelAndView mv, MemberVO user) {
		System.out.println(user);
		// 서비스에게 회원정보를 주면서 회원 가입하라고 일을 시키고 회원가입이 성공하면 true, 실패하면 false를 알려달라고 요청
		boolean isSignup = memberService.signup(user);
		// 회원가입에 성공하면 메인으로 실패하면 회원가입 페이지로 이동 		
		if(isSignup) {
			mv.setViewName("redirect:/");	
		} else {
			mv.setViewName("redirect:/signup");
		}
		return mv;
	}
	@RequestMapping(value = "/member/mypage", method=RequestMethod.GET)
	public ModelAndView memberMypageGet(ModelAndView mv) {
		mv.setViewName("member/mypage");
		return mv;
	}
	@RequestMapping(value = "/member/mypage", method=RequestMethod.POST)
	public ModelAndView memberMypagePost(ModelAndView mv, MemberVO user, HttpServletRequest request) {
		// request에 있는 세션 안에 있는 로그인한 회원 정보를 가져옴
		MemberVO sessionUser = memberService.getMember(request);
		// 세션에 로그인한 회원 정보가 있고, 세션에 있는 아이디와 수정할 아이디가 같으면 회원 정보 수정함
		if(sessionUser != null && sessionUser.getId().equals(user.getId())) {
			MemberVO updatedUser = memberService.updateMember(user);
			if(updatedUser != null) {
				request.getSession().setAttribute("user", updatedUser);
			}
		}
		mv.setViewName("redirect:/member/mypage");
		return mv;
	}
	@RequestMapping(value = "/signout", method=RequestMethod.GET)
	public ModelAndView signOutGet(ModelAndView mv, HttpServletRequest request) {
		request.getSession().removeAttribute("user");
		mv.setViewName("redirect:/");
		return mv;
	}
	
}
// Autowired 
/* @Inject 와 비슷(차이점은 @Inject 내장 어노테이션이고 @Autowired는 아님
 * @Autowired 는 객체를 싱글톤으로 생성해줌
 *  - 싱글톤 : 해당 클래스로 만들어진 객체는 오로지 하나만 존재하게 하는 클래스
 *  - 인터페이스로 객체를 생성할 수 없음
 *  - 인터페이스는 구현 클래스를 이용하여 객체를 생성할 수 있음
 * */ 
	/* 새로운 URI 를 추가하려면
	 * 1. Controller에서 @RequestMapping이 포함된 메소드를 추가한 후 value에서 원하는 URI 경로로 수정, 메소드의 return 부분에 원하는 화면을 연결
	 * 2. views 폴더에 연결할 jsp를 추가 */
	
	/* 서버에서 화면으로 원하는 정보를 보내는 방법 
	 * 1. 서버에서는 ModelAndView클래스에서 제공하는 addObject("화면에서 쓸 이름","보낼 데이터") 이용하여 데이터를 전송;
	 * 2. 화면에서는 ${화면에서 쓸 이름} 으로 데이터를 받아서 처리
	 * */
	
	/* 화면에서 서버로 원하는 정보를 보내는 방법1(a 태그 이용)
	 * 1. 화면에서는 a태그를 이용하여 원하는 URI를 지정 후 ? 다음에 정보를 전달
	 * 	예 : localhost:8080/spring/signin?id=abc123&pw=abc123 
	 * */
	
	/* 화면에서 서버로 원하는 정보를 보내는 방법2(form 태그 이용)
	 * 1. 화면에서는 form태그에 input태그와 버튼을 이용하여 정보를 입력 후 전송 버튼으로 정보 전달
	 * 2. 서버에서는 메소드의 매개변수로 해당 정보를 받아옴 
	 * */

	/* 화면에서 서버로 데이터를 보낼 때
	 * 매개변수가 일반 변수나 클래스인 경우(String, Integer, int 등)는 매개변수명을 화면의 name과 맞춘다
	 * 매개변수가 클래스의 객체인 경우는 매개변수의 멤버변수명과 화면의 name을 맞춘다
	 * */
	
