package staticTest;

import accessTest.Test;

public class Main {
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.d); // public�� ��� ����
		t.f4(); // public�� ��밡��
		
		
		Korean kim = new Korean("��ö��",10);
		Korean park = new Korean("�ڿ���",20);
		
		
		kim.name = "�������";
		System.out.println(kim.name);
		System.out.println(park.name);
		
		kim.country = "USA";
		System.out.println(kim.country);
		System.out.println(park.country);
		
		// ����ƽ ������ ��� �ν��Ͻ�(��ü)�� ���� �����ϱ� ������
		// �ν��Ͻ��� �߿����� �ʴ� ���� Ŭ������.���������� ����� �� �ִ�.
		System.out.println(Korean.country);
		
		kim.show();
		park.show();
		Korean.show(); // Ŭ������.�޼ҵ��();
		
		
	
		
		
		
		
		
		
		
	}
}
