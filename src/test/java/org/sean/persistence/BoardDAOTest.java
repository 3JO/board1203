package org.sean.persistence;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.sean.domain.BoardVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/*.xml" })

public class BoardDAOTest {
	protected static final Logger logger = LoggerFactory.getLogger(BoardDAOTest.class);
 
	@Inject
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
	
	@Test
	public void testRead() throws Exception{
		logger.info(dao.read(1).toString());
	}
	
	@Test
	public void testUpdate() throws Exception{
		BoardVO board = new BoardVO();
		board.setBno(1);
		board.setTitle("test title");
		board.setContent("test content");
		dao.update(board);
		logger.info(board.toString());
	}
	
	@Test
	public void testDelete() throws Exception{
		dao.delete(1);
	}
}
