package controls;

public class ForExample2 {
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			showResult(i);
		}
	} //end of main
		
	public static void showResult(int num) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}// end of showResult
}