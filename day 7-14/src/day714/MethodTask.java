package day714;

import java.util.Scanner;

public class MethodTask {

	public static void printName(String name, int cnt) {
		for (int i = 0; i < cnt; i++) {
			System.out.println(name);
		}
	}

	public static boolean a(char c) {
		if (c >= 'a' && c <= 'z') {
			return false;
		}
		return true;
	}

	public static char changeAlphabet(char c) {
		if (MethodTask.a(c)) {
			return((char) (c + 32));
		} else {
			return((char) (c - 32));
		}
	}
		
	public static void printAr(int[] array) {
		System.out.print("{");
		for (int i = 0; i < array.length; i++) {
			if(i == array.length -1) {
				System.out.print(array[i]);
				break;
			}
			System.out.print(array[i] + ", ");
		}
		System.out.print("}");
	
	}

	public static void main(String[] args) {

		// 1. ����ڿ��� �̸��� �� �� Ƚ���� �Է� �޾Ƽ�
		// ����ڰ� �Է��� �̸��� �ش� �ݺ� Ƚ����ŭ ����ϴ� �޼ҵ�
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		System.out.println("�ݺ� Ƚ���� �Է��ϼ��� : ");
		int cnt = sc.nextInt();
		MethodTask.printName(name, cnt);

		// 2. target�̶�� ������ ����ִ� ���� �빮������ �ҹ������� �Ǻ��ϴ� �޼ҵ� �����
		// �� target���� �ҹ��� Ȥ�� �빮�� ���� ���ڸ� �� �� �ִ�
		char target = 'b';
		if (MethodTask.a(target)) {
			System.out.println("�ҹ���!!");
		} else {
			System.out.println("�빮��!!");
		}

		// 3. target�̶�� ������ ����ִ� ���� �빮�ڶ�� �ҹ��ڷ�,
		// �ҹ��ڶ�� �빮�ڷ� �ٲپ� ����ϴ� �޼ҵ� �����
		// �� target���� �ҹ��� Ȥ�� �빮�� ���� ���ڸ� �� �� �ִ�
		char res = MethodTask.changeAlphabet(target);
		System.out.println("�ٲ� ��� : " + target + " --> " + res);

		// �迭�� ��Ҹ� ������ִ� �޼ҵ� �����
		// {10,20,30}
		int[] ar = { 10, 20, 30 };
		int[] ar2 = {1,1,1,1,1,1};
		MethodTask.printAr(ar);
	}
}