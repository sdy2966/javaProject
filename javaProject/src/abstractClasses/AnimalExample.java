package abstractClasses;

public class AnimalExample {
	public static void main(String[] args) {
		//Animal animal = new Animal();�߻�Ŭ������ �ν��Ͻ� ���� �Ұ�.
	Animal animal = new Bird("����");
	animal.showInfo();
	animal.breathe();
	animal.sound();
	
	
	animal = new Cat("������");
	animal.showInfo();
	animal.breathe();
	animal.sound();
	}
}
