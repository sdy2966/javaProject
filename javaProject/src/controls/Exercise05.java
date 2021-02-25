package controls;

//중첩for문

//임의의 값 두수를 35, 60
// 35~60까지의 합을 구하는 프로그램 생성.
// 두개의 매개변수를 받아서 두 수의 합을 구하는 메소드
public class Exercise05 {
	public static void main(String[] args) {
	
	// 44,67
	// 결과 = getSumValue(44, 67);
	int sNum = 44;
	int eNum = 67;
	int sum = getSumValue(44,67);
	// "두 수사이의 합계: ???"
	System.out.println(sNum + "과" + eNum + "합" + sum);
	
	/*public static int getSumValue(int n1, int n2) {
	 * //정수1, 정수2 사이의 합을 구하는 메소드
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
 * 1; j <= 5; j++) { System.out.println("*"); } System.out.println();// 줄바꿈 } }
 * 
 * public static void Exercise05() { for (int i = 2; i < 10; i++) { //
 * System.out.println("i의 값: " + i); for (int j = 2; j < 10; j++) { //
 * System.out.println("j의 값: " + j + " "); System.out.println(i + " * " + j +
 * " = " + (i * j) + " "); } System.out.println(); // 줄바꿈 } }
 * 
 */
