package day714_2;

public class MethodTest {
	// 메소드 오버로딩
	// 이름은 같으나 매개변수의 갯수 혹은 타입이 다른 메소드
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	// 리턴타입과는 무관
//	public static int add(int a, int b) {
//		return 100;
//	}
	
	// 매개변수 이름과는 무관하다
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
