package day711_2;

import java.util.Scanner;

public class RelationalOperator {
	public static void main(String[] args) {
		System.out.println(10 > 5); // true
		
		System.out.println(10 > 100); // false
		
		System.out.println(10.5 > 10); // double, int �� ����
		
		System.out.println(100 > 'a'); // int, char �� ����
		
		System.out.println('a' > 'b'); // char, char �� ����

		// System.out.println("�ȳ�" > "�ݰ���"); // ���ڿ� ���迬���� �� �Ұ���
		
		System.out.println(10 == 10);
		
		String str = "�ȳ�";
		
		System.out.println("str".equals("�ȳ�")); // String�� ���� ������ ���� �� equals() �޼ҵ带 ����Ѵ�
		// ���ڿ�1.equals(���ڿ�2); ���ڿ�1�� ���ڿ�2�� ���� ���ٸ� true, �ƴϸ� false
		
		// ���� : ����ڿ��� ���̵� �Է¹޾�, �ش� ���̵� admin�̶�� true, �ƴϸ� false�� ����϶�
		Scanner sc = new Scanner(System.in);
		System.out.println("���̵� �Է��ϼ��� : ");
		String id = sc.next();
		String id2 = "admin";
		System.out.println(id.equals(id2));
	}
}
