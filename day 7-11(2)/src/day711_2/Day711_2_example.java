package day711_2;

import java.util.Scanner;

public class Day711_2_example {
	public static void main(String[] args) {
		
		// 1.target에 들어있는 문자가 소문자라면 소문자입니다, 아니라면 소문자가 아닙니다 출력하기
		char target = 'A';
		System.out.println(65 < target && 98 > target  ? "소문자 입니다." : "대문자 입니다.");
		
			
		// 2.사용자에게 두 정수를 입력 받은 후 둘중 더 큰 수를 출력하기
		// ex) 20,100을 입력했을 때 둘 중 더 큰 수는 100입니다 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번 째 정수를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.println("두번 째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		System.out.println(num > num2 ? "둘 중 더 큰 수는 " + num + "입니다." : "둘 중 더 큰 수는 " + num2 + "입니다." );
		
		
		// 3.사용자에게 두 정수를 입력 받아 두 수의 차 (큰 수 - 작은 수)0이상의 값을 출력하기
		// ex) 20,100을 입력했을 때 두 수의 차는 80입니다 출력
		Scanner sc1 = new Scanner(System.in);
		System.out.println("첫번 쨰 정수를 입력하세요 : ");
		int num3 = sc1.nextInt();
		System.out.println("두번 째 정수를 입력하세요 : ");
		int num4 = sc1.nextInt();
		System.out.println(num3 > num4 ? "두수의 차는 " + (num3 - num4) + " 입니다." : "두수의 차는 " + (num4 - num3) + " 입니다.");
		
		
		// 4. 사용자에게 나이를 입력 받아서 나이가 10이상 30이하라면 1500원, 아니라면 무료입니다 출력하기
		Scanner sc2 = new Scanner(System.in);
		System.out.println("나이를 입력하세요 : ");
		int age = sc2.nextInt();
		System.out.println(age > 10 && age < 30 ? "1500원 입니다." : "무료입니다.");
		
		
		// 5. 8살 이상, 110cm 이상의 사람만 탑승할 수 있는 놀이기구가 있다
		// 나이와 키를 입력 받아서 탑승 가능 여부를 출력해라
		Scanner sc3 = new Scanner(System.in);
		System.out.println("나이를 입력하세요 : ");
		int age1 = sc3.nextInt();
		System.out.println("키를 입력하세요 : ");
		int cm = sc3.nextInt();
		System.out.println(age1 > 9 && cm > 110 ? "탑승 가능 합니다." : "탑승 불가능 합니다.");
		
		
		// 6. 한 박스에 20개의 라면이 들어간다. 라면의 갯수를 입력 받아 필요한 상자의 갯수를 출력하라
		// 56 --> 3박스, 60 --> 3박스
		Scanner sc4 = new Scanner(System.in);
		System.out.println("라면의 갯수를 입력하세요 : ");
		int r = sc.nextInt();
		System.out.println(r % 20 == 0 ? r / 20 : r / 20 + 1  );
		
		
		/*
				 자료형
			int -10,5,0
			double - 3.1, 0.0, ....
			char - 'a', '안',....
			String - "", ....
			bollean - true, false
		
		연산자 -연산의 결과가 어떤 타입인지 파악하는 것
			-산술 연산자
			 
			-관계 연산자
					a > b : a가 b보다 크니 ?
						맞다면 true, 아니면 false
					a < b : a가 b보다 작니 ?
						맞다면 true, 아니면 false
					a >= b : a가 b보다 크거나 같니 ?
						맞다면 true, 아니면 false
					a <= b : a가 b보다 작거나 같니?
						맞다면 true, 아니면 false
					a == b : a랑 b랑 같니 ?
						맞다면 true, 아니면 false
						★문자열은 equals()메소드를 통해 같은지 비교한다.
					a != b : a랑 b랑 다르니 ?
						맞다면 true, 아니면 false
					★관계연산자의 결과는 boolean 타입이다
					
					문자(char)도 비교 가능하다 아스키 코드표를 이용한다면
			
			-논리 연산자
					a && b : and 연산
						a도 true고, b도 true이면 결과는 true 아니면 false
					a || b : or 연산
						a 혹은 b 둘 중 하나라도 true면 결과는 true, 아니면 false
					!a : not 연산
						a가 true면 false,
						a가 false면 true
					★연산의 결과는 boolean 타입이다.
		
			연산자의 우선순위 ex) 10 != 5 && 7 < 9
					최우선 연산자 - ( )
					단항 연산자(항이 하나인 연산자) - !
					산술 연산자 - * / % + -
					쉬프트 연산자 
					관계 연산자 - > < >= <= == !=
				         논리 연산자 - && ||
					삼항 연산자
					대입 연산자 - =
				
			삼항 연산자 
					조건식 ? 참일때값 : 거짓일때값;
				        ex) true ? "안녕" : "10";
					조건식이 참이라면 콜론(:) 앞의 값이 삼항연산의 결과
					조건식이 거짓이라면 콜론 뒤의 값이 삼항 연산의 결과
				
			조건식
				참 거짓을 판별할 수 있는 식(boolean 타입이 와야한다)
		 */
	}
}
