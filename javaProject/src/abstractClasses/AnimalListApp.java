package abstractClasses;

import java.util.Scanner;

import inheritances.Friend;
import inheritances.FriendList;

public class AnimalListApp {
	public static void main(String[] args) {
		Friend[] friends = new Friend[10];
		boolean fd = true;
		Scanner scanner = new Scanner(System.in);

		while (fd) {
			System.out.println("---------------------------------------------------------------");
			System.out.println("1.ģ�� | 2. �б�ģ�� | 3.ȸ��ģ�� | 4.��ü��� | 5. ģ���̸��˻� | 6.����");
			System.out.println("---------------------------------------------------------------");
			System.out.println("�Է�>");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.println("�̸��Է�> ");
				String name = scanner.nextLine();
				System.out.println("��ȭ��ȣ> ");
				String pnum = scanner.nextLine();
			} else if (selectNo == 2) {
				System.out.println("�̸��Է�> ");
				String name = scanner.nextLine();
				System.out.println("��ȭ��ȣ> ");
				String pnum = scanner.nextLine();
				System.out.println("�μ�����> ");
				String dept = scanner.nextLine();
//				new ComFriend("�����", "01033335444", "�ѹ�");

			} else if (selectNo == 3) {
				System.out.println("�̸��Է�> ");
				String name = scanner.nextLine();
				System.out.println("��ȭ��ȣ> ");
				String pnum = scanner.nextLine();
				System.out.println("������> ");
				String dept = scanner.nextLine();	
//				new UnivFriend("��ِl", "0101234567", "����");
			} else if (selectNo == 4) {
				System.out.println("��ü���");
				System.out.println(FriendList.toString());
			} else if (selectNo == 5) {
				System.out.println("�̸��˻�");
				String fn = scanner.nextLine();
			} else if (selectNo == 6) {
				fd = false;
			}
		}
		System.out.println("���α׷� ����");
	}
}
//�߰�����. Scanner Ŭ����..
//1,ģ�� 2.�б�ģ�� 3.ȸ��ģ�� 4.��ü��� 5.ģ���̸� �˻�