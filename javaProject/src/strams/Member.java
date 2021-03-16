package strams;

public class Member {
	public static int FEMALE = 0;
	public static int MALE =1;
	
	private String name;
	private int sex;
	private int age;
	
	public Member(String name, int sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public static int getFEMALE() {
		return FEMALE;
	}

	public static int getMALE() {
		return MALE;
	}

	public String getName() {
		return name;
	}

	public int getSex() {
		return sex;
	}

	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return this.name.hashCode() + this.sex + this.age;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member s = (Member) obj;
			return this.age == s.age && this.name.equals(s.name) && this.sex == s.sex;
		}
		return false;
	}
	
	
}
