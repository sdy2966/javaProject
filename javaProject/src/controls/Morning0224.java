package controls;
//1)����, �������� ���� ���� ����
	// ����� 90�̻��̸� "��"
	// 80�̻��̸� "��"
	// 70�̻��̸� "�� ���ϸ� "��"
	// ���� ���� ���� ����,
	// 2) ������ ���� �����ϴ� Math.ramdom()�� ����ؼ�
	// 1~100 ���� ������ ���� �����ؼ�
	// 3)������ ���� �����ϴ� Math.random

public class Morning0224 {
	public static void main(String[] args) {
		 
		int engScore  = (int) (Math.random() * 100 + 1 ) ;
		int mathScore  = (int) (Math.random() * 100 + 1 ) ;
		String result = getAverage(engScore,mathScore);
		
	}
	public static String getAverage(int n1, int n2) {//�޼ҵ� ��Ģ, �ǹ��߿�
		String grade = "��";
		double score = (double) (n1 + n2) / 2;
		
		if (score >= 90) {
			grade = "��";
		} else if (score >= 80) {
			grade = "��";
		} else if (score >= 70) {
			grade = "��";
		} else {
			grade = "��";
		}
		System.out.println("����� ������ ������� " + score + "�� '" + grade + "'�Դϴ�");
		return grade;
	}

	
}
