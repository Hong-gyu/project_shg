package kr.green.test.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.green.test.pagination.*;
import kr.green.test.service.*;
import kr.green.test.vo.*;

@Controller
@RequestMapping(value="/board/*")
public class BoardController {
	@Autowired
	BoardService boardService;
	@Autowired
	MemberService memberService;
	
	@RequestMapping(value="/list")
	public ModelAndView list(ModelAndView mv,String msg, Criteria cri) {
		cri.setPerPageNum(2); // 한 페이지에 게시글 2개
		ArrayList<BoardVO> list = boardService.getBoardList(cri);
		// 현재 페이지(검색타입, 검색어)에 대한 총 게시글 수를 가져와야 함
		int totalCount = boardService.getTotalCount(cri); // 토탈 카운트를 서비스에게 새로은 변수를 만들어서 토탈 카운트를 세서 가져오라고 시킴
		PageMaker pm = new PageMaker(totalCount, 2, cri);
		mv.addObject("pm",pm);
		mv.addObject("list", list);
		mv.addObject("msg", msg);
		mv.setViewName("board/list");
		return mv;
	}
	@RequestMapping(value="/detail")
	public ModelAndView detail(ModelAndView mv, Integer num, String msg) {
		boardService.updateViews(num);
		BoardVO board = boardService.getBoard(num);
		mv.addObject("board", board);
		mv.addObject("msg", msg);
		mv.setViewName("board/detail");
		return mv;
	}
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public ModelAndView registerGet(ModelAndView mv) {
		mv.setViewName("board/register");
		return mv;
	}
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public ModelAndView registerPost(ModelAndView mv, BoardVO board, HttpServletRequest r) {
		MemberVO user = memberService.getMember(r);
		boardService.insertBoard(board, user);
		mv.setViewName("redirect:/board/list");
		return mv;
	}
	@RequestMapping(value="/modify", method=RequestMethod.GET)
	public ModelAndView modifyGet(ModelAndView mv, Integer num, HttpServletRequest r) {
		BoardVO board = boardService.getBoard(num);
		mv.addObject("board", board);
		mv.setViewName("board/modify");
		MemberVO user = memberService.getMember(r);
		if(board == null || !board.getWriter().equals(user.getId())) {
			mv.setViewName("redirect:/board/list");
		}
		return mv;
	}
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public ModelAndView modifyPost(ModelAndView mv, BoardVO board) {
		int res = boardService.updateBoard(board);
		String msg = res != 0 ? board.getNum()+"번 게시글이 수정되었습니다." : "없는 게시글입니다.";
		mv.addObject("msg", msg);
		mv.addObject("num",board.getNum());
		mv.setViewName("redirect:/board/detail");
		return mv;
	}
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public ModelAndView deletePost(ModelAndView mv, Integer num, HttpServletRequest r) {
		MemberVO user = memberService.getMember(r);
		int res = boardService.deleteBoard(num);
		if(res != 0) {
			mv.addObject("msg",num+"번 게시글을 삭제 했습니다.");
		}else {
			mv.addObject("msg","게시글이 없거나 이미 삭제되었습니다.");
		}
		mv.setViewName("redirect:/board/list");
		return mv;
	}
}