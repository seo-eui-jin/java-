package day711;

public class Casting {
	public static void main(String[] args) {
		// ����� ����ȯ
		System.out.println((int)3.14);
		System.out.println((double)3);
		System.out.println((char)97);
		// String --> int
		// parseInt(), Integer Ŭ���� �ȿ� ������� �ִ�.
		int num = Integer.parseInt("100");
		
		// String --> double
		// parseDobule(), Double
		double d = Double.parseDouble("3.14");
		
		// �Ϲ��� ����ȯ
		System.out.println(10 * 1.0);
		System.out.println((double)10);
		
		// ���� ���� ���� �Ϲ��� ����ȯ��
		// int --> String    double --> String
		String test = 10 + "";
		String testb = 10.0 + "";
	}
}
