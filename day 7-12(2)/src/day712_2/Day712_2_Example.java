package day712_2;

public class Day712_2_Example {
	public static void main(String[] args) {
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		for(int i = 1; i < 6; i ++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		/* 
		 *    *
		 *   **
		 *  ***
		 * ****
		 ******     
		 */
		for(int i = 0; i < 6; i++){
			for(int j = 5; j > 0; j--){
				if(i<j){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		
		// 구구단 2단부터 9단까지 출력
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
			
		}
	}
}
