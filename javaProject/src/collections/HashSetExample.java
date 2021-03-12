package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Fruit {
	int price;
	Fruit(int price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		return price;
	}
	@Override
	public boolean equals(Object obj) {
		Fruit f = (Fruit) obj;
		return this.price == f.price;
	}
	
}

public class HashSetExample {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(100);
		Iterator<Integer> iter = set.iterator();//반복자
		while(iter.hasNext()) {
			Integer result = iter.next();
		//	System.out.println(result);   반복자를 통해서 값을 가겨오도록함.
		}
		
		Set<Fruit> fSet = new HashSet<>();
		fSet.add(new Fruit(1000));
		fSet.add(new Fruit(2000));
		fSet.add(new Fruit(3000));
		fSet.add(new Fruit(1000));
		
		//동일한 값은 중복하지 않겠다.
		
		Iterator<Fruit> fIter = fSet.iterator();
		for(;fIter.hasNext();) {
			fIter.next();
			Fruit f = fIter.next();
			System.out.println(f.price);
		}
		
	}
	
}
