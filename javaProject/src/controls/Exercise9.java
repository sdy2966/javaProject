package controls;

import java.util.Scanner;

public class Exercise9 {
	public static void main(String[] args) {
		boolean run = true;
		int studenNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.�л��� | 2. �����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("-----------------------------------------------");
			System.out.print("����> ");
			int selectNo = scanner.nextInt();
			if(selectNo !=1 && scores == null) {
				System.out.println("�л����� ���� �Է��ϼ���");
				System.out.println();
				continue;
			}
			if (selectNo == 1) {  //�迭�� ũ��
				int
				for(int i =0; i<scores.length; i++) {
					System.out.println("�л���> ");
					studentNum = scanner.nextInt();
					scores = new int[studentNum];
			} else if (selectNo == 2) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i +"]>");
					scores[i] = scanner.nextInt();
				}
                                              
			} else if (selectNo == 3) {

			} else if (selectNo == 4) {

			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}
}