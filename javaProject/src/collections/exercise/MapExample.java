package collections.exercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("while", 92);
		
		String name = null; 
		int maxScore = 0;
		int totoalScore = 0;
		
		
		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String Key = iter.next();
			int score = map.get(Key);
			totoalScore +=score;
			if(maxScore < score) {
				maxScore = map.get(Key);
				name = Key;
			}
		}
		System.out.println("평균점수: "+ totoalScore / map.size());
		System.out.println("최고점수: " + maxScore);
		System.out.println("최고점수를 받은 아니디: " + name);
		
		String str;
		System.out.println("b".compareTo("a"));
		
		TreeSet<String> tSet = new TreeSet<>();
		tSet.add("a");
		tSet.add("b");
		tSet.add("c");
		tSet.first();
		tSet.last();
		
		
	}

}
