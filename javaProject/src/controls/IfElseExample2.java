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

		System.out.println("점수 " + score + "는 " + grade + "입니다");
		System.out.println("수고하셨습니다");
		// if 90점 이상 -> A -> 95이상이면 A+
		// else if 80점 이상이면 ->B -> 85이상이면 B+
		// else if 70점 이상이면 -> C -> 75점 이상이면 C+
		// else 그외에는 ->F로
		// 점수 85는 B입니다.
	}

}
