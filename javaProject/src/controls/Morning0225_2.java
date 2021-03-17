package controls;

public class Morning0225_2 {

	public static void main(String[] args) {
// 1) 11���� 30������ ���� ���� ���ϵ��� for�ݺ���.
// 		int sum = 0;
//		for (int i = 11; i <= 30; i++) {
//			sum = sum + i;
//		}
//		System.out.println(sum);

//2) 11�� 30�� ������ �Է¹޾Ƽ� ���� ���ϴ� for�ݺ���.
		int sum = 0;
		int n1 = 11;
		int n2 = 30;
		for (int i = n1; i <= n2; i++) {
			sum = sum + i;
		}
		System.out.println("2) " + n1 + "~" + n2 + "���� ��: " + sum);
	}

// 3) 11�� 30�� �Ű������� �޾Ƽ� ���� ���ϴ� �޼ҵ�.
	public static int getSum(int fromValue, int toValue) {
		int sum = 0;
	
		for (int i = fromValue; i <= toValue; i++) {
			sum += i; // sum = sum + i;
		}
		System.out.println("3) " + n1 + "~" + n2 + "���� ��: " + sum);
		return 0;
	}

}
