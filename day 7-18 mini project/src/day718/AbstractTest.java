package day718;

public class AbstractTest {
	public static void main(String[] args) {
		// 추상클래스는 객체화 불가능
		// 추상클래스는 필드 위에 구현되지 않는 부분이 있다
		// 따라서 메모리에 올라갈 수 없다
//		InterTest i = new InterTest(); 인터페이스는 구현되지 않은 부분이 있기 때문에 객체화 불가능
		
//		Parent p = new Parent(); 
		Child c = new Child();
		c.f();
	}
}
