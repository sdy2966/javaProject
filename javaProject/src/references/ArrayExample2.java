package references;

public class ArrayExample2 {
	public static void main(String[] args) {
		// 10개의 배열에 1~100꺄지의 임의의 수를 Math.random으로
		// 
		// 짝수합을 구해서 평균규하기
		
		int[] ary = new int[10];
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			ary[i] = (int) (Math.random() * 100 + 1);
			if (i % 2 == 0) {
				sum = sum + 1;
				sum = ary[i];
			}
		}
		
	}

}