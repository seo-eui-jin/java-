package day711;

import java.util.Scanner;

public class InputTest3 {
	public static void main(String[] args) {
		// ����ڿ��� ���� �ϰ� ������ �Է� �޾Ƽ� 00�� 00�� 0���� ���
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��ϼ��� : ");
		int month = sc.nextInt();
		System.out.println("���� �Է��ϼ��� : ");
		int dd = sc.nextInt();
		
		sc.nextLine();
		System.out.println("������ �Է��ϼ��� : ");
		String day = sc.nextLine();
		System.out.println(month + "�� " + dd + "�� " + day + "���� �Դϴ�.");
	}
}

