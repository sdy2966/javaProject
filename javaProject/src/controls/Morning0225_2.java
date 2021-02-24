package controls;

public class Morning0225_2 {

	public static void main(String[] args) {
// 1) 11부터 30까지의 수의 합을 구하도록 for반복문.
// 		int sum = 0;
//		for (int i = 11; i <= 30; i++) {
//			sum = sum + i;
//		}
//		System.out.println(sum);

//2) 11과 30을 변수로 입력받아서 합을 구하는 for반복문.
		int sum = 0;
		int n1 = 11;
		int n2 = 30;
		for (int i = n1; i <= n2; i++) {
			sum = sum + i;
		}
		System.out.println("2) " + n1 + "~" + n2 + "까지 합: " + sum);
	}

// 3) 11과 30을 매개변수롭 받아서 합을 구하는 메소드.
	public static int getSum(int fromValue, int toValue) {
		int sum = 0;
		int
		int 
		for (int i = fromValue; i <= toValue; i++) {
			sum += i; // sum = sum + i;
		}
		System.out.println("3) " + n1 + "~" + n2 + "까지 합: " + sum);
		return 0;
	}

}
