package objects;
//퍼블릭-공공 프라이빗- 
public class Student1Exam {
	public static void main(String[] args) {
		Student1 s1 = new Student1("홍길동", 90, 85);
		Student1 s2 = new Student1("김길동", 88, 85);
		Student1 s3 = new Student1("이길동", 76, 90);
		Student1 s4 = new Student1();
//		s4.name = "최길동";
		s4.setName("최길동");
//		s4.eng = "70";
		s4.setEng(70);
//		s4.math = "80"; //프라이빗으로 적용되어있는 속성에는 접근하지못해 에러가 뜬다. 단 동일한 클래스 안에서는 접근가능. 그래서 해당 클래스에 직접 지정해줌.
		s4.setMath(80);
		System.out.println(s4.getMath);
		
		new Student1();
		
		Student1[] students = new Student1[3];
		students[0] = s1; 
		students[1] = s2;
		students[2] = s3;
	
		for (Student1 student : students) {
			student.showInfo();
		
		}
	}

}
