package day711;

import java.util.Scanner;
// java.util ��Ű�� �ȿ��ִ� Scanner ��� Ŭ������ ����Ѵٰ� �˷���

public class InputTest {
	public static void main(String[] args) {
		// ��üȭ�� ����Ű ctrl + m
		// next() Scanner Ŭ���� �ȿ� ������� �ִ�
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸� �Է� : ");
		
		// ����ڰ� �ܼ�â�� �Է��� ���� String Ÿ������ �޾ƿ´�.
		// ����,���ͷ� �����Ͽ� String Ÿ������ �޾ƿ´�
		// String name = sc.next(); 
		
		// nextLine() ����ڰ� �Է��� ���� �� �� ��ä�� String Ÿ������ �޾ƿ´�
		String name = sc.nextLine();
		
		System.out.println(name + "�� ȯ���d�ϴ�.");
	}
}
