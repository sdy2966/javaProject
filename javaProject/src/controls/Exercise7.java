package controls;

import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scn = new Scanner(System.in);//ctl+shif+o ����Ʈ ����Ű
		 
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1.���Ʊ� | 2. ��� | 3. �ܰ� | 4. ����");
			System.out.println("----------------------------------");
			System.out.println("����> ");
			int menu = scn.nextInt(); //���ڰ��� �о�´�.
			if(menu == 1) { //���ݱ��
				System.out.println("�Աݾ��� �Է�>>");
				balance = balance + scn.nextInt();//����� �Է±�
			} else if (menu == 2) { // ��ݱ��
				
			} else if (menu == 3) { // �ܰ���
				System.out.println("�ܾ���" + balance);
			} else if (menu == 4) { //�ݺ��� ����
				System.out.println("����");
				run = false;
			}
			
		}
	}

}
