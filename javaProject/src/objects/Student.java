package objects;

public class Student {
	// �Ӽ�(�ʵ�)
		String studentNo; // p2381344
		int grade;
		int math;
		int eng;
		
		//*������*: �ʵ尪�� �ʱ�ȭ.
		public Student() {
			System.out.println("d");
			
		}
		Student(String studentNo) {
			this.studentNo = studentNo;//this�� Ŭ������ �������ִ� �ν��Ͻ�?
		}
		
		Student(int grade, int eng, int math) {
			this.grade = grade;
			this.eng = eng;
			this.math = math;
		}
		
		//����� ����ϴ� (��[�ҵ�)
		public void study() { 
			System.out.println("������");
		}
		public void run() {
			System.out.println("���");
		}
		public void introduce() {
			System.out.println("�й�: " + studentNo + ", �г�: " + grade);
			System.out.println("����: "+ eng + "����: " + math);
		}
	}

