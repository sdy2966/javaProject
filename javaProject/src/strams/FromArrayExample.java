package strams;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayExample {
	public static void main(String[] args) {
		String[] strArray = { "홍길동", "신용권", "김미나" };
		Stream<String> strStream = Arrays.stream(strArray); // Stream<T>
		strStream.forEach(a -> System.out.print(a + ",")); // forEach는 컨수머 를 구현하는
		System.out.println();

//		int[] intArray = { 1, 2, 3, 4, 5 };
//		IntStream intStream = Arrays.stream(intArray); // Stream<Integer> vs IntStream
//		intStream.forEach(a -> System.out.print(a + ","));
//		System.out.println();

		int[] intArray = { 1, 2, 3, 4, 5 };
		IntStream intStream = IntStream.of(intArray); // Stream<Integer> vs IntStream
		IntStream = Arrays.stream(intArray);

		int sum = 0;
		sum = intStream.filter(new IntPredicate() {
			@Override
			public boolean test(int value) {
				return value % 2 == 0;
			}
		}).sum();
		System.out.println("합계는: " + sum);
		
		intStream = Arrays.stream(intArray);
		OptionalDouble od = intStream.filter(value -> value %2 == 0).average(); 
		System.out.println("평균: " + od.getAsDouble());
		
		int sum = 0;
		for (int a : intArray) {
			if (a % 2 == 0)
				sum += a;
		}
		System.out.println("합계는: " + sum);

	}

}
