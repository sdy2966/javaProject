package controls;
// int ����� ���� �� �ִ� �迭. engScores -> 3

// int ���м��� ���� �� �ִ� �迭. mathScores -> 3

// ����, ���� �����Է�.
// ������ ���, ���������� ����� ���ϴ� �ڵ�.
// ������� -> �������: 85.5/ �������: 88.7
public class Morning0226 {
	public static void main(String[] args) {
		morning0226(new int[] { 39, 29, 89 }, new int[] { 25, 80, 96 });
	}

	public static void morning0226(int engScores[], int mathScores[]) {
		int sumE = 0;
		int sumM = 0;
		double avgE = 0;
		double avgM = 0;
		for (int i = 0; i < engScores.length; i++) {
			sumE = sumE + engScores[i];
		}
		for (int i = 0; i < mathScores.length; i++) {
			sumM = sumM + mathScores[i];
		}
		avgE = (double) (sumE / engScores.length);
		avgM = (double) (sumM / mathScores.length);
		System.out.println("�������: " + avgE + "/" + "\t" + "�������: " + avgM);
	}
}