package day711;

public class DivideOperator {
	public static void main(String[] args) {
		System.out.println(7 / 2); // int / int = int (���� �����´�)
		System.out.println(7 / 2.0); // int / doulbe = double
		System.out.println(97 / 'a'); // int / char = int
		// String ������ �Ұ���
		
		System.out.println(97.0 / 97.0); // double / double = double
		System.out.println(97.0 / 'a'); // double / char = double
		
		System.out.println('b' / 'a'); // char / char = int
		
		 // System.out.println(10 / 0); // 0���δ� ���� �� ����.
	}
}
