package InnerTest;

public class Outer {
	int ov = 10;
	static int osv = 100;
	
	class InnerInstance{
		// �ν��Ͻ�Ŭ����
		int iiv = 20;
		
	}
	
	
	static class InnerStatic{
		// ����ƽ Ŭ����
		int isv = 30;
	}
	
	public void f() {
		// �޼ҵ� ���ο����� Ŭ������ �ʿ��� �� ����Ѵ�(����Ŭ����)
		class InnerLocal{
			int ilv = 40;
		}
		
		InnerLocal il = new InnerLocal();
		System.out.println(il.ilv);
	}
	

}
