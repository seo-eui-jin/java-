package staticTest;

public class Korean {
	String name; // �ν��Ͻ� ����
	int age; // �ν��Ͻ� ����
	static String country = "KOREA"; // Ŭ���� ����
	
	// �ʱ�ȭ ������ ����Ű : alt + shift + s > o > enter
	public Korean(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// ����ƽ �޼ҵ�, ���� �޼ҵ�
	public static void show() { // ��� �ν��Ͻ����� �����ϰ� �����ϴ� �޼ҵ�
		System.out.println("static �޼ҵ� ȣ���");
		System.out.println(country); // �ν��Ͻ����� �޶����� �ʴ� ����ƽ ������ ��� ����
		// �ν��Ͻ����� �޶����� �ν��Ͻ������� ����� �� ����.
		// System.out.println(this.name);
	}
	
	
}
