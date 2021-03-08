package interfaces;

public class RemoteControlExe {
	public static void main(String[] args) {
		RemoteControl rc = new Television();
		
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc = new RemoteControl() {
			int volume;
			@Override
			public void turnOn() {
				System.out.println("DVD를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("DVD를 끕니다.");
				
			}

			@Override
			public void setVolume(int volume) {
				this.volume = volume;
				System.out.println("DVD볼륨 "+volume);
			}//익명 구현 객체.
			
			
		};
		rc.turnOn();
		rc.setVolume(8);
		rc.turnOff();
	}

}
