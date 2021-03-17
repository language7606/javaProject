package inheritance.car2;

public class Car {
	Tire[] tires = {

			new Tire("앞왼쪽", 3), new Tire("앞오른쪽", 5), new Tire("뒤왼쪽", 7), new Tire("뒤오른쪽", 9) };

	public int run() {
		System.out.println("[자동차가 달립니다.]");
		for (int i = 0; i < tires.length; i++) {
			if (tires[i].roll() == false) {
				stop();
				return (i + 1);
			}
		}
		return 0;
	}

	public void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
// 배열 적용 전 코드
//public class Car {
//	Tire frontLeftTire = new Tire("앞왼쪽", 3);
//	Tire frontRightTire = new Tire("앞오른쪽", 5);
//	Tire backLeftTire = new Tire("뒤왼쪽",7);
//	Tire backRightTire = new Tire("뒤오른쪽",9);
//
//	public int run() {
//		System.out.println("[자동차가 달립니다.]");
//		if (frontLeftTire.roll() == false) {
//			// 메세지
//			stop();
//			return 1;
//		}
//		if (frontRightTire.roll() == false) {
//			stop();
//			return 2;
//		}
//		if (backLeftTire.roll() == false) {
//			stop();
//			return 3;
//		}
//		if (backRightTire.roll() == false) {
//			stop();
//			return 4;
//		}
//		return 0;
//	}
//
//	public void stop() {
//		System.out.println("[자동차가 멈춥니다.]");
//	}
//}
