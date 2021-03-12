package API;

public class Member {
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;

	public Member(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}

	public Member getMember() {
		Member cloned = null;

		try {
			cloned = (Member) clone();
		} catch (CloneNotSupportedException e) {
			return cloned;
		}
		return cloned;
	}
}
<<<<<<< HEAD
// p467
=======
// public String id;
//
//	public Member(String id) {
//		this.id = id;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (obj instanceof Member) { //https://improver.tistory.com/140
//			Member member = (Member) obj;
//			if (id.equals(member.id)) {
//				return true;
//			}
//
//		}
//return false;
//} equals���� ����
>>>>>>> branch 'master' of https://github.com/sdy2966/javaProject.git
