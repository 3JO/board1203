package org.sean.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.sean.domain.BoardVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/*.xml" })

public class BoardDAOTest {
	protected static final Logger logger = LoggerFactory.getLogger(BoardDAOTest.class);

	@Autowired
	private BoardDAO dao;

	@Test
	public void testCreate() throws Exception{
		BoardVO board = new BoardVO();
		board.setTitle("test title");
		board.setContent("test content");
		board.setWriter("test writer");
		dao.create(board);
		logger.info(board.toString());
	}
}
