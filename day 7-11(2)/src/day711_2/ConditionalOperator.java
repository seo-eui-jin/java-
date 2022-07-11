package day711_2;

import java.util.Scanner;

public class ConditionalOperator {
	public static void main(String[] args) {
		System.out.println(false ? "안녕" : 10);
		
		// ex) 사용자에게 나이를 입력받고, 성인이라면 성인입니다 출력, 미성년자라면 미성년자 입니다 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.println(age > 19 ? "성인입니다." : "미성년자입니다.");
	}
}
