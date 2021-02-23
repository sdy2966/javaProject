package controls;

public class SwitchExample {
	public static void main(String[] args) {
//		for(int i = 0; i < 5; i++) {
//			int z = (int) (Math.random() * 5) + 1;
//			System.out.println(z); // 0~1»çÀÌÀÇ ÇÔ¼ö
//	}		
	
		String msg = "Â¦/È¦";
		int z = (int) (Math.random() * 6) + 1;
		switch (z) {
		case 1: 
		case 3: 
		case 5: msg = "È¦"; break;
		case 2: 
		case 4: 
		case 6: msg = "Â¦"; break;
		}
		System.out.println(z + "´Â" + msg + "ÀÔ´Ï´Ù.");
	
		
	}
}
