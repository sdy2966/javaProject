package inheritances;

public class ComFriend extends Friend {
	String department;

	public ComFriend(String name, String phone, String department) {
		super(name, phone);// �θ������ ���� �Ҵ�
		this.department = department;
	}

	@Override
	public String toString() {
		return "ȸ�絿�� [department=" + department + ", name=" + name + ", phone=" + phone + "]";
	}

}
