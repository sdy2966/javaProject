package Exe;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = new String("성다영");
		String strVar2 = "성다영";
		String strVar3 = "성다융";
		
		if (strVar1 == strVar2) {
			System.out.println("같은 String 객ㅊ체를 참조");
		}else {
			System.out.println("다른 String 객체를 참조");
		}
		if (strVar1.equals(strVar2)) {
			System.out.println("같은 문자열을 가짐");
		}else {
			System.out.println("다른 문자열을 가짐");
		}
		if (strVar1 == strVar3) {
			System.out.println("같은 String 객ㅊ체를 참조");
		}else {
			System.out.println("다른 String 객체를 참조");
		}
		if (strVar1.equals(strVar3)) {
			System.out.println("같은 문자열을 가짐");
		}else {
			System.out.println("다른 문자열을 가짐");
		}

	}

}
