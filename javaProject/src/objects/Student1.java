package objects;

public class Student1 {//��ü
	private String name; //�Ӽ�
	private int eng;
	private int math;
	
	Student1() { //�����ڵ� �����̺����� ������ �������� �� �ִ�.
		
	}
	
	Student1(String name, int eng, int math) { //������
		this.name = name;
		this.eng = eng;
		this.math = math;
	
	}
	void showInfo() { //
		System.out.println("�̸�: " + name + " ����: "+ eng + " ����: " + math + " �հ�: " + (eng+math)  );
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
