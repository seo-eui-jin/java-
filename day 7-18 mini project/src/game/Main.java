package game;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		Dog test = new Dog("�����", 20, 20);
//		test.eat();
//		test.walk();
//		test.wash();
		
		Scanner sc = new Scanner(System.in);
		Animal avatar = null;
			
		System.out.println("====�𿩶� ���� ģ����====");
		System.out.println("���� ĳ���͸� �����ϼ���");
		System.out.println("1. ������");
		System.out.println("2. �����");
		System.out.println("����������. ��");
		System.out.println("�Է� : ");
		
		int choice = Integer.parseInt(sc.nextLine());
		
		System.out.println("ĳ���� �̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
		if(choice == 1) {
			// ������ ����
			avatar = new Dog(name, 20, 20); // ��ĳ���� 
		} else if(choice == 2) {
			// ����� ����
			avatar = new Cat(name, 100, 100); // ��ĳ����
		} else {
			// �� ����
			avatar = new Sheep(name, 50, 50); // ��ĳ����
		}
		
		while(true) {
			System.out.println("1.�����ֱ�");
			System.out.println("2.��å����");
			System.out.println("3.�ı��");
			System.out.println("4.������");
			System.out.println("�Է� : ");
			choice = Integer.parseInt(sc.nextLine());
			
			if(choice == 4) {
				System.out.println("������ �����մϴ�");
				break;
			}else if(choice == 1) {
				avatar.eat();
			}else if(choice == 2) {
				avatar.walk();
			}else if(choice == 3) {
				avatar.wash();
			}else {
				System.out.println("�� �� �Է��߽��ϴ�.");
			}
		}
		
		// ����ڰ� ������ ĳ���Ͱ� ����̾��ٸ� ����̿��� �����ϴ� �޼ҵ带 �����Ű��
		// �����Ѵ�
		// OnlyCat�� CatŬ�������� ���Ӱ� ������ �޼ҵ��̱� ������
		// ����Ϸ��� �ٽ� CatŸ������ �ٿ�ĳ���� �ؾ� �Ѵ�.
		if(avatar instanceof Cat) {
			Cat c = (Cat)avatar; // �ٿ�ĳ����
			c.onlyCat();
		}
		
		
		
		
		
	}
}
