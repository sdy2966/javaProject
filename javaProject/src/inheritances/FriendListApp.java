package inheritances;

import java.util.Scanner;

public class FriendListApp {
	static Friend[] friends = new Friend[10];

	public static void main(String[] args) {

		boolean fd = true;
		Scanner scanner = new Scanner(System.in);

		while (fd) {
			System.out.println("---------------------------------------------------------------");
			System.out.println("1.친구 | 2. 회사친구 | 3.학교친구 | 4.전체목록 | 5. 친구이름검색 | 6.종료");
			System.out.println("---------------------------------------------------------------");
			System.out.println("입력>");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.println("이름입력> ");
				String name = scanner.next();
				System.out.println("전화번호> ");
				String phone = scanner.next();
				Friend friend = new Friend(name, phone);
				saveFriend(friend);
			} else if (selectNo == 2) {
				System.out.println("이름입력> ");
				String name = scanner.next();
				System.out.println("전화번호> ");
				String phone = scanner.next();
				System.out.println("부서정보> ");
				String department = scanner.next();
				Friend friend = new ComFriend(name, phone, department);
				saveFriend(friend);
			} else if (selectNo == 3) {
				System.out.println("이름입력> ");
				String name = scanner.next();
				System.out.println("전화번호> ");
				String phone = scanner.next();
				System.out.println("과정보> ");
				String major = scanner.next();
				Friend friend = new UnivFriend(name, phone, major);
				saveFriend(friend);
			} else if (selectNo == 4) {
				System.out.println("전체목록");
				for (Friend friend : friends) {// 향상된포a문
					if (friend != null) {// !=같지않다
						System.out.println(friend.toString());
					}
				}
			} else if (selectNo == 5) {
				System.out.println("찾을이름 검색");
				String findName = scanner.next();
				for (Friend friend : friends) {
					if (friend != null && friend.name.equals(findName)) {
						System.out.println("친구정보: " + friend.toString());
					}
				}
			} else if (selectNo == 6) {
				fd = false;
			} else {
				System.out.println("다시입력하시오");
			}
		}
		System.out.println("프로그램 종료");
	}// end of main

	public static void saveFriend(Friend friend) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
	}

}
//추가문제. Scanner 클래스..
//1,친구 2.학교친구 3.회사친구 4.전체목록 5.친구이름 검색