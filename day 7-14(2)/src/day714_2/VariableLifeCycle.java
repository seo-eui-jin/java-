package day714_2;

public class VariableLifeCycle {
	public static int change(int a) { // change�޼ҵ忡 ����� �������� a
		int num;// ��������
		
		a += 100; // change() �������� a�� ���� �����
		return a;
	}// �޼ҵ� ȣ���� ������ �޸𸮿��� ������
	
	
	public static void main(String[] args) {
		int a = 10; // main() ���� ��������,
		a = VariableLifeCycle.change(a); // a�� ����� ���� ����ż� �Ѿ
		System.out.println(a); //main() �������� a�� �����
	}
}
