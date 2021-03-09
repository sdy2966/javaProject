package abstractClasses;

import java.util.Scanner;

import inheritances.Friend;
import inheritances.FriendList;

public class AnimalListApp {
	public static void main(String[] args) {
		Friend[] friends = new Friend[10];
		boolean fd = true;
		Scanner scanner = new Scanner(System.in);

		while (fd) {
			System.out.println("---------------------------------------------------------------");
			System.out.println("1.친구 | 2. 학교친구 | 3.회사친구 | 4.전체목록 | 5. 친구이름검색 | 6.종료");
			System.out.println("---------------------------------------------------------------");
			System.out.println("입력>");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.println("이름입력> ");
				String name = scanner.nextLine();
				System.out.println("전화번호> ");
				String pnum = scanner.nextLine();
			} else if (selectNo == 2) {
				System.out.println("이름입력> ");
				String name = scanner.nextLine();
				System.out.println("전화번호> ");
				String pnum = scanner.nextLine();
				System.out.println("부서정보> ");
				String dept = scanner.nextLine();
//				new ComFriend("김민주", "01033335444", "총무");

			} else if (selectNo == 3) {
				System.out.println("이름입력> ");
				String name = scanner.nextLine();
				System.out.println("전화번호> ");
				String pnum = scanner.nextLine();
				System.out.println("과정보> ");
				String dept = scanner.nextLine();	
//				new UnivFriend("김다릐", "0101234567", "역사");
			} else if (selectNo == 4) {
				System.out.println("전체목록");
				System.out.println(FriendList.toString());
			} else if (selectNo == 5) {
				System.out.println("이름검색");
				String fn = scanner.nextLine();
			} else if (selectNo == 6) {
				fd = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
//추가문제. Scanner 클래스..
//1,친구 2.학교친구 3.회사친구 4.전체목록 5.친구이름 검색