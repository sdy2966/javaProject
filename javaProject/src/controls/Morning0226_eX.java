package controls;
// int 영어성적 담을 수 있는 배열. engScores -> 3

// int 수학성적 담을 수 있는 배열. mathScores -> 3

// 영어, 수학 성적입력.
// 영어의 평균, 수학점수의 평균을 구하는 코딩.
// 출력형태 -> 영어평균: 85.5/ 수학평균: 88.7
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
				System.out.println("영어의 평균: " + avg);
			} else if (i==1) {
				avg = sum /scores[i].length;
				System.out.println("수학의 평균: " + avg);
			}
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);
	}
	}//줠라모르갯다
}