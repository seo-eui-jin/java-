package inheritTest;

public class Car {
	String name;
	int price;
	String color;
	
	public Car(String name, int price, String cololr) {
		this.name = name;
		this.price = price;
		this.color = color;
	}
	
	public void go() {
		System.out.println("������ ���ϴ�");
	}
	
	public void engineOn() {
		System.out.println("����� �õ��� �׽��ϴ�.");
	}
	
	public void show() {
		System.out.println("---�ڵ��� ����---");
		System.out.println("���� : " + this.name);
		System.out.println("���� : " + this.color);
		System.out.println("���� : " + this.price);
		
	}
}























