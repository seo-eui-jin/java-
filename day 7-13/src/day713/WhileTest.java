package day713;

import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			System.out.println("for�� ���� ����");
		}
			System.out.println("for�� �ٱ� ����");
			
		int i = 0;
		while(i < 3) {
			System.out.println("while�� ���� ����");
			i++;
		}
		System.out.println("while�� �ٱ� ����");
		
		Scanner sc = new Scanner(System.in);
		
//		while(true) {
//			System.out.println("1. �ֹ��ϱ� 2. �����ϱ� 3. ������");
//			int choice = sc.nextInt();
//			if(choice == 3) {
//				break; // break�� ������ ��� �ݺ����� Ż���Ѵ�.
//			}
//			
//		}
		
		int choice = 0;
		
		do {
			System.out.println("1. �ֹ��ϱ� 2. �����ϱ� 0. ������");
			choice = sc.nextInt();
		} while(choice != 0);
		
		
		while(true) {
			choice = sc.nextInt();
			switch(choice) {
			case 0:
				System.out.println("case�� ���ʿ� ����");
				break;
			}
		}
		
//		while(choice != 3) {
//			System.out.println("1. �ֹ��ϱ� 2. �����ϱ� 3. ������");
//			if(choice == 3) {
//				break; // break�� ������ ��� �ݺ����� Ż���Ѵ�.
//			}
//			
//		}
		
		
	}
}
