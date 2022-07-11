package day711;

public class MinusOperator {
	public static void main(String[] args) {
		System.out.println(10 - 5); // int - int = int
		System.out.println(10 - 0.0); // int - double = double
		System.out.println(10 - 'a'); // int - char = int
		// System.out.println(10 - "¾È³ç"); // int - String = ¿À·ù (StringÀº »¬¼À ºÒ°¡´É)
		
		System.out.println(10.0 - 10.1); // double - double = double
		System.out.println(10.0 - 'a'); // double - char = double
		// System.out.println(10.0 - "¾È³ç"); // double - String = ¿À·ù (stringÀº »¬¼À ºÒ°¡´É)
		
		System.out.println('b' - 'a'); // char - char = int
	}
}
