package day711_2;

import java.util.Scanner;

public class ConditionalOperator {
	public static void main(String[] args) {
		System.out.println(false ? "�ȳ�" : 10);
		
		// ex) ����ڿ��� ���̸� �Է¹ް�, �����̶�� �����Դϴ� ���, �̼����ڶ�� �̼����� �Դϴ� ���
		Scanner sc = new Scanner(System.in);
		System.out.println("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		System.out.println(age > 19 ? "�����Դϴ�." : "�̼������Դϴ�.");
	}
}
