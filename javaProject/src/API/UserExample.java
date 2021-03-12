package API;

public class UserExample {
	public static void main(String[] args) {
		System.out.println("hello".hashCode());
		System.out.println("hello23".hashCode());
		
		User user1 = new User();
		user1.userId = "user1";
		user1.score = 80;
		
		User user2 = new User();
		user2.userId = "user1";
		user2.score = 80;
		
		System.out.println(user1 == user2);
		
		HashMa<Use,String> hashMap =new HashMap<>();// 해당되는 키값을
		hashMap.put(user1, "홍길동");
		hashMap.put(user1, "김길동");
		hashMap.put(user2, "정길동");
		
		String r1 = hashMap.get(user1);//겟이라는 메소드에 키값을 넣으면,
		String r2 = hashMap.get(user2);//
		System.out.println(r1 + ", "+ r2);
	}

}
