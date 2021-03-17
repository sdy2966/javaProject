
package strams;

//p803
import java.util.Arrays;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList (
				new Student("Hong", 30), 
				new Student("Shin", 50),
				new Student("Yun", 40)
				);

//		studentList.stream()// Stream<Student>
//1		.mapToInt(Student :: getScore)--메소드 참조 방식// IntStream != Stream<Integer>
//2		.mapToInt(s -> s.getScore)		
//1		.forEach(score -> System.out.println(score));
//2  	.forEach(s -> System.out.println(s));
//		교재(람다식)---------------------------------------

		studentList.stream()// Stream<Student>
				.mapToInt(new ToIntFunction<Student>() {
					@Override
					public int applyAsInt(Student s) {
						System.out.println(s.getName());
						return s.getScore();
					}
				})// IntStream != Stream<Integer>
				.forEach(new IntConsumer() {
					@Override
					public void accept(int value) {
						System.out.println(value);
					}
					
				});
		int[] intAry = {};
		Integer[] integerAry = {};
		
		IntStream is = Arrays.stream(intAry);
		Stream<Integer> iss = Arrays.stream(integerAry);
		
	}
}
