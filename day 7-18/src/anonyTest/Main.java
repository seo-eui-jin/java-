package anonyTest;

import day718.SecondMan;
import day718.Soldier;

public class Main {
	public static void main(String[] args) {
		Car c = new Car() {
			public void engineOn() {
				
			}
			@Override
			public void go() {
				// TODO Auto-generated method stub
				super.go();
			}
			
		};
		
		
		
		Soldier s2 = new SecondMan();
		s2.eat();
		
		
			
		Soldier s = new Soldier() {
			public void f() {
					System.out.println("익명클래스에 정의된 메소드");
				}
			
			
			@Override
			public void work() {
				System.out.println("오버라이딩 work");
			}
			
			@Override
			public void sleep() {
				System.out.println("오버라이딩 sleep");
			}
			
			@Override
			public void eat() {
			System.out.println("오버라이딩 eat");
			}
		};
		
		s.sleep();
//		s.f() 새롭게 만든 메소드이기 때문에 업캐스팅 된 곳에서는 사용이 불가하다
	}
}
