package day710;

public class PrintTest2 {
	public static void main(String[] args) {
		System.out.print("�ȳ��ϼ���");
		System.out.print("�ݰ����ϴ�");
		System.out.println();
		System.out.println();

		System.out.printf("������ %-10d���Դϴ�\n", 31);
		System.out.printf("������ %-10.3f�Դϴ�\n", 3.14);
		System.out.printf("���� ������ %10c\n", 'A');
		System.out.printf("�� �̸��� %10.2s�Դϴ�\n", "������");
		
		//���������ڰ� ������ ������ ���
		//������ ���߾� ����Ѵ�
		System.out.printf("%c, %d �� %s", 'a', 10, "ddd");
	}

}
