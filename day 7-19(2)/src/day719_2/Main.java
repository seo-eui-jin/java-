package day719_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// ����������
		Scanner sc = new Scanner(System.in);

		ArrayList<User> users = new ArrayList<User>();
		
		boolean isDup = false;
		String id = null;

		while (true) {
			System.out.println("1.ȸ������\n2.�α���\n3.ȸ������\n4.������");
			System.out.println("�Է� : ");
			int choice = Integer.parseInt(sc.nextLine());

			if (choice == 4) {
				break;
			} else if (choice == 1) {
				isDup = false;
				System.out.println("id : ");
				id = sc.nextLine();
				// id�� ���� �ߺ� �Ǿ��ٸ� ȸ������ ����
				// id �ߺ����� �˻�
				for (int i = 0; i < users.size(); i++) {
					// users.get(i).id.equals(id)
					if (users.get(i).getId().equals(id)) {
						// �ߺ��� ���̵� ������ �� ���� ����
						isDup = true;
						break;

					}
				}

				if (!isDup) {
					User u = new User();
					u.setId(id); // u.id = id;
					System.out.println("pw : ");
					u.setPw(sc.nextLine()); // u.pw = sc.nextLine();
					System.out.println("�̸� : ");
					u.setName(sc.nextLine()); // u.name = sc.nextLine();
					System.out.println("���� : ");
					u.setAge(Integer.parseInt(sc.nextLine())); // u.age = Integer.parseInt(sc.nextLine());
					users.add(u);
				} else {
					System.out.println("�ߺ��� ���̵� �����մϴ�");
				}
			} else if (choice == 2) {
				// 1.���̵� �Է¹޴´�
				// ��й�ȣ�� �Է¹޴´�
				isDup = false;
				System.out.println("���̵� : ");
				id = sc.nextLine();
				System.out.println("��й�ȣ : ");
				String pw = sc.nextLine();

				// 2.�ش� ���̵� users���� ������ id�� �ִ��� �˻��Ѵ�
				// 3.���� ������ id�� ã�Ҵٸ�
				// �ش� ��й�ȣ�� ��ġ�ϴ��� Ȯ���Ѵ�
				// ��й�ȣ�� ��ġ�Ѵٸ� �α��� ����! 000�� ȯ���մϴ�
				for (User u : users) {
					if (u.getId().equals(id) && u.getPw().equals(pw)) {
						isDup = true;
						System.out.println("�α��� ����");
						System.out.println(u.getName() + "�� ȯ���մϴ�");
						break;

					} 	
				}
				// ��й�ȣ�� ��ġ���� �ʴ´ٸ� �α��� ����
				if(isDup == false) { // isDup�� false��� �α����� �����ߴٴ� �ǹ�
					System.out.println("�α��� ����");
					
				}
				// 4. ������ id�� users�� �������� �ʴ´ٸ� �α��� ����
				// ���� for��

			} else if (choice == 3) {
				isDup = false;
				// 1.���̵� �Է¹޴´�
				System.out.println("�˻��� id : ");
				id = sc.nextLine();
				// 2. �ش���̵� users���� ������ id�� �ִٸ�
				for (int i = 0; i < users.size(); i++) {
					if(users.get(i).getId().equals(id)) {
						isDup = true;
						users.get(i).show();
						break;
					}
				}
				// �ش� ȸ���� ������ �����ش�
				// ������ id�� ���ٸ�
				// �˻�����!, �ش� ���̵� �������� �ʽ��ϴ�
				// ����for��, �Ϲ� for��
				if(isDup == false) {
					System.out.println("�˻� ����");
				}
			} else {
				System.out.println("�߸� �Է� �߽��ϴ�");
			}
		}

	}
}
