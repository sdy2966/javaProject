package object2;

public class Singleton {
	private static Singleton singLeton = new Singleton();
	private Singleton() {}
	public static Singleton getInstance() {
		return singLeton;	
	}
	
}
