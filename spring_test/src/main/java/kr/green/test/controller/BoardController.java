package kr.green.test.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.green.test.pagination.Criteria;
import kr.green.test.pagination.PageMaker;
import kr.green.test.service.BoardService;
import kr.green.test.vo.BoardVO;
import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping(value="/board/*")
public class BoardController {
	@Autowired
	BoardService boardService;

	@RequestMapping(value="/list")
	public ModelAndView list(ModelAndView mv, String msg, Criteria cri) {
		log.info(cri);
		PageMaker pm = new PageMaker();
		pm.setCriteria(cri);
		pm.setDisplayPageNum(2);
		int totalCount = boardService.getTotalCount(cri);
		ArrayList<BoardVO> list = boardService.getBoardList();
		log.info(list);
		mv.addObject("list",list);
		mv.addObject("msg",msg);
		mv.setViewName("board/list");
		return mv;
	}
	@RequestMapping(value="/detail")
	public ModelAndView detail(ModelAndView mv, Integer num, String msg) {
		boardService.updateViews(num);
		BoardVO board = boardService.getBoard(num);
		// 가져온 게시글을 화면에 전달, 화면에 보낼 이름은 board로
		mv.addObject("board",board);
		mv.addObject("msg",msg);
		mv.setViewName("board/detail");
		return mv;
	}
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public ModelAndView registerGet(ModelAndView mv) {
		mv.setViewName("board/register");
		return mv;
	}
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public ModelAndView registerPost(ModelAndView mv, BoardVO board) {
		boardService.insertBoard(board);
		mv.setViewName("redirect:/board/list");
		return mv;
	}
	@RequestMapping(value="/modify", method=RequestMethod.GET)
	public ModelAndView modifyGet(ModelAndView mv, Integer num) {
		// 서비스야 수정할 게시글 번호를 줄테니 그 게시글 정보를 가져와
		BoardVO board = boardService.getBoard(num);
		// 그리고 화면에 보여줘
		mv.addObject("board",board);
		mv.setViewName("board/modify");
		return mv;
	}
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public ModelAndView modifyPost(ModelAndView mv, BoardVO board) {
		log.info("/board/modift:POST:"+board);
		int res = boardService.updateBoard(board);
		String msg = res != 0 ? board.getNum()+"번 게시글이 수정되었습니다." : "없는 게시글입니다.";
		mv.addObject("msg",msg);
		mv.addObject("num",board.getNum());
		mv.setViewName("redirect:/board/detail");
		return mv;
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public ModelAndView deletePost(ModelAndView mv, Integer num) {
		// 서비스야 삭제할 게시글 번호 줄테니 그 게시글 정보 가져와
		log.info("/board/delete : "+num); // 테스트용 log
		// 서비스야 삭제할 게시글 번호 줄테니 삭제해
		int res = boardService.deleteBoard(num);
		// 삭제에 성공하면 성공했다는 정보를 화면에 전달하고
		if(res != 0) {
			mv.addObject("msg",num+"번 게시글을 삭제 했습니다.");
		} else {
			// 실패하면 실패했다는 정보를 화면에 전달해
			mv.addObject("msg","게시글이 존재하지 않거나 이미 삭제되었습니다.");
		}
		mv.setViewName("redirect:/board/list");
		return mv;
	}
}
