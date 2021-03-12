package generics;

public class Mornig {
	public static void main(String[] args) {
		checkGender("941206-2999999");
		checkGender("960217-1999999");
		checkGender("971206-2999999");
		checkGender("941206-3999999");
		//e두 수의 합을 구하고 합의 결과를 3자리 단위로, 4,530,890 보여주는 메소드.
		sum("10000","23400")
	
	}

	public static void sum(String a, String b) {
		int n1 = Integer.parseInt(a);
		int n2 = Integer.parseInt(b);
		System.out.println("a"+ "b");
		
		
		System.out.println("3,340");
		
	}

	public static String checkGender(String j) {
		String[] rep = { "/", "-", "*", "=" };
		String r = j;
		for (String str : rep) {
			r = r.replace(str, "");
		}

		if (r.charAt(6) == '1' || r.charAt(6) == '3') {
			char gender = j.charAt(7);
			switch (gender) {
			case '1':
			case '3':
				System.out.println("남자입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여자입니다.");
				break;
			}

			return "";
		}
	}

}
