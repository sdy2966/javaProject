package controls;

public class IfElseExample2 {
	public static void main(String[] args) {
		int score = (int)(Math.random()*100)+1;
		 
		String grade;
		
		if (score >= 90) {		
			if (score >= 95) {
				grade = "A+";
			}	else {
					grade = "A";
				}
		} else if (score >= 80) {
			 if (score >= 85) {
				grade = "B+";
			 }	else {
					grade = "B";
				}
		} else if (score >= 70) {
			if (score >= 75) {
				grade = "C+";
			}	else {
					grade = "C";
				}
		} else {
			grade = "D";
		}

		System.out.println("���� " + score + "�� " + grade + "�Դϴ�");
		System.out.println("�����ϼ̽��ϴ�");
		// if 90�� �̻� -> A -> 95�̻��̸� A+
		// else if 80�� �̻��̸� ->B -> 85�̻��̸� B+
		// else if 70�� �̻��̸� -> C -> 75�� �̻��̸� C+
		// else �׿ܿ��� ->F��
		// ���� 85�� B�Դϴ�.
	}

}
