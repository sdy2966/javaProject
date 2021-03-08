package interfaces;

public class RemotecontrolExe {

	public static void main(String[] args) {
		RemoteControl rc = new Television();// �����ܰ迡 �ִ� ��

		rc.turnOn();
		rc.setVolume(6);
		rc.turnOff();

		rc = new Audio();
		rc.turnOn();
		rc.setVolume(7);
		rc.turnOff();

		rc = new RemoteControl() {
			private int volume;

			@Override
			public void turnOn() {
				System.out.println("dvd��");
			}

			@Override
			public void turnOff() {
				System.out.println("dvd��");
			}

			@Override
			public void setVolume(int volume) {
				this.volume = volume;
				System.out.println("dvd ����: " + volume);
			}
		};
		rc.turnOn();
		rc.setVolume(13);
		rc.turnOff();
	}

}
