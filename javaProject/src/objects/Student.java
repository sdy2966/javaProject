package objects;

public class Student {
	// 속성(필드)
		String studentNo; // p2381344
		int grade;
		int math;
		int eng;
		
		//*생성자*: 필드값을 초기화.
		public Student() {
			System.out.println("d");
			
		}
		Student(String studentNo) {
			this.studentNo = studentNo;//this는 클래스가 가지고있는 인스턴스?
		}
		
		Student(int grade, int eng, int math) {
			this.grade = grade;
			this.eng = eng;
			this.math = math;
		}
		
		//기능을 담당하는 (ㅁ[소드)
		public void study() { 
			System.out.println("공부함");
		}
		public void run() {
			System.out.println("운동함");
		}
		public void introduce() {
			System.out.println("학번: " + studentNo + ", 학년: " + grade);
			System.out.println("영어: "+ eng + "수학: " + math);
		}
	}

