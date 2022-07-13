package tjnoraebang;

import java.util.Random;
import java.util.Scanner;

public class Noraebang {
	public static void main(String[] args) {
//		���� �뷡��
//		1. �ݾ� �Է��ϱ�
//			�Ѱ� �� : 300��
//			�뷡 ���
//			�ܵ��� �ִٸ� �ܵ���� (���ٸ� �ܵ� ��� �� ��)
//		
//		2. �뷡 �θ���
//			�������� �뷡 ���� ���
//			100�� �뷡 �� �� ����
//			50�� �̸� �뷡 �� �� ����
//		
//		3. ���� �����ϱ�
//			�뷡 ��� ����� ����
//		
//		4. �� �뷡�Ƿ� �ľ��ϱ�
//			��ü�θ� �뷡�� ��� ���� �˷��ֱ�
//		
//		5. ������
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int choice = 0;
		int songCnt = 0;
		int totalScore = 0; // ���� ������ ������ ����
		int totalSong = 0; // �θ� �� �뷡 ����� ������ ����
		
	
		String introMsg = "------�ȳ��ϼ��� �뷡���Դϴ�------";
		String mainMenu = "1.�ݾ� �Է��ϱ�\n"
						+ "2.�뷡 �θ���\n"
						+ "3.���� �����ϱ�\n" 
						+ "4.�� �뷡 �Ƿº���\n" 
						+ "5.������\n";
		
		System.out.println(introMsg);
		
		while(true) {
			System.out.println(mainMenu);
			choice = sc.nextInt();
			if(choice == 5) { // ������
				System.out.println("������ �� ������");
				break;
			}else if(choice == 1) { // �ݾ� �Է��ϱ�
				// ����ڿ��� �ݾ��� �Է¹޾Ƽ�
				// �θ� �� �ִ� �뷡 �� ���� �ܵ� ����ϱ�
				System.out.println("�ݾ��� �Է��ϼ��� : ");
				int money = sc.nextInt();
				// money�� 300 �̸��� ����ִٸ� �� �� �Է��߽��ϴ�. ��� �� ���� �޴��� �̵��ϱ�
				if(money < 300) {
					System.out.println("�� �� �Է��ϼ̽��ϴ�.\n");
					continue;
				}
				songCnt = songCnt + money / 300;
				int rest = money % 300;
				
				System.out.println("�θ� �� �ִ� �뷡 �� ���� : " + songCnt );
				if(rest != 0) {
					System.out.println("�� ���� : " + rest + "�� �Դϴ�.");
				}
				
			}else if(choice == 2) { // �뷡 �θ���
				if(songCnt < 1) {
					System.out.println("�ݾ��� ���� ������ּ���\n");
					continue;
				}
				songCnt--;
				int score = r.nextInt(100)+1;
				totalScore += score;
				totalSong++;
				
				System.out.println("����� ������ " + score + "�� �Դϴ�.");
				if(score == 100) {
					songCnt++;
					System.out.println("100���̶� �� �� ���� �Դϴ�.");
				} else if(score >= 80) {
					System.out.println("�Ǹ��մϴ�.");
				} else if(score >= 50) {
					System.out.println("������ �� ���� ����� ���� �ſ���");
				} else {
					if(songCnt >= 1) {
						songCnt--;
				}
					System.out.println("50�� �̸��̶� �뷡 �� ���� �����մϴ�.");
				}
					System.out.println("�θ� �� �ִ� �뷡 : " + songCnt + "�� �Դϴ�.");
			}else if(choice == 3) { // ���� �����ϱ�
				System.out.println("1. ����(3��) 2. ��ī��(5��) 3. �������");
				choice = sc.nextInt();
				switch(choice) {
				case 1:
					if(songCnt < 3) {
						System.out.println("�뷡 �� ���� �����մϴ�.");
						continue;
					}
					songCnt -= 3;
					System.out.println("���� 1���� ��Ƚ��ϴ�.");
					System.out.println("�θ� �� �ִ� �뷡 : " + songCnt + "�� �Դϴ�.");
					break;
				case 2:
					if(songCnt >= 5) {
						songCnt -= 5;
						System.out.println("��ī�� 1���� ��Ƚ��ϴ�.");
						System.out.println("�θ� �� �ִ� �뷡 : " + songCnt + "�� �Դϴ�.");
					}else {
						System.out.println("�뷡 �� ���� �����մϴ�.");
					}
					break;
				case 3:
					System.out.println("���θ޴��� �̵��մϴ�.");
					break;
				}
				
			}else if(choice == 4) { // �� �뷡 �Ƿº���
				// ���ݱ��� �θ� �뷡 ���� ���� / ���ݱ��� �θ� �뷡 ����
				// �Ҽ��� �Ʒ� �� �ڸ����� ����ϱ�
				if(totalSong == 0) {
					System.out.println("�뷡�� ���� �ҷ��ּ���~\n");
					continue;
				}
				double avg = (double)(totalScore / totalSong);
				System.out.printf("���ݱ��� �θ� �뷡 ��� ������ %.2f���Դϴ�\n", avg);
				
			}else { // �� �� �Է½� ���� ����
				System.out.println("�� �� �Է��ϼ̽��ϴ�.");
			} // if�� �ݴ� �߰�ȣ
			System.out.println();
		} // while�� �ݴ� �߰�ȣ		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

