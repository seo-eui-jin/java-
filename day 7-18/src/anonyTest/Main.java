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
					System.out.println("�͸�Ŭ������ ���ǵ� �޼ҵ�");
				}
			
			
			@Override
			public void work() {
				System.out.println("�������̵� work");
			}
			
			@Override
			public void sleep() {
				System.out.println("�������̵� sleep");
			}
			
			@Override
			public void eat() {
			System.out.println("�������̵� eat");
			}
		};
		
		s.sleep();
//		s.f() ���Ӱ� ���� �޼ҵ��̱� ������ ��ĳ���� �� �������� ����� �Ұ��ϴ�
	}
}
