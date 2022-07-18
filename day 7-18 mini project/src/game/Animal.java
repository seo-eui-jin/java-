package game;

public class Animal {
	//��� ĳ���͵��� �θ� Ŭ����
	String name; // ĳ���� �̸��� ������ �ν��Ͻ� ����
	int feed; // ���İ����� ������ �ν��Ͻ� ����
	int hp; // ü���� ������ �ν��Ͻ� ����
	
	
	public Animal(String name, int feed, int hp) {
		this.name = name;
		this.feed = feed;
		this.hp = hp;
		System.out.println(this.name + "ĳ���Ͱ� �����Ǿ����ϴ�!");
	}

	public void show() {
		System.out.println("���� ü�� : " + this.hp);
		System.out.println("���� ���� : " + this.feed);
	}
	
	// �����ֱ�
	public void eat() {
		this.hp++;
		this.feed--;
		show();
	}
	// ��å����
	public void walk() {
		this.hp--;
		this.feed++;
		show();
		
	}
	// �ı��
	public void wash() {
		this.hp += 20;
		this.feed += 20;
		System.out.print(this.name + "�� �İ� �־��!");
		for (int i = 0; i < 3; i++) {
			System.out.print("~~");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();
		show();
	
	}
	
	
	
}
