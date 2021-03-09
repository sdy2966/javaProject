package API;

import java.util.Arrays;

public class MemberDeepClone {
	public String name;
	public int age;
	public int[] scores;
	public Car car;

	public MemberDeepClone(String name, int age,int[]scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.Car = car;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//먼저 얕은 복사를 해서 name, age를 복제한다.
		Member cloned = (Member) super.clone();
		//scores를 깊은 복제한다.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		//car를 깊은복제
		cloned.car = new Car(this.car.model);
		//깊은 복제된 Member객체를 리턴
		return cloned;
	}

	public Member get
	
	
}