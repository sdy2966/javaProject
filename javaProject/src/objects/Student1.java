package objects;

public class Student1 {//객체
	private String name; //속성
	private int eng;
	private int math;
	
	Student1() { //생성자도 프라이빗으로 접근을 한정지을 수 있다.
		
	}
	
	Student1(String name, int eng, int math) { //생성자
		this.name = name;
		this.eng = eng;
		this.math = math;
	
	}
	void showInfo() { //
		System.out.println("이름: " + name + " 영어: "+ eng + " 수학: " + math + " 합계: " + (eng+math)  );
	}
	 public void setName(String name) {
		 this.name = name;
	 }
	 public void setEng(int eng) {
		 if (eng<0) {
			 this.eng = 0;
		 } else {
			 this.eng = eng;
		 }
	 }
	 public void setMath(int math) {
		 if(math <0) {
			 this.math = 0;
		 } else {
			 this.math = math;
		 }
	 }
}
