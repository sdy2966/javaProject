package object2;

public class Member1 {
	String memN;
	String memId;
	String pW;
	int age;

	public Member1(String memN, String memId) {
		memN = memN;
		memId = memId;
	}

	public boolean login(String id, String password) {

		if (id == "hong" && password == "12345") {
			return true;
		} else {
			return false;
		}
	}
	
	public void logout() {
		System.out.println("로그아웃 되었습니다");
	}
	

}