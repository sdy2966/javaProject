package Operator;

public class MethodExample {
	public static void main(String[] args) {
		int result1 = sum(10, 20);
		int result2 = minus(30, 20); // result = 30,20�� ���̸� ����ϴ� minus()
		int result3 = multi(15, 13); // result = 15, 13�� ���� ����ϴ� multi()
		int result4 = divide(30, 12); // result = 30, 12�� ���� ���� ����ϴ� divide()
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		printAge(25);
		
	}
	
	
	public static int sum(int a, int b) {
		int result1 = a + b;
		return result1;
	}
	
	public static int minus(int a, int b) {
		int result2 = a - b;
		return result2;
	}

	public static int multi(int a, int b) {
		int result3 = a * b;
		return result3;
	}

	public static int divide(int a, int b) {
		int result4 = a / b;
		return result4;
	}
	
	public static void printAge(int age) { //void�� ���ϰ��� ����
		System.out.println("���̴�: " + age + "�Դϴ�.");
	}

}