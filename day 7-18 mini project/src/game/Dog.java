package game;

public class Dog extends Animal {

	public Dog(String name, int feed, int hp) {
		super(name, feed, hp);
		
	}

	// ¸ÔÀÌÁÖ±â
	@Override
	public void eat() {
		this.hp+= 2;
		this.feed-=3;
		show();
	}

	// »êÃ¥°¡±â
	@Override
	public void walk() {
//		this.hp-=5;
//		this.feed+=25;
//		show();
		this.hp-=4;  
		this.feed++;
		super.walk();
	}

	// ¾Ä±â±â
	@Override
	public void wash() {
		System.out.println(this.name + "´Ô ¾Ä´Â Áß!");
		for (int i = 0; i < 5; i++) {
			System.out.println("~¸Û");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println();
		this.hp+=20;
		this.feed+=20;
		show();
	}
	
	


}
