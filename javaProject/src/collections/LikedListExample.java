package collections;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class LikedListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<> ();//처리 방식에 따라 처리속도가 다름. ArrayList/LinkedList 뭐가 더빠름??
		
		long startTime, endTime;
		startTime = System.nanoTime();
		for(int i=0;i<100000; i++) {
			list.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("걸린시간" + (endTime - startTime));
		
		list = new LinkedList<>();
		startTime = System.nanoTime();
		for(int i=0;i<100000; i++) {
			list.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("걸린시간" + (endTime - startTime));
	}
}
