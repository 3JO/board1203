package org.sean.service;

import java.util.List;

import org.sean.domain.BoardVO;

public interface BoardService {

	public List<BoardVO> listAll()throws Exception;
}
