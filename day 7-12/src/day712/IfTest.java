package day712;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		if (false) {
			System.out.println("���� 1");
		}
		System.out.println("���� 2");

		// ����ڿ��� ������ �Է� �޾Ƽ� ¦����� ¦�� ����ϱ�, Ȧ����� Ȧ�� ����ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("¦�� �Դϴ�.");
		} else {
			System.out.println("Ȧ�� �Դϴ�.");
		}

		// System.out.println(num % 2 ==0 ? "¦��" : "Ȧ��"); // ���� �ڵ带 ���׿����ڷ� ����� ���

		// 7. �� ���� �� ū�� ����ϱ�
		// ���� �� ���� ���ٸ� ���ٰ� ����ϱ�
		Scanner sc5 = new Scanner(System.in);
		System.out.println("ù�� ° ������ �Է��ϼ��� : ");
		int number = sc5.nextInt();
		System.out.println("�� ���� ������ �Է��ϼ��� : ");
		int number2 = sc5.nextInt();
		String res5 = number == number2 ? "�� ���� �����ϴ�." : number > number2 ? number + "" : number2 + "";
		System.out.println(res5);

		if (number > number2) {
			System.out.println(number);
		} else if (number2 > number) {
			System.out.println(number2);
		} else {
			System.out.println("����");
		}

	}
}
