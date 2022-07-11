package day711;

public class PlusOperator {
	public static void main(String[] args) {
		System.out.println("int + ?");
		System.out.println(10 + 10); // int + int = int
		System.out.println(10 + 3.0); // int + double = double
		System.out.println(10 + 'a'); // int + char = int (char�� a�� �ƽ�Ű�ڵ� ���ڷ� �����Ǿ� ���)
		System.out.println(10 + "�ȳ�"); // int + String = String (String �� int�� ���� ��)
		
		System.out.println("double + ?");
		System.out.println(10.5 + 2); // double + int = double
		System.out.println(10.5 + 0.5); // double + double = double
		System.out.println(10.5 + 'a'); // double + char = double
		System.out.println(10.5 + "�ȳ�"); // double + String = String (String �� double�� ���� ��)
		
		System.out.println("char + ?");
		System.out.println('a' + 10); // char + int = int
		System.out.println('a' + 10.5); // char + doulbe = double
		System.out.println('a' + 'b'); // char + char = int
		System.out.println('a' + "�ȳ�"); // cahr + String = String (String �� char�� ���� ��)

		System.out.println("String + ?"); 
		System.out.println("�ȳ�" + 10 ); // String + int = String
		System.out.println("�ȳ�" + 10.5); // String + double = String
		System.out.println("�ȳ�" + 'a'); // String + char = String
		System.out.println("�ȳ�" + "�ϼ���"); // String + String = String
		
		System.out.println("+�����ڰ� ������ ���Ǿ��� ���");
		System.out.println(10 + "20" + 90 + 'a'); // 102090a
		System.out.println(10 + 'a' + "" + "A"); // 107A
		
		String day = "10";
		System.out.println(10 + day + 1); // 10101
		
	}
}
