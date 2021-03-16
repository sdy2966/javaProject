package strams;

import java.util.Arrays;
import java.util.List;

public class FlatMapExamle {
	public static void main(String[] args) {
		
		
		
		List<String> inputList2 = Arrays.asList("10, 20, 30", "40, 50, 60");
		inputList2.stream()//Stream<String>
		.flatMapToInt(data -> {
			String[] strArr = data.split(",");
			int[] intArr = new int[strArr.length];
			for(int i=0; i<strArr.length; i++) {
				intArr[i] = Integer.parseInt(strArr[i].trim());
			}
			return Arrays.stream(intArr); //어레이에 int형이 들오면 인트형으로, 문자형이 들옴 문자형으로, 롱형이 들옴 롱형으로
			
		})//IntStream
		.forEach(number -> System.out.println(number));//forEach컨수머타입
	}

}
