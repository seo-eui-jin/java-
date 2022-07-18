package day718;

public interface InterTest {
	int num = 10;
	
	public abstract void f1();
	public void f2(); // abstract가 생략되었다고 생각함, 일반메소드는 절대 아님
	
//	public void f() {
//	일반 메소드는 정의 불가능하다	
//	}
}
