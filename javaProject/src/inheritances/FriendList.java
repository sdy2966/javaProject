package inheritances;

public class FriendList {
	public static void main(String[] args) {
		Friend[] friends = new Friend[10];

		friends[0] = new Friend("�����", "011 2344123");
		friends[1] = new ComFriend("�ڼҿ�", "010123455", "�ѹ��μ�");
		friends[2] = new UnivFriend("�����", "07012344321", "�����а�");

		for (Friend friend : friends) {//������a��
			if (friend != null) {//!=�����ʴ�
				System.out.println(friend.toString());
			}
		}
	}
}
//�߰�����. Scanner Ŭ����..
//1,ģ�� 2.�б�ģ�� 3.ȸ��ģ�� 4.��ü��� 5.ģ���̸� �˻�