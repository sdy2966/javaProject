package interfaces;

public interface RemoteControl {
	// interface������ static final�� ���� �������� �ʾƵ� �ڵ����� ������.
	static final int MAX_VOLUME = 10;//��� <-> ����
	static final int MIX_VOLUME = 10;//��� <-> ���� 
	//�ʵ常 �޶� ���� ����
	 void turnOn();//�߻�޼ҵ�(��������
	 void turnOff();
	void setVolume(int volume);//������
	
	
	
}