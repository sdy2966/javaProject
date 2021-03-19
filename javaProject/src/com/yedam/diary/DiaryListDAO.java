package com.yedam.diary;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DiaryListDAO implements DAO {

	String fileName = "diary.dat";
	String filePath;//
	List<DiaryVo> list;
	
	public DiaryListDAO() {
		filePath = System.getProperty("user.home") + "/" + fileName;
		readFile();//파일 초기화.
	}
	
	@SuppressWarnings("unchecked")
	public void readFile() {
		File file = new File(filePath); 
		if(!file.exists()) {
			list = new ArrayList<DiaryVo>();
		} else {
			try {
				FileInputStream fis = new FileInputStream(filePath);
				BufferedInputStream bis = new BufferedInputStream(fis);
				ObjectInputStream ois = new ObjectInputStream(bis);
				
				list= (List<DiaryVo>) ois.readObject();
				System.out.println((list != null ? list.size() : 0) + "건 read됨.");
				ois.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void writeFile() {
		try {
			FileOutputStream fos = new FileOutputStream(filePath);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			
			oos.writeObject(list);
			oos.close();
//			System.out.println("저장됨");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
	public int insert(DiaryVo vo) {
		int cnt = list.size();
		int ii = 0;
		//중복날짜 입력불가
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getWdate().equals(vo.getWdate())) {
				return 0;
			}
			if(list.get(i).getWdate().compareTo(vo.getWdate()) > 0) {//날짜 순서대로
				ii = i;
				break;
			}
		}	
		list.add(ii, vo);
		writeFile();	
		return 0;
	}

	@Override
	public void update(DiaryVo vo) {	
		int cnt = list.size();
		for (int i = 0; i < cnt; i++) {
			if (list.get(i).getWdate().equals(vo.getWdate())) {
				list.set(i, vo);
//				list.get(i).setContent(vo.getContent());
			}
		}
	}

	@Override
	public int delete(String date) {
		int cnt = list.size();
		for (int i = 0; i < cnt; i++) {
			if (list.get(i).getWdate().equals(date)) {
				list.remove(i);
				writeFile();
				return 1;
			}
		}
		return 0;
	}

	@Override
	public DiaryVo selectDate(String date) {
		int cnt = list.size();
		DiaryVo con = null;
		for (int i = 0; i < cnt; i++) {
			if(list.get(i).getWdate().equals(date)) {
				con = list.get(i);
			}
		}
			
		return con;
	}
	
		@Override
		public List<DiaryVo> selectContent(String content) {
			int cnt = list.size();
			List<DiaryVo> vo = new ArrayList<>();
			for (int i = 0; i< cnt; i++) {
				if(list.get(i).getContent().indexOf(content) != -1) {
					vo.add(list.get(i));
				}
			}
			
			return vo;
		
	}
	@Override
	public List<DiaryVo> selectAll() {
		return list;
	}

	
	
}
