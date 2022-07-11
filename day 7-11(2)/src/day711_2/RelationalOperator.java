package day711_2;

import java.util.Scanner;

public class RelationalOperator {
	public static void main(String[] args) {
		System.out.println(10 > 5); // true
		
		System.out.println(10 > 100); // false
		
		System.out.println(10.5 > 10); // double, int 비교 가능
		
		System.out.println(100 > 'a'); // int, char 비교 가능
		
		System.out.println('a' > 'b'); // char, char 비교 가능

		// System.out.println("안녕" > "반가워"); // 문자열 관계연산자 비교 불가능
		
		System.out.println(10 == 10);
		
		String str = "안녕";
		
		System.out.println("str".equals("안녕")); // String은 서로 같은지 비교할 때 equals() 메소드를 사용한다
		// 문자열1.equals(문자열2); 문자열1과 문자열2가 서로 같다면 true, 아니면 false
		
		// 예제 : 사용자에게 아이디를 입력받아, 해당 아이디가 admin이라면 true, 아니면 false를 출력하라
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요 : ");
		String id = sc.next();
		String id2 = "admin";
		System.out.println(id.equals(id2));
	}
}
