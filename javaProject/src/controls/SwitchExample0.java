package controls;

public class SwitchExample0 {
	public static void main(String[] args) {
		String grade = "F";
		int score = 98;
		
		switch((int)score / 10) {
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
				grade = "F";
				break;
			default:
				break;
		}
		System.out.println("���� " + score + "�� " + grade + "�Դϴ�");
		System.out.println("�����ϼ̽��ϴ�");
	}

}
