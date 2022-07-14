package day714;

public class ArrayTest {
	public static void main(String[] args) {
		int[][] arr = new int[3][2];
		int[][] ar = {{10, 20}, {100, 200}, {1, 2}};
		System.out.println("ar.length : " + ar.length);
		System.out.println("ar[0].length : " + ar[0].length);
		System.out.println("ar[1].length : " + ar[0].length);
		System.out.println("ar[2].length : " + ar[0].length);
		System.out.println(ar[1][0]);
		System.out.println(ar[2][1]);
		
		System.out.println("-------------------------------------------------");
		
		for(int[] array : ar) {
			for(int num : array) {
				System.out.println(num);
			}
		}
		
		System.out.println("-------------------------------------------------");
		
		System.out.println("{" + ar[1][0] + ", " + ar[1][1] + "}");
		System.out.print("{");
		for (int i = 0; i < ar.length; i++) {
			System.out.print("{");
			for (int j = 0; j < ar[i].length; j++) {
				// System.out.println("i:" + i + " j:" + j);
					ar[0][1] = 2000;
				
				if(j == ar[i].length-1) {
					System.out.print(ar[i][j]);
				}else {
					System.out.print(ar[i][j] + ", ");
				}
				
			}
			if(i == ar.length-1) {
				System.out.print("}");
			}else {
				System.out.print("}, ");
			}
		}
		System.out.println("}");
	}
}
