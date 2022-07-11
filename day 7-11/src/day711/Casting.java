package day711;

public class Casting {
	public static void main(String[] args) {
		// 명시적 형변환
		System.out.println((int)3.14);
		System.out.println((double)3);
		System.out.println((char)97);
		// String --> int
		// parseInt(), Integer 클래스 안에 만들어져 있다.
		int num = Integer.parseInt("100");
		
		// String --> double
		// parseDobule(), Double
		double d = Double.parseDouble("3.14");
		
		// 암묵적 형변환
		System.out.println(10 * 1.0);
		System.out.println((double)10);
		
		// 가장 많이 쓰는 암묵적 형변환은
		// int --> String    double --> String
		String test = 10 + "";
		String testb = 10.0 + "";
	}
}
