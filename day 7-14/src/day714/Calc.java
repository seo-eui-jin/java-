package day714;

public class Calc {
	public static int add(int num1, int num2) {
		return num1 + num2; // 메소드 사용의 결과를 값으로 되돌려준다.
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		int num = Calc.add(80,20);
		System.out.println(num);
		System.out.println(Calc.add(20, 50)/2);
	}
}
