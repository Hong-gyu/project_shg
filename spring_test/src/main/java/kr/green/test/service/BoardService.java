package kr.green.test.service;

import java.util.ArrayList;

import kr.green.test.pagination.Criteria;
import kr.green.test.vo.BoardVO;
import kr.green.test.vo.MemberVO;

public interface BoardService {

	ArrayList<BoardVO> getBoardList(Criteria cri);

	BoardVO getBoard(Integer num);

	int updateViews(Integer num);

	void insertBoard(BoardVO board, MemberVO user);

	int deleteBoard(Integer num);

	int updateBoard(BoardVO board);

	int getTotalCount(Criteria cri);

}