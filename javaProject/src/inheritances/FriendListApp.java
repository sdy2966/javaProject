package inheritances;

import java.util.Scanner;

public class FriendListApp {
	static Friend[] friends = new Friend[10];

	public static void main(String[] args) {

		boolean fd = true;
		Scanner scanner = new Scanner(System.in);

		while (fd) {
			System.out.println("---------------------------------------------------------------");
			System.out.println("1.ģ�� | 2. ȸ��ģ�� | 3.�б�ģ�� | 4.��ü��� | 5. ģ���̸��˻� | 6.����");
			System.out.println("---------------------------------------------------------------");
			System.out.println("�Է�>");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.println("�̸��Է�> ");
				String name = scanner.next();
				System.out.println("��ȭ��ȣ> ");
				String phone = scanner.next();
				Friend friend = new Friend(name, phone);
				saveFriend(friend);
			} else if (selectNo == 2) {
				System.out.println("�̸��Է�> ");
				String name = scanner.next();
				System.out.println("��ȭ��ȣ> ");
				String phone = scanner.next();
				System.out.println("�μ�����> ");
				String department = scanner.next();
				Friend friend = new ComFriend(name, phone, department);
				saveFriend(friend);
			} else if (selectNo == 3) {
				System.out.println("�̸��Է�> ");
				String name = scanner.next();
				System.out.println("��ȭ��ȣ> ");
				String phone = scanner.next();
				System.out.println("������> ");
				String major = scanner.next();
				Friend friend = new UnivFriend(name, phone, major);
				saveFriend(friend);
			} else if (selectNo == 4) {
				System.out.println("��ü���");
				for (Friend friend : friends) {// ������a��
					if (friend != null) {// !=�����ʴ�
						System.out.println(friend.toString());
					}
				}
			} else if (selectNo == 5) {
				System.out.println("ã���̸� �˻�");
				String findName = scanner.next();
				for (Friend friend : friends) {
					if (friend != null && friend.name.equals(findName)) {
						System.out.println("ģ������: " + friend.toString());
					}
				}
			} else if (selectNo == 6) {
				fd = false;
			} else {
				System.out.println("�ٽ��Է��Ͻÿ�");
			}
		}
		System.out.println("���α׷� ����");
	}// end of main

	public static void saveFriend(Friend friend) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
	}

}
//�߰�����. Scanner Ŭ����..
//1,ģ�� 2.�б�ģ�� 3.ȸ��ģ�� 4.��ü��� 5.ģ���̸� �˻�