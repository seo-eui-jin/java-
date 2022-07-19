package day719;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = {10, 20, 30};
		// 사용자에게 인덱스번호와 나눌 수를 입력받아서
		// 해당 배열의 숫자를 나눈 결과를 보여주는 프로그램
		
		
		
		try {
			System.out.println("idx 번호 : ");
			int idx = sc.nextInt();
			System.out.println("i나눌 값 : ");
			int num = sc.nextInt();
			
			System.out.println("결과 : " + ar[idx] / num);
		} catch(ArrayIndexOutOfBoundsException e) {// e에는 발생한 예외의 객체가 담기게 된다
//			e.printStackTrace();// 예외의 종류를 출력하는 메소드
			// getMessage() : 예외의 부연설명을 알려주는 메소드
			System.out.println("인덱스를 0부터 2만 입력하시오");
		} catch(ArithmeticException e){
			System.out.println("0으로는 나눌 수 없습니다.");
		} catch(InputMismatchException e) {
			System.out.println("숫자만 입력하세요");
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("오류 발생함");
		} finally {
			System.out.println("오류가 발생 하든 안하든 무조건 실행되는 영역");
		}
		
		
		
		
		
		
		System.out.println("정상적으로 종료됨");
	}
}
