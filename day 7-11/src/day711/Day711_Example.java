package day711;

import java.util.Scanner;

public class Day711_Example {
	public static void main(String[] args) {
		// 1. 노래 한 곡당 300원인 코인노래방에서 사용자에게 금액을 입력받아서 부를 수 있는 노래와 잔돈을 출력하라
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요 : ");
		int money = sc.nextInt();
		System.out.println("금액은 " + money + "원 이며, 부를 수 있는 노래 곡 수는 " + money/300 + "이고, 잔돈은 " + money%300  + "원 입니다.");
		

		// 2. 10~99사이의 숫자를 입력받아 십의자리와 일의자리를 각각 출력하라
		// 99
		// 십의자리 : 9
		// 일의자리 : 9
		Scanner sc2 = new Scanner(System.in);
		System.out.println("10~99 사이의 숫자를 입력하세요 : ");
		int num = sc2.nextInt();
		System.out.println("십의 자리는 " + num/10 + "이고, 일의 자리는 " + num%10 + "입니다." );

		
		// 3.사용자에게 국어, 영어점수를 입력받아서 평균을 출력하라 (점수는 INT값 평균은 DOUBLE)
		Scanner sc3 = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요 : ");
		int korea = sc3.nextInt();
		System.out.println("영어 점수를 입력하세요 : ");
		int english = sc3.nextInt();
		System.out.println("평균 점수는 " + ((double)(korea + english)/2 ) + "점 입니다.");
		
		
		// 4.char target = 'a';
		// target에 담긴 a를 대문자 A로 바꾸어 출력하라 (아스키코드 참고)
		char target = 'a';
		System.out.println((char)(target-32));
		
		
		
		/*
		 컨트롤 + m 프로젝트 익스플로어 단축키

		입력 메소드인 next()를 사용하려면 Scanner 클래스를 사용해야 한다.
		이때 Scanner 클래스가 어디에 있는지 알려줘야 하므로 import를 사용한다.

		import 단축키
		 	해당 클래스 자동 완성(ctrl + space)
			ctrl + shift + o (한번에 여러 import 자동으로 추가)
		
		입력 메소드 - next()
				-사용자가 콘솔창에 입력한 값을 띄어쓰기 혹은 엔터로 구분하여 String 타입으로 가져온다.
			   - nextLine()
				-사용자가 콘솔창에 입력한 값을 한 줄 통채로 String 타입으로 가져온다.
			   -nextInt()
				-사용자가 콘솔창에 입력한 값을 int 타입으로 받아온다.
			   -nextDouble()
				-사용자가 콘솔창에 입력한 값을 double 타입으로 받아온다.
		
		next(), nextInt(), nextDouble()을 사용하고 난 후에는 버퍼어 \n(엔터값)이 남아있다
		그렇게 된다면 그 다음에 입력 받을 때 버퍼에 남아있던 값이 입력되게 되며 원하는 대로
		동작하지 않을 수 있다 이를 방지하기 위해서는 nextLine()을 사용하여 버퍼를 비워준 후 입력을 받는 방법을 
		사용할 수 있다.
		★next(), nextInt(), nextDouble()을 사용할 때는 버퍼에 남아있는 값이 있는지 없는지 확인할 것
		==================================================================================
		형변환 (casting)
			-자료형을 바꾸는 것을 의미한다
			-명시적 형변환
				(int)값; , (double)값; , (char)값;
				String은 클래스이기 때문에 메소드를 통하여 바꿔줘야 한다
				int num = Integer.parseInt("100"); 혹은 double d = Double.parseDouble("3.14);
			-암묵적 형변환
		==================================================================================
		
		연산자(operator)
			★연산의 결과가 어떤 자료형인지 파악하는것이 가장 중요하다.
		산술 연산자
			+ 덧셈 연산자 - char는 아스키코드에 해당하는 int로 생각 String + 다른 자료형 string으로 생각
			-  뺄셈 연산자 - String 뺄셈 불가능
			*  곱셈 연산자 - String은 곱셈 불가능	
			/  나눗셈 연산자 - int / int --> int(몫) , String은 나눗셈 불가능 , 0으로 나누면 오류
			% 나머지 연산자 10 % 3 --> 1
		관계 연산자
		논리 연산자
		삼항 연산자
		 */
	}
}
