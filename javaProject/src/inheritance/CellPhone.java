package inheritance;

public class CellPhone {
	// 필드
	String model;
	String color;
	// 생성자

	// 메소드
	void powerOn() {
		System.out.println("켜");
	}

	void powerOff() {
		System.out.println("꺼");
	}

	void bell() {
		System.out.println("벨");
	}

	void sendVoice(String message) {
		System.out.println("본인 : " + message);
	}

	void receiveVoice(String message) {
		System.out.println("상대방 : " + message);
	}

	void hangUp() {
		System.out.println("끊어");
	}
}
