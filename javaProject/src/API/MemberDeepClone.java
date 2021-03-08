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
		//���� ���� ���縦 �ؼ� name, age�� �����Ѵ�.
		Member cloned = (Member) super.clone();
		//scores�� ���� �����Ѵ�.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		//car�� ��������
		cloned.car = new Car(this.car.model);
		//���� ������ Member��ü�� ����
		return cloned;
	}

	public Member get
	
	
}