package objects;
//�ۺ�-���� �����̺�- 
public class Student1Exam {
	public static void main(String[] args) {
		Student1 s1 = new Student1("ȫ�浿", 90, 85);
		Student1 s2 = new Student1("��浿", 88, 85);
		Student1 s3 = new Student1("�̱浿", 76, 90);
		Student1 s4 = new Student1();
//		s4.name = "�ֱ浿";
		s4.setName("�ֱ浿");
//		s4.eng = "70";
		s4.setEng(70);
//		s4.math = "80"; //�����̺����� ����Ǿ��ִ� �Ӽ����� ������������ ������ ���. �� ������ Ŭ���� �ȿ����� ���ٰ���. �׷��� �ش� Ŭ������ ���� ��������.
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
