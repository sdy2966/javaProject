package object2;

public class singletonExample {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		Boook b1 = new Boook("�ڹ�","����", "���ǻ�",1000);
		Boook b2 = new Boook("�ڹ�","����", "���ǻ�",4000);
		
		System.out.println(s1==s2);
		System.out.println(b1==b2);
	}

}
