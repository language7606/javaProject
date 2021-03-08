package interfaces;

public interface RemoteControl {
	int MAX_VOLUME = 10; // 상수	static final int MAX_VOLUME = 10; 와 동일
	int MIN_VOLUME = 0; // 상수
	
	void turnOn();//추상메소드(구현X)
	void turnOff();
	void setVolume(int volume);
	
}
