package day719;

import java.util.Scanner;

public class MyExceptionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User u = new User();
		
		
//		u.wash();
		
		
		System.out.println("�г����� �Է��� �ּ��� : ");
		String nick = sc.nextLine();
		
		try {
			u.setNickName(nick);
		} catch (BadWordException e) {
			e.printStackTrace();
			System.out.println("���� �߻�");
		}
		
	}
}
