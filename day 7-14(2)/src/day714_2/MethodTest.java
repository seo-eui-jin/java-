package day714_2;

public class MethodTest {
	// �޼ҵ� �����ε�
	// �̸��� ������ �Ű������� ���� Ȥ�� Ÿ���� �ٸ� �޼ҵ�
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	// ����Ÿ�԰��� ����
//	public static int add(int a, int b) {
//		return 100;
//	}
	
	// �Ű����� �̸����� �����ϴ�
//	public static void add(int num1, int num2) {
//		System.out.println(a + b);
//	}
	public static void add(double a, int b) {
		System.out.println(a+b);
	}
	public static void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	
	public static void main(String[] args) {		
		MethodTest.add(10.5, 1);
		MethodTest.add(10, 20);
		MethodTest.add(10, 20, 30);
	}
}
