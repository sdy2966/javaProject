package com.yedam.diary;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import boardPkg.common.DBCon;

//날짜,내용.
//테입블/
//접속계정 :diary/diary

public class DiaryOracleDAO implements DAO{
	
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	String sql = null;
	
	public void close() {
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
	if (stmt != null) {

		try { 
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	if (conn != null) {
		try { 
			conn.close();				
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
	
	@Override
	public int insert(DiaryVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(DiaryVo vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int delete(String date) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public DiaryVo selectDate(String date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DiaryVo> selectContent(String content) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DiaryVo> selectAll() {
			
		return null;
	}
	

}
