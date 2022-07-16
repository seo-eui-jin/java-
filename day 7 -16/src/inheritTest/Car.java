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
		System.out.println("앞으로 갑니다");
	}
	
	public void engineOn() {
		System.out.println("열쇠로 시동을 켰습니다.");
	}
	
	public void show() {
		System.out.println("---자동차 정보---");
		System.out.println("차주 : " + this.name);
		System.out.println("색깔 : " + this.color);
		System.out.println("가격 : " + this.price);
		
	}
}























