package objects;

public class Cal {
	public static void main(String[] args) {
		showInfo("ȫ����");
		showInfo("�浿��");
		Student2 std = new Student2();
		std.setName("������");
		std.setEng(3);
		std.setMath(11);
		showInfo(std);

		Student2[] stds = new Student2[3];
		stds[0] = new Student2("�����", 90, 99);
		stds[1] = new Student2("�ڼҿ�", 97, 89);
		stds[2] = new Student2("�����", 94, 92);
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
		System.out.println(student.getName() + ", �ȳ�");
		System.out.println(student.getName() + " ����������" + " ��������" + student.getEng() + " ��������" + student.getMath()
				+ " ���ؼ�" + (student.getEng() + student.getMath()));

	}

	public static void showInfo(String name) {
		System.out.println(name + " ����");
	}
}
