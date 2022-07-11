package day711;

import java.util.Scanner;

public class InputTest2 {
	public static void main(String[] args) {
		// 사용자에게 나이를 입력 받고, 당신의 나이는 00살 입니다 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.println("당신의 나이는 " + age + "살 입니다.");
		
		System.out.println("원주율을 입력 하시오 :");
		double pi = sc.nextDouble();
		System.out.println("원주율은 " + pi + "입니다.");
	}

}
