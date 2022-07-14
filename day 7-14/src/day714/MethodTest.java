package day714;

public class MethodTest {
		public static void printName(String name, int cnt) {
			for (int i = 0; i < cnt; i++) {
				System.out.println(name);
				// return; 메소드는 return을 만나면 즉시 종료된다.
			}
		}
		
		
		public static void main(String[] args) {
			// 클래스명.메소드명(); Integer.parseInt();
			MethodTest.printName("서의진",3);
			System.out.println("프로그램 개발중");
			MethodTest.printName("김철수",5);
			// return;
			System.out.println("프로그램 개발중");
			MethodTest.printName("고객님",4);
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
