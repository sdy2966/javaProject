package inheritances;

public class DmbPhone extends Cellphone {// extends Ŭ���� �̸� -> ��ӹޤ��ڴٴ� ��
	// �ʵ�
	int channel;
	// ������

	// ���ļҵ�
	void turnOnDmb() {
		System.out.println("ä��: " + channel + "����� �����մϴ�");
	}

	void changeChannnel(int channel) {
		this.channel = channel;
		System.out.println("ä��: " + channel + "�� �����մϴ�");
	}

	void turnOffDmb() {
		System.out.println("����");
	}

	@Override//
	void powerOn() {
		System.out.println("DmbPhone ������ �մϴ�");
	}

	@Override
	void powerOff() {
		System.out.println("DmbPhone ������ ���ϴ�");
	}

	@Override
	void bell() {
		System.out.println("DmbPhone ���� �︳�ϴ�");
	}

	@Override
	public String toString() {
		return "CellPhone => model : " +model + "color: " + color + "channel : " + channel;
	}
	
}
