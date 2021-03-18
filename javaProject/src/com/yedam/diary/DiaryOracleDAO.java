package com.yedam.diary;

import java.util.List;

public class DiaryOracleDAO implements DAO {
	@Override
	public int insert(DiaryVO vo) {
		return 0;
	}

	@Override
	public void update(DiaryVO vo) {
	}

	@Override
	public int delete(String date) {
		return 0;
	}

	@Override
	public DiaryVO selectDate(String date) {
		return null;
	}

	@Override
	public List<DiaryVO> selectContent(String content) {
		return null;
	}

	@Override
	public List<DiaryVO> selectAll() {
		return null;
	}
}
