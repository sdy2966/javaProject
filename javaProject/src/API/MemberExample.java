package API;

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {//equals()�޼ҵ�� ==�����ڿ� ���� �ǹ�
			System.out.println("obj1�� obj2�� �����ϴ�");
		} else {
			System.out.println("obj1�� obj2�� ���������ʴ�");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1�� obj3�� �����ϴ�");
		} else {
			System.out.println("obj1�� obj3�� ���������ʴ�");
		}
		

	}

}
