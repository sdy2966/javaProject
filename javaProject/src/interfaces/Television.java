package interfaces;

public class Television implements RemoteControl {
	int volume;

	@Override
	public void turnOn() {
		System.out.println("Ƽ����");

	}

	@Override
	public void turnOff() {
		System.out.println("Ƽ��");

	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIX_VOLUME) {
			this.volume = RemoteControl.MIX_VOLUME;
		} else {
		this.volume = volume;
		}
		System.out.println("���� ������" + volume);
	}

}
