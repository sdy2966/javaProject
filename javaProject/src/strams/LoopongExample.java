package strams;

import java.util.Arrays;
import java.util.function.IntConsumer;

public class LoopongExample {
	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5};
		 Arrays.stream(intAry)// peek는 
		 .peek(new IntConsumer() {
			@Override
			public void accept(int value) {
				System.out.println("peek: "+ value);
			}
	 
		 })
		 .filter(n -> n> 2)
		 .forEach(s -> System.out.println("forEach: "));
		
		 
		 System.out.println("end");
	}

}
