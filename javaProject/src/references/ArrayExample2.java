package references;

public class ArrayExample2 {
	public static void main(String[] args) {
		// 10���� �迭�� 1~100������ ������ ���� Math.random����
		// 
		// ¦������ ���ؼ� ��ձ��ϱ�
		
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