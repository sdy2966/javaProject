package collections;

public class Student {
	private int sno;
	private String name;
	public Student(int sno, String name) {
//		super();
		this.sno = sno;
		this.name = name;
	}
	
	
	@Override
	public int hashCode() {
		return this.sno + this.name.hashCode();//학버ㄴ이랑 이름이 같으면 동일한 해쉬코드 값을 비교하겠다.//name이라는 Stringㅡ에 해ㅜ시메소드 쓰는거
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student) obj;
			return this.sno == s.sno && this.name.equals(s.name);///학버ㄴ이랑 이름이 같으면 동일한 이꼴 값을 비교하겠다.
		}
		return false;//그렇지아느믄 다르다
	}


	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + "]";
	}
	
}
