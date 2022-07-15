package accessTest;

public class Test {
	private int a;
	protected int b;
	int c; // 생략하면 default
	public int d;
	
	public void f() {
		System.out.println("같은 클래스에서 사용가능한지 확인용 메소드");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		f1();
		f2();
		f3();
		f4();
	}
	
	private void f1() {
		System.out.println("private메소드");
	}
	
	protected void f2() {
		System.out.println("protected메소드");
	}
	
	void f3() {
		System.out.println("default메소드");
	}
	
	public void f4() {
		System.out.println("public메소드");
	}

}
