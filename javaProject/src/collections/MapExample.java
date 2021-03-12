package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
//쓰는뱅식은 해쉬맵이나 맵이나같음 아이고 두야
public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();//String 은key integer는 val
		map.put("홍길이", 15);//put 메소드로 저장.  키에해당하는 부분은 중복값안된다고!!!! -> 같은놈이라고 인식.
		map.put("김민주", 20);
		map.put("박소연", 23);
		map.put("홍길이", 25);//글서 두번째꺼로 덮어씀.
		//느넝ㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇ어
		
		Integer result = map.get("홍길이");//키값
		
		Set<String> set = map.keySet();
		//반복자를 안쓰려면
		for(String key : set) {
			Integer val = map.get(key);
			System.out.println("key: "+ key + ", val:" + val);
		}
		
		
		
//		Iterator<String> iter = set.iterator();
//		while(iter.hasNext()) {
//			String key = iter.next();
//			Integer val = map.get(key);
//			System.out.println("key: "+ key + ", val:" + val);
//		}
		
		
		Map<Integer, String> sMap = new HashMap<>();
		String sResult = sMap.get(10);
		
		
		
	}

}
