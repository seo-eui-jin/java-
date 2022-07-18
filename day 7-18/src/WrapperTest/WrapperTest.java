package WrapperTest;

public class WrapperTest {
	public static void main(String[] args) {
		int num0 = 10;
		int num1 = 10;
		Integer num2 = new Integer(10);
		Integer num3 = new Integer(10);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		System.out.println("num2 == num3 : " + (num2 == num3)); // �ּ� ���� ���Ѵ� false
		System.out.println(num2.equals(num3)); // ������ ������ ���Ҷ��� .equals()���
		
		System.out.println("--------------");
		System.out.println(num1 == num2);// num2�� auto unboxing
		System.out.println(num2.equals(num1));// num1�� auto boxing
		System.out.println("--------------");
		
		String str1 = "�ȳ�";
		String str2 = "�ȳ�";
		String str3 = new String("�ȳ�");
		String str4 = new String("�ȳ�");
		System.out.println(str1 == str2);
		System.out.println(str3 == str4);	
		
	}
}
