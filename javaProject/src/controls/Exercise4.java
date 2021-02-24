package controls;

public class Exercise4 {
	public static void main(String[] args) {
		int sum = 0;
		
		int n1 = 1;
		int n2 = 1;

		
		while (n1 <= 6) {
			n1 = (int) (Math.random() * 6) + 1;
		}

		while (n1 <= 6) {
			n2 = (int) (Math.random() * 6) + 1;
		}

		System.out.println("(" + n1 + "," + n2 + ")");
	}

}
