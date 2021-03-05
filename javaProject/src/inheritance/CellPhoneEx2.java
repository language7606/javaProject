package inheritance;

public class CellPhoneEx2 {
	public static void main(String[] args) {
		CellPhone cp = new CellPhone();
//		cp = (CellPhone) new DmbPhone(); // int = (int) byte; 같은 자동형변환과 비슷
//		cp = new SmartPhone();
		cp.color="";
		
		if(cp instanceof DmbPhone) {
			DmbPhone dp = (DmbPhone) cp;
			dp.model = "";
			dp.color = "";
			dp.channel = 15;
			dp.powerOn();
		} else {
			System.out.println("Casting 할 수 없습니다.");
		}
		
		// 다형성
		// 부모 = 자식들...
		// 부모.메소드 = 자식.메소드;
		cp = new DmbPhone();
		cp.powerOn();
		
		cp = new SmartPhone();
		cp.powerOn();
	}
}
