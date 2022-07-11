package day711;

public class PlusOperator {
	public static void main(String[] args) {
		System.out.println("int + ?");
		System.out.println(10 + 10); // int + int = int
		System.out.println(10 + 3.0); // int + double = double
		System.out.println(10 + 'a'); // int + char = int (char형 a는 아스키코드 숫자로 변형되어 계산)
		System.out.println(10 + "안녕"); // int + String = String (String 과 int가 연결 됨)
		
		System.out.println("double + ?");
		System.out.println(10.5 + 2); // double + int = double
		System.out.println(10.5 + 0.5); // double + double = double
		System.out.println(10.5 + 'a'); // double + char = double
		System.out.println(10.5 + "안녕"); // double + String = String (String 과 double가 연결 됨)
		
		System.out.println("char + ?");
		System.out.println('a' + 10); // char + int = int
		System.out.println('a' + 10.5); // char + doulbe = double
		System.out.println('a' + 'b'); // char + char = int
		System.out.println('a' + "안녕"); // cahr + String = String (String 과 char가 연결 됨)

		System.out.println("String + ?"); 
		System.out.println("안녕" + 10 ); // String + int = String
		System.out.println("안녕" + 10.5); // String + double = String
		System.out.println("안녕" + 'a'); // String + char = String
		System.out.println("안녕" + "하세요"); // String + String = String
		
		System.out.println("+연산자가 여러개 사용되었을 경우");
		System.out.println(10 + "20" + 90 + 'a'); // 102090a
		System.out.println(10 + 'a' + "" + "A"); // 107A
		
		String day = "10";
		System.out.println(10 + day + 1); // 10101
		
	}
}
