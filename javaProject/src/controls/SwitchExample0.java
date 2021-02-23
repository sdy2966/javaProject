package controls;

public class SwitchExample0 {
	public static void main(String[] args) {
		String grade = "F";
		int score = 98;
		
		switch((int)score / 10) {
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
				grade = "F";
				break;
			default:
				break;
		}
		System.out.println("점수 " + score + "는 " + grade + "입니다");
		System.out.println("수고하셨습니다");
	}

}
