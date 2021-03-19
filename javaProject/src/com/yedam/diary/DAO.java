package com.yedam.diary;

import java.util.List;

public interface DAO {
	public int insert(DiaryVo vo);//입력
	public void update(DiaryVo vo);//수정
	public int delete(String date);//삭제
	public DiaryVo selectDate(String date);//날짜로 한건조회
	public List<DiaryVo> selectContent(String content);//내용으로 한건 조회
	public List<DiaryVo> selectAll();//전체리스트
	
}
