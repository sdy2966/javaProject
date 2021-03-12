<<<<<<< HEAD
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
		//ë¨¼ì € ì–•ì€ ë³µì‚¬ë¥¼ í•´ì„œ name, ageë¥¼ ë³µì œí•œë‹¤.
		Member cloned = (Member) super.clone();
		//scoresë¥¼ ê¹Šì€ ë³µì œí•œë‹¤.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		//carë¥¼ ê¹Šì€ë³µì œ
		cloned.car = new Car(this.car.model);
		//ê¹Šì€ ë³µì œëœ Memberê°ì²´ë¥¼ ë¦¬í„´
		return cloned;
	}

	public Member get
	
	
=======
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
		//¸ÕÀú ¾èÀº º¹»ç¸¦ ÇØ¼­ name, age¸¦ º¹Á¦ÇÑ´Ù.
		Member cloned = (Member) super.clone();
		//scores¸¦ ±íÀº º¹Á¦ÇÑ´Ù.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		//car¸¦ ±íÀºº¹Á¦
		cloned.car = new Car(this.car.model);
		//±íÀº º¹Á¦µÈ Member°´Ã¼¸¦ ¸®ÅÏ
		return cloned;
	}

	public Member get
	
	
>>>>>>> branch 'master' of https://github.com/sdy2966/javaProject.git
}