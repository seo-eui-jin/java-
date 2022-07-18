package game;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		Dog test = new Dog("춘식이", 20, 20);
//		test.eat();
//		test.walk();
//		test.wash();
		
		Scanner sc = new Scanner(System.in);
		Animal avatar = null;
			
		System.out.println("====모여라 동물 친구들====");
		System.out.println("게임 캐릭터를 선택하세요");
		System.out.println("1. 강아지");
		System.out.println("2. 고양이");
		System.out.println("나머지숫자. 양");
		System.out.println("입력 : ");
		
		int choice = Integer.parseInt(sc.nextLine());
		
		System.out.println("캐릭터 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		if(choice == 1) {
			// 강아지 선택
			avatar = new Dog(name, 20, 20); // 업캐스팅 
		} else if(choice == 2) {
			// 고양이 선택
			avatar = new Cat(name, 100, 100); // 업캐스팅
		} else {
			// 양 선택
			avatar = new Sheep(name, 50, 50); // 업캐스팅
		}
		
		while(true) {
			System.out.println("1.먹이주기");
			System.out.println("2.산책가기");
			System.out.println("3.씻기기");
			System.out.println("4.나가기");
			System.out.println("입력 : ");
			choice = Integer.parseInt(sc.nextLine());
			
			if(choice == 4) {
				System.out.println("게임을 종료합니다");
				break;
			}else if(choice == 1) {
				avatar.eat();
			}else if(choice == 2) {
				avatar.walk();
			}else if(choice == 3) {
				avatar.wash();
			}else {
				System.out.println("잘 못 입력했습니다.");
			}
		}
		
		// 사용자가 선택한 캐릭터가 고양이었다면 고양이에만 존재하는 메소드를 실행시키고
		// 종료한다
		// OnlyCat은 Cat클래스에서 새롭게 정의한 메소드이기 때문에
		// 사용하려면 다시 Cat타입으로 다운캐스팅 해야 한다.
		if(avatar instanceof Cat) {
			Cat c = (Cat)avatar; // 다운캐스팅
			c.onlyCat();
		}
		
		
		
		
		
	}
}
