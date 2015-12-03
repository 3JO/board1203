package org.sean.domain;

public class BoardVO {
	
	private int bno;
	private String title;
	private String text;
	private String writer;
	
	public BoardVO(int i, String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", title=" + title + ", text=" + text + ", writer=" + writer + "]";
	}
	
	
	
	

}
