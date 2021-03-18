package com.yedam.diary;

import java.io.Serializable;

public class DiaryVo implements Serializable{
		private final long serialVersionUID = 1L;
		private String wdate;
		private String content;

		public DiaryVo(String wdate, String content) {
			super();
			this.wdate = wdate;
			this.content = content;
		}
		public String getWdate() {
			return wdate;
		}
		public void setWdate(String wdate) {
			this.wdate = wdate;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		
		public DiaryVo() {}
		
		@Override
		public String toString() {
			return "DiaryVO [wdate=" + wdate + ", content=" + content + "]";
		}
		
	

}
