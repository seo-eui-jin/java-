package day712;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		if (false) {
			System.out.println("문장 1");
		}
		System.out.println("문장 2");

		// 사용자에게 정수를 입력 받아서 짝수라면 짝수 출력하기, 홀수라면 홀수 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("짝수 입니다.");
		} else {
			System.out.println("홀수 입니다.");
		}

		// System.out.println(num % 2 ==0 ? "짝수" : "홀수"); // 위에 코드를 삼항연산자로 사용할 경우

		// 7. 두 수중 더 큰수 출력하기
		// 만일 두 수가 같다면 같다고 출력하기
		Scanner sc5 = new Scanner(System.in);
		System.out.println("첫번 째 정수를 입력하세요 : ");
		int number = sc5.nextInt();
		System.out.println("두 번쨰 정수를 입력하세요 : ");
		int number2 = sc5.nextInt();
		String res5 = number == number2 ? "두 수는 같습니다." : number > number2 ? number + "" : number2 + "";
		System.out.println(res5);

		if (number > number2) {
			System.out.println(number);
		} else if (number2 > number) {
			System.out.println(number2);
		} else {
			System.out.println("같다");
		}

	}
}
