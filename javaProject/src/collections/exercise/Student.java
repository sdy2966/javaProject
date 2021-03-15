package collections.exercise;

public class Student {

	public int studentNum;
	public String name;
	public Student (int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
//		return this.studentNum + this.name.hashCode();//중복을 허
		return this.studentNum;//키값을 중복으로ㅣㅓ
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student ) {
			Student s= (Student) obj;
			return this.studentNum == s.studentNum && this.name.equals(s.name);
		}
		return false;
	}


}
