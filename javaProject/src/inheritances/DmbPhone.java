package inheritances;

public class DmbPhone extends Cellphone {// extends 클래스 이름 -> 상속받ㄴ겠다는 뜻
	// 필드
	int channel;
	// 생성자

	// ㅁㅔ소드
	void turnOnDmb() {
		System.out.println("채널: " + channel + "방송을 수신합니다");
	}

	void changeChannnel(int channel) {
		this.channel = channel;
		System.out.println("채널: " + channel + "로 변경합니다");
	}

	void turnOffDmb() {
		System.out.println("방종");
	}

	@Override//
	void powerOn() {
		System.out.println("DmbPhone 전원을 켭니다");
	}

	@Override
	void powerOff() {
		System.out.println("DmbPhone 전원을 끕니다");
	}

	@Override
	void bell() {
		System.out.println("DmbPhone 벨이 울립니다");
	}

	@Override
	public String toString() {
		return "CellPhone => model : " +model + "color: " + color + "channel : " + channel;
	}
	
}
