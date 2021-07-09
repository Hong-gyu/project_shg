package kr.green.test.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.green.test.dao.BoardDAO;
import kr.green.test.pagination.Criteria;
import kr.green.test.vo.BoardVO;

@Service
public class BoardServiceImp implements BoardService {
	@Autowired
	BoardDAO boardDao;

	@Override
	public ArrayList<BoardVO> getBoardList() {
		return boardDao.getBoardList();
	}

	@Override
	public BoardVO getBoard(Integer num) {
//		if(num == null) {
//			return null;
//		}
//		return boardDao.getBoard(num);
		return num == null ? null : boardDao.getBoard(num);
	}

	@Override
	public int updateViews(Integer num) {
		//다오에게 게시글 정보를 가져오라고 요청
		BoardVO board = boardDao.getBoard(num);
		if(board != null) {
			board.setViews(board.getViews()+1);
			// 다오에게 게시글을 주면서 게시글을 수정하라고 요청
			return boardDao.updateBoard(board);
		}
		return 0;		
	}

	@Override
	public void insertBoard(BoardVO board) {
		if(board == null) {
			return;
		}
		boardDao.insertBoard(board);
	}

	@Override
	public int deleteBoard(Integer num) {
		if(num == null) {
			return 0;	
		}
		BoardVO board = boardDao.getBoard(num);
		board.setValid("D");
		return boardDao.updateBoard(board);
	}

	@Override
	public int updateBoard(BoardVO board) {
		if( board == null ) {
			return 0;
		}
		BoardVO dbBoard = boardDao.getBoard(board.getNum());
		dbBoard.setContents(board.getContents());
		dbBoard.setTitle(board.getTitle());
		return boardDao.updateBoard(dbBoard);
	}

	@Override
	public int getTotalCount(Criteria cri) {
		// TODO Auto-generated method stub
		return 0;
	}
}