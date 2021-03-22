package interfaces;

public interface RemoteControl {

	// 상수
	int MAX_VOLUME = 10; // static final int MAX_VOLUME = 10; 와 동일
	int MIN_VOLUME = 0;

	// 추상메소드
	public void turnOn();// 구현X

	public void turnOff();

	public void setVolume(int volume);

	// 디폴트 메소드
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}

	// 정적메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
