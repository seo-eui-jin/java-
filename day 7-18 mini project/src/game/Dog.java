package game;

public class Dog extends Animal {

	public Dog(String name, int feed, int hp) {
		super(name, feed, hp);
		
	}

	// �����ֱ�
	@Override
	public void eat() {
		this.hp+= 2;
		this.feed-=3;
		show();
	}

	// ��å����
	@Override
	public void walk() {
//		this.hp-=5;
//		this.feed+=25;
//		show();
		this.hp-=4;  
		this.feed++;
		super.walk();
	}

	// �ı��
	@Override
	public void wash() {
		System.out.println(this.name + "�� �Ĵ� ��!");
		for (int i = 0; i < 5; i++) {
			System.out.println("~��");
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
