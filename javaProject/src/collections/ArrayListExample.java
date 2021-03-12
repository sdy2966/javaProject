package collections;

import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		String [] strAry = new String[10];//null
		strAry[0] = "Hello";
		strAry[1] = "World";
		strAry[4] = "Nice";
		
		for(int i = 0; i< strAry.length; i++) {
			if(strAry[i] != null)
//				System.out.println(strAry[i]);
		}

	}

	List<Integer> numList = new ArrayList();// 문자열만 담겠다
	numList.add(10);numList.add(20);numList.add(0);

	List<String> strList = new ArrayList();// 문자열만 담겠다
	strList.add("Hello");// 0
	strList.add("Nice");// 1
	strList.add("Good");// 2
	strList.add(0,"very");// 저장할 위치를 지정

	for (int i = 0;i<strList.size();i++) {
		strList.get(i);
	 strList.remove(2);
	}
	System.out.println(strList.size());strList.remove(2);System.out.println(strList.size());
//	for (int i = 0; i<5000; i++) {
//		strList.add(String.valueOf(i));
//	}
//	strList.add(100);

	for(
	Object obj:strList) {
		String str = (String) obj;
		System.out.println(str.equals("Hello"));
	}
}