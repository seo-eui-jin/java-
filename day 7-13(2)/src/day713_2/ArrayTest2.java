package day713_2;

public class ArrayTest2 {
	public static void main(String[] args) {
		int[] ar1 = new int[3];
		System.out.println("ar1.length : " + ar1.length);
		for (int i = 0; i < ar1.length; i++) {
			System.out.println("ar1[" + i + "] : " + ar1[i]);
		}
		
		double[] ar2 = new double[3];
		System.out.println("ar2.length : " + ar2.length);
		for (int i = 0; i < ar2.length; i++) {
			System.out.println("ar2[" + i + "] : " + ar2[i]);
		}
		
		char[] ar3 = new char[3];
		System.out.println(ar3[0]); // 띄어쓰기가 기본 문자로 채워짐
		
		String[] ar4 = new String[3];
		System.out.println(ar4[0]);
		
		String name = null; // null값은 클래스 타입을 초기화 할 때 사용하는 값
							// String은 앞에가 대문자로 다른 자료형과 달리 클래스임
		
		int [] ar5 = {10};
		int []ar6 = {10};
		int ar7[] = {10};
	}
}
