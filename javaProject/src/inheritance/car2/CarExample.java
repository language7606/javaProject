package inheritance.car2;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();

		for (int i = 0; i <= 15; i++) {
			int problemLocation = car.run();
			if (problemLocation != 0) {
				System.out.println(car.tires[problemLocation - 1].location + "HankookTire로 교체");
				car.tires[problemLocation - 1] = new HankookTire(car.tires[problemLocation - 1].location, 20);
			}
			System.out.println("========================================");
		} // end of for
		System.out.println("프로그램 종료.");
	} // end of main
} // end of class

//배열 적용 전 코드
//public class CarExample {
//	public static void main(String[] args) {
//		Car car = new Car();
//		for(int i=0; i<10; i++) {
//			int problemLocation=car.run();
//			switch(problemLocation) {
//			case 1:
//				System.out.println("앞왼쪽 HankookTire 교체");
//				car.frontLeftTire = new HankookTire("앞왼쪽", 10);
//				break;
//			case 2:
//				System.out.println("앞오른쪽 KumhoTire 교체");
//				car.frontRightTire = new KumhoTire("앞오른쪽", 12);
//				break;
//			case 3:
//				System.out.println("뒤왼쪽 HankookTire 교체");
//				car.backLeftTire = new HankookTire("뒤왼쪽", 15);
//				break;
//			case 4:
//				System.out.println("뒤오른쪽 KumhoTire 교체");
//				car.backRightTire = new KumhoTire("뒤오른쪽", 20);
//				break;
//			}
//			System.out.println("========================================");
//		}			//end of for
//		System.out.println("프로그램 종료.");
//	}		//end of main
//} //end of class
//
