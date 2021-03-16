package strams;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {
	public static void main(String[] args) {
//		List<String> names = Arrays.asList("홍길동", "신용권", "김자바", "신용권", "김민철"); 
//		
//		names.stream()
//		.distinct()
//		.forEach(n -> System.out.println(n));
//		System.out.println();
//		
//		names.stream()
//		.filter(n -> n.startsWith("신"))
//		.forEach(n -> System.out.println(n));
//		System.out.println();
//		
//		names.stream()
//		.distinct()
//		.filter(n -> n.startsWith("신"))
//		.forEach(n -> System.out.println(n));
//-----------------스트링타입일경우--------------------------

		List<Member> members = Arrays.asList(
				new Member("Hong", Member.FEMALE, 47),
				new Member("shin", Member.MALE, 13),
				new Member("bak", Member.MALE, 33),
				new Member("Hong", Member.FEMALE, 21),
				new Member("sung", Member.FEMALE, 28),
				new Member("Hong", Member.MALE, 47),
				new Member("Hong", Member.FEMALE, 50)
				);
		members.stream()//
				.distinct()//hashCode,equals
				.forEach(System.out::println);
		
	}

}
