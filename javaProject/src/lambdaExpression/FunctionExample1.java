package lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {
	public static List<Student> list = Arrays.asList(//
			new Student("홍길동",90,96),//
			new Student("신용권",95,93)//
			);
	
	public static void printString(Function<Student, String> function ) {// 매개값이 펑션 Function 변수이름이function
		for(Student student : list) {
			System.out.println(function.apply(student)+ " ");
			
		}
		System.out.println();
	}
	
	public static void printInt( ToIntFunction<Student> function ) {
	for(Student student : list) {
		System.out.print(function.applyAsInt(student)+ " ");
		
	}
	System.out.println();
	
}
//기능을 매개갓으로 주겟다	
	public static void main(String[] args) {
//		printString(new Function<Student, String>(){ //<Student매개값, String리턴>
//			@Override
//			public String apply(Student t) {//(Student매개값 t- String리턴)
//				return t.getName();
//			}
//			
//		});//원래 익명구현객체
		System.out.println("[학생이름]");
		printString(t -> t.getName());
		
		System.out.println("[영어 점수]");
		printInt(t -> t.getEnglishScore());
		
		System.out.println("[수학 점수]");
		printInt(t -> t.getMathScore());
		
	}
	
}
