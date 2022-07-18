package game;

public class Cat extends Animal{

	public Cat(String name, int feed, int hp) {
		super(name, feed, hp);
		
	}
	
	public void onlyCat() { // Cat클래스에서 새롭게 정의된 메소드
		System.out.println("야옹야옹~");
	}


	// 먹이주기
	@Override
	public void eat() {
		super.eat();
	}

	// 산책가기
	@Override
	public void walk() {
		this.feed+=4;
		super.walk(); // feed++, hp--, show()
	}

	// 씻기기
	@Override
	public void wash() {
		System.out.println(this.name + "님 씻는 중!");
		for (int i = 0; i < 7; i++) {
			System.out.println("야옹~");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println();
		this.feed+=20;
		this.hp+=20;
		show();
	}
	
	

}
