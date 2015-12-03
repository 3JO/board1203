package org.sean.service;

import java.util.List;

import org.sean.domain.BoardVO;

public interface BoardService {

	public List<BoardVO> listAll() throws Exception;

	public void regist(BoardVO vo) throws Exception;

	public void remove(Integer bno) throws Exception;

	public void modify(Integer bno) throws Exception;

	public BoardVO read(Integer bno) throws Exception;

}
