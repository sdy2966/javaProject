package object2;

public class LibraryExe {
	public static void main(String[] args) {
		Boook book1 = new Boook("�̰��� �ڹٴ�","���", "�Ѻ�",1000);
		System.out.println(book1);//������ ��ġ
		Boook book2 = new Boook("�̰��� �ڹٰ�","�ڹ�", "����",2000);
		Boook book3 = new Boook("�̰Ž� �ڹٴ�","����", "���﹮ȭ��",4000);
		Boook book4 = new Boook("������ �ڹٴ�","����", "�ó���",5000);
		Boook book5 = new Boook("�޶˰�","�����", "�ؽ�",3000);
		
		Member mem1 = new Member("s111", "�����");
		mem1.rent(book1);
		Member mem2 = new Member("a222", "�ڼҿ�");
		mem2.rent(book2);
		mem2.rent(book5);
		//->
		mem2.overdue(book5);
		//=
		//String str = mem2.getBookInfo();
		//System.out.println(str);
		//<-
		mem2.getBookInfo(); //����̸� - �ؽ�
		
		Member mem3 = new Member("f333", "�����");
		mem3.rent(book4);
		mem3.getBookInfo(); //����̸� - �ó���
		
		
		
	}
	 
}
