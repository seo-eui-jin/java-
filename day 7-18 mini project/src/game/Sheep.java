package game;

public class Sheep extends Animal {

	public Sheep(String name, int feed, int hp) {
		super(name, feed, hp);
		
	}

	// ¸ÔÀÌÁÖ±â
	@Override
	public void eat() {
		this.feed-=1;
		this.hp+=4;
		super.eat();
	}

	// »êÃ¥°¡±â
	@Override
	public void walk() {
		super.walk();
	}

	// ¾Ä±â±â
	@Override
	public void wash() {
		System.out.println(this.name + "´Ô ¾Ä´Â Áß!");
		for (int i = 0; i < 10; i++) {
			System.out.println("¸Ş~~");
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
