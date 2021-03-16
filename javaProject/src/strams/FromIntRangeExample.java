package strams;

import java.util.stream.IntStream;

public class FromIntRangeExample {
	
	public static int sum;
	public static void main(String[] args) {
		IntStream is = IntStream.range(10, 20);//ㅇ
		is = IntStream.rangeClosed(10, 20);
		is.forEach(v -> sum += v );//is.forEach(v -> System.out.println(sum));
		System.out.println(sum);
		
		//15~35까지 합?
		int from  = 15, to = 35;
		is = IntStream.rangeClosed(15, 35);
		
	}
}
