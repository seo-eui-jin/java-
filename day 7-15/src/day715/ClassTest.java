package day715;

import java.util.Scanner;

public class ClassTest {
	public static void main(String[] args) {
//		Student kim = new Student("��ö��",90,70);
//		Student park = new Student("�ڿ���",100,80);
//		Student s = new Student();
		
		Student[] students = {new Student("��ö��",90,70), 
								new Student("�ڿ���",100,80), 
								new Student("ȫ�浿",50,60)};
		
		// �л� �̸��� �Է� �޾Ƽ�
		// �ش� �л��� ���� ������ ����ϴ� ���α׷�
		// �� �б����� �� ���� �л��� �ְ�, ������ students��� �迭�� ����Ǿ� �ִ�.
		Scanner sc = new Scanner(System.in);
		System.out.println("�л� �̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		boolean check = false; // flag ����
		
		for(Student a : students) {
			if(a.name.equals(name)) {
				check = true;
				a.show();
			}
		}
		if(check == false) {
			System.out.println("�ش� �л��� ã�� �� �����ϴ�.");
		}
		
		
		students[0].show(); // kim�̶�� ��ü == kim.show();
		students[1].show(); // park�̶�� ��ü == park.show();
		students[2].show();
		
		// ���� for��
		for(Student st : students) {
			st.show();
		}
		
//		kim.name = "��ö��";
//		kim.kor = 90;
//		kim.eng = 70;
//		
//		park.name = "��ö��";
//		park.kor = 100;
//		park.eng = 80;
		
//		kim.show();
//		park.show();
		
				
	}
}



