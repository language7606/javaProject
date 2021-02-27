package variables;

public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		int i = 128;	//casting
		
		if(i < Byte.MIN_VALUE||i > Byte.MAX_VALUE) {
			System.out.println("byte타입으로 변환할 수 없습니다.");
			System.out.println("값을 확인하세요.");
		}else {
			byte b =(byte) i;
			System.out.println("byte타입 값: " + b);
		}
	}

}
