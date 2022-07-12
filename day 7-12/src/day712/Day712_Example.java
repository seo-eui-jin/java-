package day712;

import java.util.Scanner;

public class Day712_Example {
	public static void main(String[] args) {
		// 1.����ڿ��� ����,����,���������� �Է¹޾� ����� 90���̻��̸� A, 80�̻� 90�̸��̸� B, 70�̻� 80�̸� C, 70�̸� F
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ��� : ");
		int kr = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ��� : ");
		int en = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ��� : ");
		int ma = sc.nextInt();
		int avg = (kr + en + ma) / 3;
		if (avg >= 90) {
			System.out.println("A�Դϴ�.");
		} else if (avg >= 80) {
			System.out.println("B�Դϴ�.");
		} else if (avg >= 70) {
			System.out.println("c�Դϴ�.");
		} else {
			System.out.println("F�Դϴ�.");
		}

		// 2. char target = 'a'; target�� ����ִ� ���� �ҹ��ڶ�� �ҹ��� �Դϴ�, �빮�ڸ� �빮�� �Դϴ�, �׿��� ���ڶ�� ��
		// ���Դϴ� ���
		char target = 'B';
		if (target >= 97 && target <= 122) {
			System.out.println("�ҹ��� �Դϴ�.");
		} else if (target >= 65 && target <= 90) {
			System.out.println("�빮�� �Դϴ�.");
		} else {
			System.out.println("�� �� �Դϴ�.");
		}

		// 3. target�� ����ִ� ���� �ҹ��ڶ�� �빮�ڷ�, �빮�ڶ�� �ҹ��ڷ�, �׿ܶ�� �״�� ����ϱ�
		if (target >= 'a' && target <= 'z') {
			System.out.println((char) (target - 32));
		} else if (target >= 'A' && target <= 'Z') {
			System.out.println((char) (target + 32));
		} else {
			System.out.println(target);
		}

		// 4.����ڿ��� ���� �Է� �޾�, �ش� ���� ������ ���� ����϶�
		// �� 2���� 28�� ���� �ִٰ� ����, switch�� ���
		System.out.println("���� �Է��ϼ��� : ");
		int m = sc.nextInt();
		switch(m) {
		case 12:
			System.out.println("31");
			break;
		case 11:
			System.out.println("30");
			break;
		case 10:
			System.out.println("31");
			break;
		case 9:
			System.out.println("30");
			break;
		case 8:
			System.out.println("31");
			break;
		case 7:
			System.out.println("31");
			break;
		case 6:
			System.out.println("30");
			break;
		case 5:
			System.out.println("31");
			break;
		case 4:
			System.out.println("30");
			break;
		case 3:
			System.out.println("31");
			break;
		case 2:
			System.out.println("28");
			break;
		case 1:
			System.out.println("31");
			break;
		default :
			System.out.println("�� �� �Է��Ͽ����ϴ�.");
		}

		// 5. ����ڿ��� ���������� �Է� �޾� ���������� 90�� �̻��̶�� A 80 �̻� 90�̸� B 70�̻� 80�̸� C 70�̸� F
		//  switch������
		System.out.println("���� ������ �Է��ϼ��� : ");
		int kor = sc.nextInt();
		switch(kor/10) {
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default :
			System.out.println("F");
		}
	}
}
