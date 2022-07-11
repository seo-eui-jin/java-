package day711_2;

import java.util.Scanner;

public class Day711_2_example {
	public static void main(String[] args) {
		
		// 1.target�� ����ִ� ���ڰ� �ҹ��ڶ�� �ҹ����Դϴ�, �ƴ϶�� �ҹ��ڰ� �ƴմϴ� ����ϱ�
		char target = 'A';
		System.out.println(65 < target && 98 > target  ? "�ҹ��� �Դϴ�." : "�빮�� �Դϴ�.");
		
			
		// 2.����ڿ��� �� ������ �Է� ���� �� ���� �� ū ���� ����ϱ�
		// ex) 20,100�� �Է����� �� �� �� �� ū ���� 100�Դϴ� ���
		Scanner sc = new Scanner(System.in);
		System.out.println("ù�� ° ������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		System.out.println("�ι� ° ������ �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		System.out.println(num > num2 ? "�� �� �� ū ���� " + num + "�Դϴ�." : "�� �� �� ū ���� " + num2 + "�Դϴ�." );
		
		
		// 3.����ڿ��� �� ������ �Է� �޾� �� ���� �� (ū �� - ���� ��)0�̻��� ���� ����ϱ�
		// ex) 20,100�� �Է����� �� �� ���� ���� 80�Դϴ� ���
		Scanner sc1 = new Scanner(System.in);
		System.out.println("ù�� �� ������ �Է��ϼ��� : ");
		int num3 = sc1.nextInt();
		System.out.println("�ι� ° ������ �Է��ϼ��� : ");
		int num4 = sc1.nextInt();
		System.out.println(num3 > num4 ? "�μ��� ���� " + (num3 - num4) + " �Դϴ�." : "�μ��� ���� " + (num4 - num3) + " �Դϴ�.");
		
		
		// 4. ����ڿ��� ���̸� �Է� �޾Ƽ� ���̰� 10�̻� 30���϶�� 1500��, �ƴ϶�� �����Դϴ� ����ϱ�
		Scanner sc2 = new Scanner(System.in);
		System.out.println("���̸� �Է��ϼ��� : ");
		int age = sc2.nextInt();
		System.out.println(age > 10 && age < 30 ? "1500�� �Դϴ�." : "�����Դϴ�.");
		
		
		// 5. 8�� �̻�, 110cm �̻��� ����� ž���� �� �ִ� ���̱ⱸ�� �ִ�
		// ���̿� Ű�� �Է� �޾Ƽ� ž�� ���� ���θ� ����ض�
		Scanner sc3 = new Scanner(System.in);
		System.out.println("���̸� �Է��ϼ��� : ");
		int age1 = sc3.nextInt();
		System.out.println("Ű�� �Է��ϼ��� : ");
		int cm = sc3.nextInt();
		System.out.println(age1 > 9 && cm > 110 ? "ž�� ���� �մϴ�." : "ž�� �Ұ��� �մϴ�.");
		
		
		// 6. �� �ڽ��� 20���� ����� ����. ����� ������ �Է� �޾� �ʿ��� ������ ������ ����϶�
		// 56 --> 3�ڽ�, 60 --> 3�ڽ�
		Scanner sc4 = new Scanner(System.in);
		System.out.println("����� ������ �Է��ϼ��� : ");
		int r = sc.nextInt();
		System.out.println(r % 20 == 0 ? r / 20 : r / 20 + 1  );
		
		
		/*
				 �ڷ���
			int -10,5,0
			double - 3.1, 0.0, ....
			char - 'a', '��',....
			String - "", ....
			bollean - true, false
		
		������ -������ ����� � Ÿ������ �ľ��ϴ� ��
			-��� ������
			 
			-���� ������
					a > b : a�� b���� ũ�� ?
						�´ٸ� true, �ƴϸ� false
					a < b : a�� b���� �۴� ?
						�´ٸ� true, �ƴϸ� false
					a >= b : a�� b���� ũ�ų� ���� ?
						�´ٸ� true, �ƴϸ� false
					a <= b : a�� b���� �۰ų� ����?
						�´ٸ� true, �ƴϸ� false
					a == b : a�� b�� ���� ?
						�´ٸ� true, �ƴϸ� false
						�ڹ��ڿ��� equals()�޼ҵ带 ���� ������ ���Ѵ�.
					a != b : a�� b�� �ٸ��� ?
						�´ٸ� true, �ƴϸ� false
					�ڰ��迬������ ����� boolean Ÿ���̴�
					
					����(char)�� �� �����ϴ� �ƽ�Ű �ڵ�ǥ�� �̿��Ѵٸ�
			
			-�� ������
					a && b : and ����
						a�� true��, b�� true�̸� ����� true �ƴϸ� false
					a || b : or ����
						a Ȥ�� b �� �� �ϳ��� true�� ����� true, �ƴϸ� false
					!a : not ����
						a�� true�� false,
						a�� false�� true
					�ڿ����� ����� boolean Ÿ���̴�.
		
			�������� �켱���� ex) 10 != 5 && 7 < 9
					�ֿ켱 ������ - ( )
					���� ������(���� �ϳ��� ������) - !
					��� ������ - * / % + -
					����Ʈ ������ 
					���� ������ - > < >= <= == !=
				         �� ������ - && ||
					���� ������
					���� ������ - =
				
			���� ������ 
					���ǽ� ? ���϶��� : �����϶���;
				        ex) true ? "�ȳ�" : "10";
					���ǽ��� ���̶�� �ݷ�(:) ���� ���� ���׿����� ���
					���ǽ��� �����̶�� �ݷ� ���� ���� ���� ������ ���
				
			���ǽ�
				�� ������ �Ǻ��� �� �ִ� ��(boolean Ÿ���� �;��Ѵ�)
		 */
	}
}
