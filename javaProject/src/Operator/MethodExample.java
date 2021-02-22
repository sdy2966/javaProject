package Operator;

public class MethodExample {
	public static void main(String[] args) {
		int result1 = sum(10, 20);
		int result2 = minus(30, 20); // result = 30,20의 차이를 계산하는 minus()
		int result3 = multi(15, 13); // result = 15, 13의 곱을 계산하는 multi()
		int result4 = divide(30, 12); // result = 30, 12를 나눈 몫을 계산하는 divide()
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
	
	public static void printAge(int age) { //void는 리턴값이 없음
		System.out.println("나이는: " + age + "입니다.");
	}

}