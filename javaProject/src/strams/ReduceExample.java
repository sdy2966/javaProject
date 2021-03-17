package strams;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {

	public static void main(String[] args) {
		Student[] students = {
				new Student("Hong", 10), 
				new Student("Shin", 50),
				new Student("Yun", 40)
		};
		
		int sum = Arrays.stream(students)
				.mapToInt(s -> s.getScore())
				.reduce(0, new IntBinaryOperator() {
					
					
				}
						
						
						);
		System.out.println("sum: "+ sum);
				
		
		}
	}
}
