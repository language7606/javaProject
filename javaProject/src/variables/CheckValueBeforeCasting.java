package variables;

public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		int i = 128;	//casting
		
		if(i < Byte.MIN_VALUE||i > Byte.MAX_VALUE) {
			System.out.println("byteŸ������ ��ȯ�� �� �����ϴ�.");
			System.out.println("���� Ȯ���ϼ���.");
		}else {
			byte b =(byte) i;
			System.out.println("byteŸ�� ��: " + b);
		}
	}

}
