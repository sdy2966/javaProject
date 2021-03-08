package API;

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {//equals()메소드는 ==연산자와 같은 의미
			System.out.println("obj1과 obj2는 동등하다");
		} else {
			System.out.println("obj1과 obj2는 동등하지않다");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 동등하다");
		} else {
			System.out.println("obj1과 obj3는 동등하지않다");
		}
		

	}

}
