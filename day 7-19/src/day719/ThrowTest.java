package day719;

import java.util.Scanner;

public class ThrowTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		while(true) {
			System.out.println("�Է� : ");
			int choice = sc.nextInt();
			if(choice == 1) {
				break;
			}else if(choice == 5) {
				// thorw : ���ܸ� �߻���Ű�� Ű����
				// throw new �����̸�();
				// ArithmeticException a = new ArithmeticException();
				try {
					throw new ArithmeticException("��ȣ�ȿ� ���ڿ�");
				
				} catch(ArithmeticException e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
					System.out.println("���� �߻���");
				}
			}
		}
		
		
		
		
		
		
	}
}
