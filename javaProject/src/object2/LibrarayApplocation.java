package object2;

import java.util.Scanner;

public class LibrarayApplocation {
	public static void main(String[] args) {
		Boook[] booklist = new Boook[10];
		Member user = new Member();
		Scanner scn = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("----------------------------------------------------------------------");
			System.out.println("1)�����������  2) ȸ���������   3) �����뿩  4) �����ݳ�  5) �뿩�������  9) ����");
			System.out.println("----------------------------------------------------------------------");
			System.out.print("����> ");
			int selectNo = scn.nextInt();
			if (selectNo != 1 && booklist == null) {
				System.out.println("���������� ���� ����Ͻÿ�.");
				System.out.println();
				continue;
			}
			if (selectNo == 1) {
				for (int i = 0; i < booklist.length; i++) {
					System.out.println("��������>");
					
				}
			}else if (selectNo ==2) {
				for (int i=0; i< booklist.length; i++) {
					System.out.println("");
					
				}
			}

		}

	}

}
