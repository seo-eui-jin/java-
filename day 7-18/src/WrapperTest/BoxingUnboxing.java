package WrapperTest;

public class BoxingUnboxing {
	public static void main(String[] args) {
		// boxing : �⺻�ڷ��� --> ����Ŭ����
		int i = 10;
		Integer wi = new Integer(i);
		
		
		
		// unboxing : ����Ŭ���� --> �⺻�ڷ���
		wi.intValue(); // unboxing
		
		//jdk 1.5 ���ķ� auto�� �����Ѵ�
		int i2 = 10;
		Integer wi2 = i2; // auto boxing
		int i3 = wi2; // auto unboxing
		
		// auto boxing, up casting
		Object[] ar = {10, 20, 3.4, true};
		int[] ar2 = {10};
	
	}
}
