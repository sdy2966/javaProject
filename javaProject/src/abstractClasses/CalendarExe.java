package abstractClasses;

import java.util.Calendar;

//�޷¸����
public class CalendarExe {
	public static void main(String[] args) {
		showCal(2021, 7);
	}
	public static void showCal(int year, int month) { // �ش����� �޷��� �����ؼ� �����ִ� �޼ҵ�.

		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);//1�� 0  2�� 1 3�� 2 4�� 3.....
		int lastDate = cal.getActualMaximum(Calendar.DATE);
		int firstDay = cal.get(Calendar.DAY_OF_WEEK);// 

		for (int i = 1; i < firstDay; i++) {
			System.out.printf("%3s", " ");// "_" ������ �ϳ� �ڷ� �о���
		}
		for (int i = 1; i <= lastDate; i++) {
			System.out.printf("%3d", i);
			if ((i + firstDay - 1) % 7 == 0) {//��1 ��2 ȭ3 ....+1��
				System.out.println();// �����ٷ� ����
			}
//					System.out.println(cal.get(Calendar.YEAR));
//					System.out.println(cal.get(Calendar.MONTH));
//					System.out.println(cal.get(Calendar.DAY_OF_MONTH));
//					System.out.println(cal.get(Calendar.DAY_OF_WEEK));
//					System.out.println(cal.getActualMaximum(Calendar.DATE));// ���ó�¥
//					System.out.println("-------------------------------");
//					cal.set(2021, 1, 1);// -��¥���� cal ������ -> 2021�� 2�� 1��	

//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
//		System.out.printf("%3d", 9);//d�� ����Ÿ��
//		System.out.printf("%3d", 10);
//		System.out.printf("%5s", "sun");//s�� ����Ÿ��(string)
//		System.out.printf("%5s", "Monday");

//		int lastDate = cal.getActualMaximum(Calendar.DATE);
//		int firstDay = cal.get(Calendar.DAY_OF_WEEK);// ����0
//		
//		for (int i = 1; i < firstDay; i++) {
//			System.out.printf("%3s", " ");// "_" ������ �ϳ� �ڷ� �о���
//		}
//		for (int i = 1; i <= lastDate; i++) {
//			System.out.printf("%3d", i);
//			if ((i + firstDay - 1) % 7 == 0) {//
//				System.out.println();// �����ٷ� ����
//			}
//
//		}

		}

	}
}