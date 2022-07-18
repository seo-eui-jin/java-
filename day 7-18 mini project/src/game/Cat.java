package game;

public class Cat extends Animal{

	public Cat(String name, int feed, int hp) {
		super(name, feed, hp);
		
	}
	
	public void onlyCat() { // CatŬ�������� ���Ӱ� ���ǵ� �޼ҵ�
		System.out.println("�߿˾߿�~");
	}


	// �����ֱ�
	@Override
	public void eat() {
		super.eat();
	}

	// ��å����
	@Override
	public void walk() {
		this.feed+=4;
		super.walk(); // feed++, hp--, show()
	}

	// �ı��
	@Override
	public void wash() {
		System.out.println(this.name + "�� �Ĵ� ��!");
		for (int i = 0; i < 7; i++) {
			System.out.println("�߿�~");
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
