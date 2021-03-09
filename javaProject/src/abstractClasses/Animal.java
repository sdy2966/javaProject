package abstractClasses;

public abstract  class Animal {
	String species;
	
	public Animal() {
		
	}
	public Animal(String species) {
		this.species = species;
		
	}
	public void showInfo() {
		System.out.println("종류는 " + this.species + "입니다");
	}
	public void breathe() {
		System.out.println("숨을쉬다");
	}
	public abstract void sound(); //추상메소드-기능이 없고 메소드만 정의.애니멀이라는 클래스에서 상속받고난 후 기능부여.
	 
}
