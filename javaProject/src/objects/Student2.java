package objects;

public class Student2 {
	private String name; 
	private int eng;
	private int math;
	public Student2() {
	}

	public Student2(String name, int eng, int math) {//생성자 불러오기- 빈칸 오른마우스 -소스-제너레이트 유징필드 어쩌구
		super();
		this.name = name;
		this.eng = eng;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	
}
