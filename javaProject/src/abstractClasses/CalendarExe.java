package abstractClasses;

import java.util.Calendar;

//달력만들기
public class CalendarExe {
	public static void main(String[] args) {
		showCal(2021, 7);
	}
	public static void showCal(int year, int month) { // 해당년월의 달력을 생성해서 보여주는 메소드.

		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);//1월 0  2월 1 3월 2 4월 3.....
		int lastDate = cal.getActualMaximum(Calendar.DATE);
		int firstDay = cal.get(Calendar.DAY_OF_WEEK);// 

		for (int i = 1; i < firstDay; i++) {
			System.out.printf("%3s", " ");// "_" 공란을 하나 뒤로 밀어줌
		}
		for (int i = 1; i <= lastDate; i++) {
			System.out.printf("%3d", i);
			if ((i + firstDay - 1) % 7 == 0) {//일1 월2 화3 ....+1씩
				System.out.println();// 다음줄로 끊기
			}
//					System.out.println(cal.get(Calendar.YEAR));
//					System.out.println(cal.get(Calendar.MONTH));
//					System.out.println(cal.get(Calendar.DAY_OF_MONTH));
//					System.out.println(cal.get(Calendar.DAY_OF_WEEK));
//					System.out.println(cal.getActualMaximum(Calendar.DATE));// 오늘날짜
//					System.out.println("-------------------------------");
//					cal.set(2021, 1, 1);// -날짜지정 cal 변수값 -> 2021년 2월 1일	

//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
//		System.out.printf("%3d", 9);//d는 숫자타입
//		System.out.printf("%3d", 10);
//		System.out.printf("%5s", "sun");//s는 문자타임(string)
//		System.out.printf("%5s", "Monday");

//		int lastDate = cal.getActualMaximum(Calendar.DATE);
//		int firstDay = cal.get(Calendar.DAY_OF_WEEK);// 월욜0
//		
//		for (int i = 1; i < firstDay; i++) {
//			System.out.printf("%3s", " ");// "_" 공란을 하나 뒤로 밀어줌
//		}
//		for (int i = 1; i <= lastDate; i++) {
//			System.out.printf("%3d", i);
//			if ((i + firstDay - 1) % 7 == 0) {//
//				System.out.println();// 다음줄로 끊기
//			}
//
//		}

		}

	}
}