package controls;

//��øfor��

//������ �� �μ��� 35, 60
// 35~60������ ���� ���ϴ� ���α׷� ����.
// �ΰ��� �Ű������� �޾Ƽ� �� ���� ���� ���ϴ� �޼ҵ�
public class Exercise05 {
	public static void main(String[] args) {
	
	// 44,67
	// ��� = getSumValue(44, 67);
	int sNum = 44;
	int eNum = 67;
	int sum = getSumValue(44,67);
	// "�� �������� �հ�: ???"
	System.out.println(sNum + "��" + eNum + "��" + sum);
	
	/*public static int getSumValue(int n1, int n2) {
	 * //����1, ����2 ������ ���� ���ϴ� �޼ҵ�
		int startNo = (n1 > n2)?n2 : n1;
		int endNo = (n1 > n2)?n1 : n2;
		int sum = 0;
		for (int i = startNo; i <= endNo; i++) {
			sum = sum + i;
		}
		return sum;

	}

}

/*
 * public static void exercise6() { for (int i = 1; i <= 5; i++) { for (int j =
 * 1; j <= 5; j++) { System.out.println("*"); } System.out.println();// �ٹٲ� } }
 * 
 * public static void Exercise05() { for (int i = 2; i < 10; i++) { //
 * System.out.println("i�� ��: " + i); for (int j = 2; j < 10; j++) { //
 * System.out.println("j�� ��: " + j + " "); System.out.println(i + " * " + j +
 * " = " + (i * j) + " "); } System.out.println(); // �ٹٲ� } }
 * 
 */
