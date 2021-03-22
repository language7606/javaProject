package interfaces;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc = new Audio();
		
		
		//익명구현객체
		RemoteControl rcc = new RemoteControl() {
			public void turnOn() {
				System.out.println(1);
			}

			public void turnOff() {
				System.out.println(2);
			}

			public void setVolume(int volume) {
				System.out.println(volume);
				return;
			}
		};
	}
}