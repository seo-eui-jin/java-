package day711;

import java.util.Scanner;
// java.util 패키지 안에있는 Scanner 라는 클래스를 사용한다고 알려줌

public class InputTest {
	public static void main(String[] args) {
		// 전체화면 단축키 ctrl + m
		// next() Scanner 클래스 안에 만들어져 있다
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력 : ");
		
		// 사용자가 콘솔창에 입력한 값을 String 타입으로 받아온다.
		// 띄어쓰기,엔터로 구분하여 String 타입으로 받아온다
		// String name = sc.next(); 
		
		// nextLine() 사용자가 입력한 값을 한 줄 통채로 String 타입으로 받아온다
		String name = sc.nextLine();
		
		System.out.println(name + "님 환영홥니다.");
	}
}
