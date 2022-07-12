package day712_2;

public class NestedForTest {
	public static void main(String[] args) {
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 2; j++) {
				System.out.println("i : " + i + " j : " + j);
			}
		}
		
		/*
		 *  *****
		 *  *****
		 *  *****
		 *  *****
		 *  *****
		 */ 
		for(int j = 0; j < 5; j++) {
			
		for(int i = 0; i <5; i++) {
			System.out.println("*");
		}
		System.out.println();
		}
		
	}
}
