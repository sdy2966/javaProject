package objects;

public class ObjectExample {
	public static void main(String[] args) {
		Student student = new Student(); //학샹이라는 개채
		//스튜던트라는 타입변수
		student.studentNo = "p2381344";
		student.grade = 2;
		student.eng = 80;
		student.math = 85;
		student.study();
		student.run();
		student.introduce();
		
		Student student1 = new Student(); 
		student.studentNo = "p2381345";
		student.grade = 3;
		student.eng = 75;
		student.math = 88;
		student.study();
		student.run();
		student.introduce();

		Student student2 = new Student(4, 70, 80);
		student2.studentNo = "p2381348";
		student2.study();
		student2.run();
		student2.introduce();
	}

}
