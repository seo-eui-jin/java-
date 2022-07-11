package day711;

public class MulOperator {
	public static void main(String[] args) {
		System.out.println(10 * 10); // int * int = int
		System.out.println(10 * 1.5); // int * double = double
		System.out.println(10 * 'a'); // int * char = int
		//System.out.println(10 * "¾È³ç"); // StringÀº °ö¼À ºÒ°¡´É
		
		System.out.println(10.0 * 1.5); // double * double = double
		System.out.println(10.0 * 'a' ); // double * char = double
		
		System.out.println('a' * 'b'); // char * char = int
	}
}
