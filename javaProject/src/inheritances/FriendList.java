package inheritances;

public class FriendList {
	public static void main(String[] args) {
		Friend[] friends = new Friend[10];

		friends[0] = new Friend("김민주", "011 2344123");
		friends[1] = new ComFriend("박소연", "010123455", "총무부서");
		friends[2] = new UnivFriend("김다희", "07012344321", "역사학과");

		for (Friend friend : friends) {//향상된포a문
			if (friend != null) {//!=같지않다
				System.out.println(friend.toString());
			}
		}
	}
}
//추가문제. Scanner 클래스..
//1,친구 2.학교친구 3.회사친구 4.전체목록 5.친구이름 검색