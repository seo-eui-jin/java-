package accessTest;

public class Test {
	private int a;
	protected int b;
	int c; // �����ϸ� default
	public int d;
	
	public void f() {
		System.out.println("���� Ŭ�������� ��밡������ Ȯ�ο� �޼ҵ�");
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
		System.out.println("private�޼ҵ�");
	}
	
	protected void f2() {
		System.out.println("protected�޼ҵ�");
	}
	
	void f3() {
		System.out.println("default�޼ҵ�");
	}
	
	public void f4() {
		System.out.println("public�޼ҵ�");
	}

}
