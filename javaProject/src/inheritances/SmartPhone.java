package inheritances;

public class SmartPhone extends DmbPhone {

	@Override
	void powerOn() {
		System.out.println("smart������");
	}

	@Override
	void powerOff() {
		System.out.println("smart��");
	}

}
