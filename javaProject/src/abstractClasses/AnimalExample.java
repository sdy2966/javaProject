package abstractClasses;

public class AnimalExample {
	public static void main(String[] args) {
		//Animal animal = new Animal();추상클래스는 인스턴스 생성 불가.
	Animal animal = new Bird("조류");
	animal.showInfo();
	animal.breathe();
	animal.sound();
	
	
	animal = new Cat("포유류");
	animal.showInfo();
	animal.breathe();
	animal.sound();
	}
}
