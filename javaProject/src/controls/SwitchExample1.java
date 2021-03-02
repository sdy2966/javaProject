package controls;

public class SwitchExample1 {
	public static void main(String[] args) {
		int score = (int)(Math.random()*100)+1;
		String grade;


		switch((int)score / 10) {//....?
			case 10 :
				grade = "A+";
				break; //반복문이나 스위치 문에서 해당된는 조건이 없으면 빠져나오란 뜻
			case 9 :
				grade = "A";
			case 8 :
				grade = "B";
				break;	
			case 7 :
				grade = "C";
				break;
			case 6 :
				grade = "D";
				break;
			default:
				grade = "F";
				break;
		}
		System.out.println("점수 " + score + "는 " + grade + "입니다");
		System.out.println("수고하셨습니다.");
	}

}
