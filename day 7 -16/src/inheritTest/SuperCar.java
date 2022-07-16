package inheritTest;

public class SuperCar extends Car {
	String mode;
	
	
	
	// ������ ����� ����Ű alt + shift + s > o > enter
	// ��ӹ��� �ڽ�Ŭ������ �����ڸ� ȣ���ϱ� ������ �θ� �����ڸ� ���� ȣ���Ѵ�
	public SuperCar(String name, int price, String color, String mode) {
		super(name, price, color); // super() --> �θ�����ڸ� �ǹ� Car()
		this.mode = mode;
	}
	
	// �޼ҵ� �������̵�
	// �޼ҵ� ������
	@Override // ������̼� �ּ�
			// ��ǻ�Ϳ��� �˷��ִ� �ּ�
	public void engineOn() {
		System.out.println("��ư���� �õ���");
	
	}
	
	@Override
	public void show() {
		super.show();
//		System.out.println("---�ڵ��� ����---");
//		System.out.println("���� : " + this.name);
//		System.out.println("���� : " + this.color);
//		System.out.println("���� : " + this.price);
		System.out.println("��� : " + this.mode);
	}
	
	public void openRoof() {
		System.out.println("������ �������ϴ�!!");
	}
}
