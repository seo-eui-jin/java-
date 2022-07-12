package day712_2;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		// 1. 사용자에게 이름과 반복 횟수를 입력 받아서 해당 횟수만큼 입력 받은 이름을 출력하라
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.println("반복 횟수를 입력하세요 : ");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.println(name);
		}

		// 2. 10 9 8 7 6 5 4 3 2 1 출력하기
		for (int i = 10; i >= 1; i--) {
			System.out.printf(i + " ");
		}

		System.out.println();

		// 3. 1부터 100까지의 숫자 중 짝수만 가로로 출력하기
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

		// 또 다른 방식
		String res = "";
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				continue; // 즉시 다음 반복으로 이동
				// System.out.println("안녕"); // dead code
			}
			res += i + " ";
		}
		System.out.println(res);

		// 또 다른 방식
		for (int i = 1; i <= 50; i++) {
			System.out.println(i * 2 + " ");
		}

		// 4. 1부터 10까지의 총합 구하기
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += i;
		}
		System.out.println(sum);

		// 5. 구구단 3단 출력하기
		// ----3단----
		// 3 x 1 = 3
		// 3 x 2 =6
		// ...
		// 3 x 9 = 27

		System.out.println("---3단---");
		for (int i = 1; i < 10; i++) {
			System.out.println("3 x " + i + " = " + 3 * i);

		}

	}
}
