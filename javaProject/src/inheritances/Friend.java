package inheritances;

public class Friend {
	String name;
	String phone;

	public Friend(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "½ÇÄ£ [name=" + name + ", phone=" + phone + "]";
	}

}
