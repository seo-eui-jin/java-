package day711;

import java.util.Scanner;

public class InputTest2 {
	public static void main(String[] args) {
		// ����ڿ��� ���̸� �Է� �ް�, ����� ���̴� 00�� �Դϴ� ����ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		System.out.println("����� ���̴� " + age + "�� �Դϴ�.");
		
		System.out.println("�������� �Է� �Ͻÿ� :");
		double pi = sc.nextDouble();
		System.out.println("�������� " + pi + "�Դϴ�.");
	}

}
