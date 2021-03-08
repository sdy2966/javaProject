package inheritances;

public class ComFriend extends Friend {
	String department;

	public ComFriend(String name, String phone, String department) {
		super(name, phone);// 부모생성자 값을 할당
		this.department = department;
	}

	@Override
	public String toString() {
		return "회사동기 [department=" + department + ", name=" + name + ", phone=" + phone + "]";
	}

}
