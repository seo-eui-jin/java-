package day718;

public class Corporal implements Soldier{

	@Override
	public void eat() {
		System.out.println("밥을 맛있게 먹습니다");
		
	}

	@Override
	public void work() {
		System.out.println("사실상 모든 일을 맡아서 합니다");
		
	}

	@Override
	public void sleep() {
		System.out.println("쿨쿨 잘 잡니다");
		
	}

}
