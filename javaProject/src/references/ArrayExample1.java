package references;

public class ArrayExample1 {
	public static void main(String[] args) {
		// intArys => 5개 
		//for 반복문()
		//Math.randam() * 10 + 1
		int[] intArys = new int[5];
		for (int i=0; i<intArys.length; i++) {
			intArys[i] = (int)(Math.random() * 10 + 1);
		}
		
		
		int maxValue = 0;
			for(int i = 0; i<5; i++) {
			maxValue = (intArys[i] > maxValue)?intArys[i] :maxValue;
			
			}
			System.out.println(maxValue);		
	}
}