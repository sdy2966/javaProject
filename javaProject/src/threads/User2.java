package threads;

public class User2 extends Thread {
	private Calculator calculator;

	public void setcalculator(Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}

	public void run() {
		calculator.setMemory(50);
	}
}
