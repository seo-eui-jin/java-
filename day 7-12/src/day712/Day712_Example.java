package day712;

import java.util.Scanner;

public class Day712_Example {
	public static void main(String[] args) {
		// 1.사용자에게 국어,영어,수학점수를 입력받아 평균이 90점이상이면 A, 80이상 90미만이면 B, 70이상 80미만 C, 70미만 F
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요 : ");
		int kr = sc.nextInt();
		System.out.println("영어 점수를 입력하세요 : ");
		int en = sc.nextInt();
		System.out.println("수학 점수를 입력하세요 : ");
		int ma = sc.nextInt();
		int avg = (kr + en + ma) / 3;
		if (avg >= 90) {
			System.out.println("A입니다.");
		} else if (avg >= 80) {
			System.out.println("B입니다.");
		} else if (avg >= 70) {
			System.out.println("c입니다.");
		} else {
			System.out.println("F입니다.");
		}

		// 2. char target = 'a'; target에 들어있는 값이 소문자라면 소문자 입니다, 대문자면 대문자 입니다, 그외의 문자라면 그
		// 외입니다 출력
		char target = 'B';
		if (target >= 97 && target <= 122) {
			System.out.println("소문자 입니다.");
		} else if (target >= 65 && target <= 90) {
			System.out.println("대문자 입니다.");
		} else {
			System.out.println("그 외 입니다.");
		}

		// 3. target에 들어있는 값이 소문자라면 대문자로, 대문자라면 소문자로, 그외라면 그대로 출력하기
		if (target >= 'a' && target <= 'z') {
			System.out.println((char) (target - 32));
		} else if (target >= 'A' && target <= 'Z') {
			System.out.println((char) (target + 32));
		} else {
			System.out.println(target);
		}

		// 4.사용자에게 월을 입력 받아, 해당 월의 마지막 날을 출력하라
		// 단 2월은 28일 까지 있다고 가정, switch문 사용
		System.out.println("월을 입력하세요 : ");
		int m = sc.nextInt();
		switch(m) {
		case 12:
			System.out.println("31");
			break;
		case 11:
			System.out.println("30");
			break;
		case 10:
			System.out.println("31");
			break;
		case 9:
			System.out.println("30");
			break;
		case 8:
			System.out.println("31");
			break;
		case 7:
			System.out.println("31");
			break;
		case 6:
			System.out.println("30");
			break;
		case 5:
			System.out.println("31");
			break;
		case 4:
			System.out.println("30");
			break;
		case 3:
			System.out.println("31");
			break;
		case 2:
			System.out.println("28");
			break;
		case 1:
			System.out.println("31");
			break;
		default :
			System.out.println("잘 못 입력하였습니다.");
		}

		// 5. 사용자에게 국어점수를 입력 받아 국어점수가 90점 이상이라면 A 80 이상 90미만 B 70이상 80미만 C 70미만 F
		//  switch문으로
		System.out.println("국어 점수를 입력하세요 : ");
		int kor = sc.nextInt();
		switch(kor/10) {
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default :
			System.out.println("F");
		}
	}
}
