package controls;

public class SwitchExample1 {
	public static void main(String[] args) {
		int score = (int)(Math.random()*100)+1;
		String grade;


		switch((int)score / 10) {//....?
			case 10 :
				grade = "A+";
				break; //�ݺ����̳� ����ġ ������ �ش�ȴ� ������ ������ ���������� ��
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
		System.out.println("���� " + score + "�� " + grade + "�Դϴ�");
		System.out.println("�����ϼ̽��ϴ�.");
	}

}
