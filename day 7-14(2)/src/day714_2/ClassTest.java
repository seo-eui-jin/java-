package day714_2;

public class ClassTest {
	public static void show(Student s) {
		System.out.println("----�л� ����----");
		System.out.println("�̸� : " + s.name);
		System.out.println("���� : " + s.kor);
		System.out.println("���� : " + s.eng);
	}
	
	
	
	public static void main(String[] args) {
		String name = "������";
		// kim : ��ü, �ν��Ͻ� 
		// new : �޸𸮿� �Ҵ�����ִ� ������
		// student() : ������ ��ġ�� �˷��ش� , ������
		Student kim = new Student(); // ��üȭ
		Student park = new Student(); // ��üȭ
		
		park.name = "�ڿ���";
		park.kor = 100;
		park.eng = 70;
		
		kim.name = "��ö��";
		kim.kor = 90;
		kim.eng = 80;
		
		kim.introduce();
		park.introduce();
		
		ClassTest.show(park);
		ClassTest.show(kim);
		
//		System.out.println("===�л� ����===");
//		System.out.println("�̸� : " + kim.name);
//		System.out.println("���� ���� : " + kim.kor);
//		System.out.println("���� ���� : " + kim.eng);
//		
//		System.out.println("===�л� ����===");
//		System.out.println("�̸� : " + park.name);
//		System.out.println("���� ���� : " + park.kor);
//		System.out.println("���� ���� : " + park.eng);
	}
}


class Student{ // �츮���� �ڷ���(type)�� �������
	String name; // ��� , ��� ����, �ν��Ͻ� ����
	int kor; // ��� , ��� ����, �ν��Ͻ� ����
	int eng; // ��� , ��� ����, �ν��Ͻ� ����
	
	public void introduce() { // ���, ��� �Լ� == �޼ҵ�
		// this : �ڱ� �ڽ� ��ü�� �ǹ��Ѵ�.
		System.out.println("----�л��������----");
		System.out.println("�̸� : " + this.name);
		System.out.println("���� : " + this.kor);
		System.out.println("���� : " + this.eng);
	}
}