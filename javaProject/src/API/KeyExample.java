package API;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		//Key 객체를 식별키로 사용해서 String값을 저장하는 HashMqp 객체생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		//식별키 "new Key(1)" 로 "홍길동"을 저장함
		hashMap.put(new Key(1), "홍길동");
		
		//식별키 "new Key(1)" 로 "홍길동"을 읽엉놈
		String value = hashMap.get(new Key(1));
		System.out.println(value);
				
	}

}
