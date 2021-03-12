package generics;

public class Mornig {
	public static void main(String[] args) {
		checkGender("941206-2999999");
	}
	public static String checkGender(String j) { 
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
