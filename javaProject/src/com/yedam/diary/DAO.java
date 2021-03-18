package com.yedam.diary;

import java.util.List;

public interface DAO {
	public int insert(DiaryVo vo);
	public void update(DiaryVo vo);
	public int delete(String date);
	public DiaryVo selectDate(String date);
	public List<DiaryVo> selectContent(String content);
	public List<DiaryVo> selectAll();
}
