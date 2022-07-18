package game;

public class Animal {
	//모든 캐릭터들의 부모 클래스
	String name; // 캐릭터 이름을 저장할 인스턴스 변수
	int feed; // 음식갯수를 저장할 인스턴스 변수
	int hp; // 체력을 저장할 인스턴스 변수
	
	
	public Animal(String name, int feed, int hp) {
		this.name = name;
		this.feed = feed;
		this.hp = hp;
		System.out.println(this.name + "캐릭터가 생성되었습니다!");
	}

	public void show() {
		System.out.println("현재 체력 : " + this.hp);
		System.out.println("남은 음식 : " + this.feed);
	}
	
	// 먹이주기
	public void eat() {
		this.hp++;
		this.feed--;
		show();
	}
	// 산책가기
	public void walk() {
		this.hp--;
		this.feed++;
		show();
		
	}
	// 씻기기
	public void wash() {
		this.hp += 20;
		this.feed += 20;
		System.out.print(this.name + "이 씻고 있어요!");
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
