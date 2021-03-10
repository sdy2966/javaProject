package threads;

public class MainThreadExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setcalculator(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setcalculator(calculator);
		user2.start();
		

	}

}
