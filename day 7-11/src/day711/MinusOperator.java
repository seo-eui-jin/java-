package day711;

public class MinusOperator {
	public static void main(String[] args) {
		System.out.println(10 - 5); // int - int = int
		System.out.println(10 - 0.0); // int - double = double
		System.out.println(10 - 'a'); // int - char = int
		// System.out.println(10 - "�ȳ�"); // int - String = ���� (String�� ���� �Ұ���)
		
		System.out.println(10.0 - 10.1); // double - double = double
		System.out.println(10.0 - 'a'); // double - char = double
		// System.out.println(10.0 - "�ȳ�"); // double - String = ���� (string�� ���� �Ұ���)
		
		System.out.println('b' - 'a'); // char - char = int
	}
}
