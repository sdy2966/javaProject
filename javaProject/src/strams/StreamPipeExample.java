package strams;
//p796
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.IntPredicate;
import java.util.function.ToIntFunction;

public class StreamPipeExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("Hong", Member.FEMALE, 47),
				new Member("shin", Member.MALE, 13),
				new Member("bak", Member.MALE, 33),
				new Member("sung", Member.FEMALE, 28)
				);
//				OptionalDouble result = list.stream()//Stream<Member> //더블타입클레스. 값이 없을떄는
//				.filter(new Predicate<Member>() {
//					@Override
//					public boolean test(Member t) {
//						return t.getSex() == Member.FEMALE;
//					}
//				})//Stream<Member>
//				.mapToInt(new ToIntFunction<Member>() {//맵투인t, 필터 순서는 딱히 상관읎
//					@Override
//					public int applyAsInt(Member t) {					
//						return t.getAge();
//					}	
//				})//IntStream
//				.average()	//OptionalDouble -> 최종처리 메소드
//				;
//				System.out.println("평균: "+ result.getAsDouble());	
//	------------------------------------------------------------------------
		
//			컬렉션 -> 스트림 -> 매핑(나이)-> 필터(30세 이상 ) ->평균나이 구해보세요.		
				OptionalDouble result = list.stream()
				.mapToInt(new ToIntFunction<Member>() {
					@Override
					public int applyAsInt(Member t) {
						return t.getAge();	
					}
				})
				.filter(new IntPredicate() {
					@Override
					public boolean test(int t) {					
						return t >= 50;
					}					
				})
				.average();
				System.out.println(result.orElse(0.0)); //값이없다면 디폴드 갓으로 0.0을 출력하라 
				
				if(result.isPresent()) {// 
					System.out.println("평균: "+ result.getAsDouble());	
				} else {
					System.out.println("만족하는 요소가 없음");
				}
	}
	
}
