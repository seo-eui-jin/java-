package WrapperTest;

import java.util.Scanner;

public class StringTask {
	public static void main(String[] args) {
		// ����ڿ��� ��й�ȣ�� �Է¹޾Ƽ� ��ȣȭ�Ͽ� ����϶�
		// ��й�ȣ�� �ѱ� ������
		Scanner sc = new Scanner(System.in);
		System.out.println("��й�ȣ �Է� : ");
		String pw = sc.nextLine();
		
		String en_pw = "";
		for (int i = 0; i < pw.length(); i++) {
			en_pw += (char)(pw.charAt(i) * 3);
			}
		System.out.println("��ȣȭ�� ��й�ȣ : " + en_pw);
		
		System.out.println("--------------------");
		
		// en_pw�� ����ִ� ��ȣȭ�� ��й�ȣ�� ��ȣȭ �Ͽ� ����϶�
		String de_pw = "";
		for (int i = 0; i < en_pw.length(); i++) {
			de_pw += (char)(en_pw.charAt(i) / 3);
		}
		System.out.println("��ȣȭ�� ��й�ȣ : " + de_pw);
		
		System.out.println("--------------------");
		
		// ����ڿ��� �޴���ȭ��ȣ�� �Է¹޾Ƽ� 010-1234-1234
		// �ش� �޴���ȭ�� 01012341234 �� �����Ͽ� ����϶�
		System.out.println("��ȭ��ȣ�� �Է��ϼ��� : ");
		String phone = sc.nextLine();
		String[] temp = phone.split("-");
		String res = String.join("", temp);
		
//		for (int i = 0; i < temp.length; i++) {
//			res += temp[i];
//		}
		
		System.out.println("������ ������ : " + res);
		
		System.out.println("--------------------");
		
		
		// ����ڿ��� ���� �̸� �ڵ�����ȣ�� �Է¹޾Ƽ�
		// ����,�̸�,�ڵ�����ȣ
		// �� ����� �ϳ��� ���ڿ��� ����϶�
		String[] info = new String[3];
		String[] head = {"����", "�̸�", "�ڵ�����ȣ"};
		
		for (int i = 0; i < info.length; i++) {
			System.out.println(head[i] + " : ");
			info[i] = sc.nextLine();
		}
		
		String res2 = String.join(",", info);
		System.out.println(res2);
		
//		System.out.println("���̸� �Է��ϼ��� : ");
//		info[0] = sc.nextLine();
//		System.out.println("�̸��� �Է��ϼ��� : ");
//		info[1] = sc.nextLine();
//		System.out.println("�ڵ��� ��ȣ�� �Է��ϼ��� : ");
//		info[2] = sc.nextLine();
		
		System.out.println("--------------------");
		
		// ����ڿ��� ���� �ܾ �Է¹޾Ƽ�
		// �ι�° o���� ������ �߶� ����϶�
		// ex) orange delicious --> ous
		String target = sc.nextLine();
		int firstO = target.indexOf("o");
		int secondO = target.indexOf("o", firstO + 1);
		System.out.println("ù��° o�� ��ġ : " + firstO);
		System.out.println("�ι�° o�� ��ġ : " + secondO);
		String res3 = target.substring(secondO);
		System.out.println(res3);
		
		System.out.println("--------------------");
		
		// ����ڿ��� ����� �� ���� �Է¹޾Ƽ� �� ���� ���� ����� ����϶�
		System.out.println("�� ���� ����� �Է�");
		String[] temp2 = sc.nextLine().split(" ");
		System.out.println("��� : " + Integer.parseInt(temp2[0]) + Integer.parseInt(temp2[1]));
		
		// ����ڿ��� �ѱ۷� ���ڸ� �Է¹پƼ�
		// ���ڷ� �����Ͽ� ����϶�
		// ex) �Է� >> �ϰ��̻�
		// ��� >> 1023
		String input = sc.nextLine();
		
		String hangeul = "�����̻�����ĥ�ȱ�";
		
		String res4 = "";
		for (int i = 0; i < input.length(); i++) {
			// System.out.println("input.charAt("+i+") : " + input.charAt(i));
			res += (hangeul.indexOf(input.charAt(i)));
		}
		System.out.println("�ٲ� ��� : " + res4);
		
		
	}
}
