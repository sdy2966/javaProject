package interfaces;

public interface RemoteControl {
	// interface에서는 static final을 따로 지정하지 않아도 자동으로 지정됨.
	static final int MAX_VOLUME = 10;//상수 <-> 변수
	static final int MIX_VOLUME = 10;//상수 <-> 변수 
	//필드만 달랑 지정 못함
	 void turnOn();//추상메소드(구현안함
	 void turnOff();
	void setVolume(int volume);//생성자
	
	
	
}