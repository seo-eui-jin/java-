package inheritTest;

public class SuperCar extends Car {
	String mode;
	
	
	
	// 생성자 만드는 단축키 alt + shift + s > o > enter
	// 상속받은 자식클래스는 생서자를 호출하기 이전에 부모 생성자를 먼저 호출한다
	public SuperCar(String name, int price, String color, String mode) {
		super(name, price, color); // super() --> 부모생성자를 의미 Car()
		this.mode = mode;
	}
	
	// 메소드 오버라이딩
	// 메소드 재정의
	@Override // 어노테이션 주석
			// 컴퓨터에게 알려주는 주석
	public void engineOn() {
		System.out.println("버튼으로 시동켬");
	
	}
	
	@Override
	public void show() {
		super.show();
//		System.out.println("---자동차 정보---");
//		System.out.println("차주 : " + this.name);
//		System.out.println("색깔 : " + this.color);
//		System.out.println("가격 : " + this.price);
		System.out.println("모드 : " + this.mode);
	}
	
	public void openRoof() {
		System.out.println("지붕을 열었습니다!!");
	}
}
