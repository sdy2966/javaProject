package controls;
//1)영어, 수학점수 담을 변수 선언
	// 평균이 90이상이면 "수"
	// 80이상이면 "우"
	// 70이상이면 "미 이하면 "가"
	// 값을 담을 변수 선언,
	// 2) 임의의 값을 생성하는 Math.ramdom()을 사용해서
	// 1~100 까지 임의의 값을 생성해서
	// 3)임의의 값을 생겅하는 Math.random

public class Morning0224 {
	public static void main(String[] args) {
		 
		int engScore  = (int) (Math.random() * 100 + 1 ) ;
		int mathScore  = (int) (Math.random() * 100 + 1 ) ;
		String result = getAverage(engScore,mathScore);
		
	}
	public static String getAverage(int n1, int n2) {//메소드 규칙, 의미중요
		String grade = "가";
		double score = (double) (n1 + n2) / 2;
		
		if (score >= 90) {
			grade = "수";
		} else if (score >= 80) {
			grade = "우";
		} else if (score >= 70) {
			grade = "미";
		} else {
			grade = "가";
		}
		System.out.println("영어와 수학의 평균점수 " + score + "는 '" + grade + "'입니다");
		return grade;
	}

	
}
