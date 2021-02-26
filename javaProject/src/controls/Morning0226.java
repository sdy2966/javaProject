package controls;
// int 영어성적 담을 수 있는 배열. engScores -> 3

// int 수학성적 담을 수 있는 배열. mathScores -> 3

// 영어, 수학 성적입력.
// 영어의 평균, 수학점수의 평균을 구하는 코딩.
// 출력형태 -> 영어평균: 85.5/ 수학평균: 88.7
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
		System.out.println("영어평균: " + avgE + "/" + "\t" + "수학평균: " + avgM);
	}
}