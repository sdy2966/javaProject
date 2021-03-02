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
			System.out.println("먹는다");
		}
		void sleep() {
			System.out.println("잔다");
		}
		void walk() {
			System.out.println("걷는다");
		}
		void introduce() {
			System.out.println("이름: " + this.personName + "나이: " + this.age + "입니다.");
		}
	}


