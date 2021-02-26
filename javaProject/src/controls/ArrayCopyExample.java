package controls;

public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] names = { "김민주", "박소연", "김다희" };
		int[] scores = { 88, 89, 90 };
		// 민주 점수-> 88
		// 소연 점수-> 89
		// 다희 점수-> 90
		for (int i = 0; i < 3; i++) {
			System.out.println(names[i] + "점수=>" + scores[i]);
		}
		// 향상된 for문
		for (String name : names) { 
			//System.out.println(name);
		}
		int sum = 0;
		for (int score : scores) {
			sum = sum + score;
		}
		System.out.println("합계점수: " + sum);
	}

}
