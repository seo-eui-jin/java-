package day712;

import java.util.Scanner;

public class IfTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int n = sc.nextInt();
		if(n % 3 == 0) {
			System.out.println("3의 배수 입니다.");
		}
		
		if(n % 4 ==0) {
			System.out.println("4의 배수 입니다.");
		}
		
		
		
		int num = 3;
		
		if(num < 50) {
			System.out.println("50보다 작은 값임");
		}else if(num == 3) {
			System.out.println("3입니다.");
		}
	}
}
