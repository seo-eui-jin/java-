package day713_2;

public class ArrayTest {
	public static void main(String[] args) {
		
		int[] ar = {10, 20, 30,54,8,78,54,212,57,5451,215,87,223,8987,54};
		
		System.out.println(ar);
		ar[1] = 1000;
		System.out.println(ar[1]);
		System.out.println("ar.length : " + ar.length);
		for(int i = 0; i < ar.length; i++) {
			System.out.println("ar["+ i + "] : " + ar[i]);
		}
		
//		System.out.println(ar[0]);
//		System.out.println(ar[1]);
//		System.out.println(ar[2]);
//		// System.out.println(ar[3]); // 오류, 배열 인덱스 범위 벗어남
	}
}
