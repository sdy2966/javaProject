package objects;

public class Cal {
	public static void main(String[] args) {
		showInfo("홍길이");
		showInfo("길동이");
		Student2 std = new Student2();
		std.setName("동길이");
		std.setEng(3);
		std.setMath(11);
		showInfo(std);

		Student2[] stds = new Student2[3];
		stds[0] = new Student2("김민주", 90, 99);
		stds[1] = new Student2("박소연", 97, 89);
		stds[2] = new Student2("김다희", 94, 92);
		showInfo(std);
	}

	public static void showInfo(Student2[] students) {
		for (Student2 std : students) {
			if (std != null) {
				showInfo(std);
			}
		}
	}

	public static void showInfo(Student2 student) {
		System.out.println(student.getName() + ", 안녕");
		System.out.println(student.getName() + " 시험점수는" + " 영어점수" + student.getEng() + " 수학점수" + student.getMath()
				+ " 더해서" + (student.getEng() + student.getMath()));

	}

	public static void showInfo(String name) {
		System.out.println(name + " 하이");
	}
}
