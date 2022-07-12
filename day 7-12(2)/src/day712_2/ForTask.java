package day712_2;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		// 1. ����ڿ��� �̸��� �ݺ� Ƚ���� �Է� �޾Ƽ� �ش� Ƚ����ŭ �Է� ���� �̸��� ����϶�
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ��� : ");
		String name = sc.next();
		System.out.println("�ݺ� Ƚ���� �Է��ϼ��� : ");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.println(name);
		}

		// 2. 10 9 8 7 6 5 4 3 2 1 ����ϱ�
		for (int i = 10; i >= 1; i--) {
			System.out.printf(i + " ");
		}

		System.out.println();

		// 3. 1���� 100������ ���� �� ¦���� ���η� ����ϱ�
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

		// �� �ٸ� ���
		String res = "";
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				continue; // ��� ���� �ݺ����� �̵�
				// System.out.println("�ȳ�"); // dead code
			}
			res += i + " ";
		}
		System.out.println(res);

		// �� �ٸ� ���
		for (int i = 1; i <= 50; i++) {
			System.out.println(i * 2 + " ");
		}

		// 4. 1���� 10������ ���� ���ϱ�
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += i;
		}
		System.out.println(sum);

		// 5. ������ 3�� ����ϱ�
		// ----3��----
		// 3 x 1 = 3
		// 3 x 2 =6
		// ...
		// 3 x 9 = 27

		System.out.println("---3��---");
		for (int i = 1; i < 10; i++) {
			System.out.println("3 x " + i + " = " + 3 * i);

		}

	}
}
