package objects;

public class ObhectExample2 {
	public static void main(String[] args) {
		
//		Person person = new Person(22, 68, 178);
//		person.personName = "��浿";
//		person.eat();
//		person.sleep();
//		person.walk();
		
		//���ڿ�:�̸�, ����: ���� int[], Stringp[]
		// Person[]: String, int
		Person[] persons = new Person[5];
		persons[0] = new Person("�ڱ浿", 15, 186.8, 75.5);
		persons[1] = new Person("�̱�ȫ", 45, 169, 57);
		persons[2] = new Person("��ڹ�", 27, 159, 54.8);
		persons[3] = new Person("������", 23, 173.9, 63.6);
		persons[4] = new Person("���̹�", 34, 189.4, 82.4);
			for (Person person : persons) {
				if (person.age > 20 && person.height > 180.0) {	
				}
					
			}
	}

}
