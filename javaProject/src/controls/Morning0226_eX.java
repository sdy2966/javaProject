package controls;
// int ����� ���� �� �ִ� �迭. engScores -> 3

// int ���м��� ���� �� �ִ� �迭. mathScores -> 3

// ����, ���� �����Է�.
// ������ ���, ���������� ����� ���ϴ� �ڵ�.
// ������� -> �������: 85.5/ �������: 88.7
public class Morning0226_eX {
	public static void main(String[] args) {

	}

	public static void morning0226() {
		int[] engScores=new int[3];
		engScores=new int[] {90,88,87};
		int[] mathScores=new int[3];
		mathScores=new int[] {88,90,92};
		
//		int[][] scores = new int[2][3];
//		scores[0] = new int[] {90,88,87};
//		scores[1] = new int[] {90,88,87};
		
		int[][] scores= {{90,88,87},{88,90,92}};
		
		for(int i=0; i<scores.length; i++) {
			int sum=0;
			for(int j=0; j<scores[i].length; j++) {
				sum +=scores[i][j];
			}
			if(i==0) {
				avg = sum /scores[i].length;
				System.out.println("������ ���: " + avg);
			} else if (i==1) {
				avg = sum /scores[i].length;
				System.out.println("������ ���: " + avg);
			}
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);
	}
	}//�O��𸣰���
}