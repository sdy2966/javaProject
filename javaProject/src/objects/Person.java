package objects;

public class Person {
		String personName;
		int age;
		int weigt;
		int height;

		Person(int age, int weigt, int height) {
			this.age = age; 
			this.weigt = weigt;
			this.height = height;
	
		}		
		void eat() {
			System.out.println("�Դ´�");
		}
		void sleep() {
			System.out.println("�ܴ�");
		}
		void walk() {
			System.out.println("�ȴ´�");
		}
		void introduce() {
			System.out.println("�̸�: " + this.personName + "����: " + this.age + "�Դϴ�.");
		}
	}


