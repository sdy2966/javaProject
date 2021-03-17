package strams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortingExample {
	public static void main(String[] args) {
		int[] intAry = {5,3,1,2,4};
		IntStream is = Arrays.stream(intAry);
		is.sorted().forEach(number -> System.out.println(number));
		
		Student[] stdAry = {new Student("Hong",10)//
			, new Student("Shin",20)
			, new Student("Yun",30)};
			Stream<Student>st = Arrays.stream(stdAry);
			st.sorted().forEach(s -> System.out.println(s.getName()));
			
			
			//Hong,30 - Shin,20 -양의 값/오름차순
			//Yun,15 - Shin,20 - 음의 값. -Hong,30내림차순
		}

	}


