package day715;

public class Student {
	String name;
	int kor;
	int eng;
	
	// ���ǵ� �����ڰ� ���ٸ� ��ǻ��(�����Ϸ�)�� �˾Ƽ� �����ڸ� �߰����ش�
	// ���ǵ� �����ڰ� �ִٸ� �⺻�����ڸ� �߰������� �ʴ´�
	// �⺻�����ڸ� ��������� ���������ν� �޼ҵ� �����ε�ó�� ���� ������� �����ڸ� Ȱ���� �� �ִ�.
	public Student() {;}
	
	public Student(String name, int kor, int eng) { // �ʱ�ȭ ������ 
		this.name = name; 
		this.kor = kor;
		this.eng = eng;
	}
	
	public void show() {
		System.out.println("===�л� ����====");
		System.out.println("�̸� : " + this.name );
		System.out.println("���� : " + this.kor);
		System.out.println("���� : " + this.eng);
	}
}
