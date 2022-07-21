package day721;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SetTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<String> names = new HashSet<String>(); // �̸��� ������ �������
		
		// �ݿ� �����ϴ� �л� �̸��� ������ ������ ����ϴ� ���α׷�
		// ���α׷��� �����ϸ� �л� �̸��� �Է¹ޱ� �����Ѵ�
		// �̶� "����" �� �Է��ϸ� �л� �̸��� �׸� �Է� �޴´�
	
		while(true) {
			System.out.println("�̸�(���Ḧ �Է��ϸ� ����ϴ�) : ");
			String name = sc.nextLine();
			if(name.equals("����")) {
				break;
			}
			names.add(name);
			System.out.println("�̸� �߰���");
		}
		// �Է��� ������ ���� �ش� �� �л� �̸���� �̸��� ������ ����Ѵ�
		Iterator<String> iter = names.iterator();
		int num = 0;
		while(iter.hasNext()) {
			num++;
			System.out.println("�̸�" + num + " : " + iter.next());
		}
		System.out.println("��" + names.size() + "���� �̸��� �����մϴ�.");
		
	}
}
