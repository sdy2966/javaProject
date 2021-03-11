package generics;

public class Apple {
	int price;
	String kind;
	
	Apple(int price, String kind) {
		this.price = price;
		this.kind = kind;
	}

	@Override
	public boolean equals(Object obj) {
		Apple a = (Apple) obj;
		return this.kind.equals();
		
	}
	
}
