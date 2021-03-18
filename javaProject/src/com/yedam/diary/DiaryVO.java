package com.yedam.diary;

import java.io.Serializable;

public class DiaryVO implements Serializable{
	private static final long serialVersionUID = 1L;
	private String wdate;
	private String contents;

	@Override
	public String toString() {
		return "DiaryVO [wdate=" + wdate + ", contents=" + contents + "]";
	}

	public void setWdate(String wdate) {
		this.wdate = wdate;
	}
	
	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getWdate() {
		return wdate;
	}

	public String getContents() {
		return contents;
	}
}
