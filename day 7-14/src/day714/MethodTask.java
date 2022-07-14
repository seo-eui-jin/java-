package day714;

import java.util.Scanner;

public class MethodTask {

	public static void printName(String name, int cnt) {
		for (int i = 0; i < cnt; i++) {
			System.out.println(name);
		}
	}

	public static boolean a(char c) {
		if (c >= 'a' && c <= 'z') {
			return false;
		}
		return true;
	}

	public static char changeAlphabet(char c) {
		if (MethodTask.a(c)) {
			return((char) (c + 32));
		} else {
			return((char) (c - 32));
		}
	}
		
	public static void printAr(int[] array) {
		System.out.print("{");
		for (int i = 0; i < array.length; i++) {
			if(i == array.length -1) {
				System.out.print(array[i]);
				break;
			}
			System.out.print(array[i] + ", ");
		}
		System.out.print("}");
	
	}

	public static void main(String[] args) {

		// 1. 사용자에게 이름과 반 복 횟수를 입력 받아서
		// 사용자가 입력한 이름을 해당 반복 횟수만큼 출력하는 메소드
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.println("반복 횟수를 입력하세요 : ");
		int cnt = sc.nextInt();
		MethodTask.printName(name, cnt);

		// 2. target이라는 변수에 들어있는 값이 대문자인지 소문자인지 판별하는 메소드 만들기
		// 단 target에는 소문자 혹은 대문자 영어 문자만 들어갈 수 있다
		char target = 'b';
		if (MethodTask.a(target)) {
			System.out.println("소문자!!");
		} else {
			System.out.println("대문자!!");
		}

		// 3. target이라는 변수에 들어있는 값이 대문자라면 소문자로,
		// 소문자라면 대문자로 바꾸어 출력하는 메소드 만들기
		// 단 target에는 소문자 혹은 대문자 영어 문자만 들어갈 수 있다
		char res = MethodTask.changeAlphabet(target);
		System.out.println("바뀐 결과 : " + target + " --> " + res);

		// 배열의 요소를 출력해주는 메소드 만들기
		// {10,20,30}
		int[] ar = { 10, 20, 30 };
		int[] ar2 = {1,1,1,1,1,1};
		MethodTask.printAr(ar);
	}
}