package nestedClasses;

public class ForMun {
	public static void main(String[] args) {

		int[][] a1 = new int[5][5];
		int n1 = 1;

		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a1.length; j++) {
				a1[i][j] = n1;	
				System.out.printf("%3d", n1);
				n1++;
				if(j == 4) {
					System.out.println();
				}
			}
		}

	}

}
// 0.0  0.1  0.2  0.3  0.4
// 1.0  1.1  1.2  1.3  1.4
// 2.0  2.1  2.2  2.3  2.4
// 3.0  3.1  3.2  3.3  3.4
// 4.0  4.1  4.2  4.3  4.4
