package day712;

import java.util.Scanner;

public class IfTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� : ");
		int n = sc.nextInt();
		if(n % 3 == 0) {
			System.out.println("3�� ��� �Դϴ�.");
		}
		
		if(n % 4 ==0) {
			System.out.println("4�� ��� �Դϴ�.");
		}
		
		
		
		int num = 3;
		
		if(num < 50) {
			System.out.println("50���� ���� ����");
		}else if(num == 3) {
			System.out.println("3�Դϴ�.");
		}
	}
}
