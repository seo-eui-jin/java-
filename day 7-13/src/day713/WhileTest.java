package day713;

import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			System.out.println("for문 안쪽 문장");
		}
			System.out.println("for문 바깥 문장");
			
		int i = 0;
		while(i < 3) {
			System.out.println("while문 안쪽 문장");
			i++;
		}
		System.out.println("while문 바깥 문장");
		
		Scanner sc = new Scanner(System.in);
		
//		while(true) {
//			System.out.println("1. 주문하기 2. 결제하기 3. 나가기");
//			int choice = sc.nextInt();
//			if(choice == 3) {
//				break; // break를 만나면 즉시 반복문을 탈출한다.
//			}
//			
//		}
		
		int choice = 0;
		
		do {
			System.out.println("1. 주문하기 2. 결제하기 0. 나가기");
			choice = sc.nextInt();
		} while(choice != 0);
		
		
		while(true) {
			choice = sc.nextInt();
			switch(choice) {
			case 0:
				System.out.println("case문 안쪽에 들어옴");
				break;
			}
		}
		
//		while(choice != 3) {
//			System.out.println("1. 주문하기 2. 결제하기 3. 나가기");
//			if(choice == 3) {
//				break; // break를 만나면 즉시 반복문을 탈출한다.
//			}
//			
//		}
		
		
	}
}
