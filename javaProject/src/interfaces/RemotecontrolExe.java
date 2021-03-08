package interfaces;

public class RemotecontrolExe {

	public static void main(String[] args) {
		RemoteControl rc = new Television();// 구현단계에 있느 이

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
				System.out.println("dvd켜");
			}

			@Override
			public void turnOff() {
				System.out.println("dvd꺼");
			}

			@Override
			public void setVolume(int volume) {
				this.volume = volume;
				System.out.println("dvd 볼륨: " + volume);
			}
		};
		rc.turnOn();
		rc.setVolume(13);
		rc.turnOff();
	}

}
