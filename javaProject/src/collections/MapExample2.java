package collections;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<Strint, Integer>();
		map.put("홍길동", 10);
		map.put("김민수", 20);
		map.remove("홍길동");

		// 
		Integer result = map.get("홍길동");
		System.out.println("Key: 홍길동" + ", val: " + result);
		if (map.containsKey("홍길동")) {
			System.out.println("Key: 홍길동" + ", val: " + result);
		}
//		Set<String>
		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			Integer val = map.get(key);
			System.out.println("Key: " + key + ", val: " + result);
		}
		// Set<Entry<String, Integer>>
		Set<Entry<String, Integer>> enSet = map.entrySet();
		Interator<Entry<String, Integer>> entIter = entSet.iterator();
		while (entIter.hashNext()) {
			Entry<String, Interger> ent = intIter.next();
			String key = ent.getKey();
			Integer val = ent.getValue();
			System.out.println("key:" + key + ",val" + val);

		}

	}

}
