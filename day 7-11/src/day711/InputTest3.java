package day711;

import java.util.Scanner;

public class InputTest3 {
	public static void main(String[] args) {
		// 사용자에게 월과 일과 요일을 입력 받아서 00월 00일 0요일 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요 : ");
		int month = sc.nextInt();
		System.out.println("일을 입력하세요 : ");
		int dd = sc.nextInt();
		
		sc.nextLine();
		System.out.println("요일을 입력하세요 : ");
		String day = sc.nextLine();
		System.out.println(month + "월 " + dd + "일 " + day + "요일 입니다.");
	}
}

