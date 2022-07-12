package day712_2;

public class IncrementalOperator {
	public static void main(String[] args) {
		// 전위형과 후위형의 차이 : 우선순위
		int num = 10;
		// num++; // num = num + 1;
		System.out.println(num++);
		System.out.println(num);
		
		int a = 10;
		int b = a++;
		
		System.out.println(a);
		System.out.println(b);
	}

}
