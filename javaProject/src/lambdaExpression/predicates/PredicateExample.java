package lambdaExpression.predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동","남자",90),
			new Student("김순이","여자",90),
			new Student("김덕배","남자",92),
			new Student("박한나","여자",95)
			);
	public static double avg(Predicate<Student> predicate) {
		int count = 0, sum = 0;
		for(Student student : list) {
			if(predicate.test(student)) {
				count++;
				sum += student.getScore();
			}
		}
		return (double)sum/count;
		
	}

	public static void main(String[] args) {
//		double femaleAvg = avg(new Predicate<Student>() {
//			@Override
//			public boolean test(Student t) {
//				return t.getSex().equals("여자");
//			}	
//		});
//		----------------------------------------------------를
		double femaleAvg = avg(t-> t.getSex().equals("여자"));
		System.out.println("여자평균 점수: " + femaleAvg);
		
		double maleAvg = avg(t-> t.getSex().equals("남자"));
		System.out.println("남자평균 점수: " + maleAvg);
	}
	
}
