package day719;

import java.util.Scanner;

public class ThrowTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		while(true) {
			System.out.println("입력 : ");
			int choice = sc.nextInt();
			if(choice == 1) {
				break;
			}else if(choice == 5) {
				// thorw : 예외를 발생시키는 키워드
				// throw new 예외이름();
				// ArithmeticException a = new ArithmeticException();
				try {
					throw new ArithmeticException("괄호안에 문자열");
				
				} catch(ArithmeticException e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
					System.out.println("예외 발생함");
				}
			}
		}
		
		
		
		
		
		
	}
}
