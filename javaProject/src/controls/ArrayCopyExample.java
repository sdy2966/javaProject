package controls;

public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] names = { "�����", "�ڼҿ�", "�����" };
		int[] scores = { 88, 89, 90 };
		// ���� ����-> 88
		// �ҿ� ����-> 89
		// ���� ����-> 90
		for (int i = 0; i < 3; i++) {
			System.out.println(names[i] + "����=>" + scores[i]);
		}
		// ���� for��
		for (String name : names) { 
			//System.out.println(name);
		}
		int sum = 0;
		for (int score : scores) {
			sum = sum + score;
		}
		System.out.println("�հ�����: " + sum);
	}

}
