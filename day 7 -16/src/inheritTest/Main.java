package inheritTest;

public class Main {
	public static void main(String[] args) {
		Car momCar = new Car("MOM", 2000, "blue");
		SuperCar myCar = new SuperCar("������", 20000, "Red", "Soprts");
		
//		momCar.color = "blue";
//		momCar.name = "MOM";
//		momCar.price = 2000;
//		momCar.mode = "Sprots"; �ڽĿ��� �ִ� �ν��Ͻ� ������ �θ�Ÿ�Կ��� ��� �Ұ�
		
//		myCar.name = "������";
//		myCar.color = "Red";
//		myCar.price = 20000;
//		myCar.mode = "Soprts";
		
		
		myCar.show();
		momCar.show();
		
		momCar.go();
		momCar.engineOn(); // �θ𿡼� ���ǵ� engineOn() ȣ��
		
		myCar.go();
		myCar.engineOn(); // �ڽĿ��� �����ǵ� engineOn() ȣ��
//		myCar.engineOn2();
		
		myCar.openRoof();
//		momCar.openRoof(); // �ڽ�Ŭ�������� ���Ӱ� ���� �޼ҵ�� �θ�Ŭ�������� ����� �Ұ����ϴ�
		
		
		// ��ӹ��� �ڽ��� �θ�Ÿ�Ե� �ȴ�
		System.out.println(myCar instanceof SuperCar); // true
		System.out.println(momCar instanceof SuperCar); // false
		System.out.println(myCar instanceof Car); // true
		System.out.println(momCar instanceof Car); // true
		
		// ��ĳ���� : �ڽ��� �θ�Ÿ������
		Car c = myCar;
//		c.mode				// ��ĳ���� �ȴٸ� �ڽĿ��� ���Ӱ� ���� ������� ����� �Ұ����ϴ�
//		c.openRoof();
		c.engineOn();		// �����ǵ� �޼ҵ尡 �״�� ȣ��ȴ�
		c.go();				// �θ𿡸� ���ǵ� �޼ҵ嵵 ��밡��

		
		// �ٿ�ĳ���� : �θ�Ÿ������ ��ĳ���õ� �ڽ��� �ٽ� �ڽ�Ÿ������ �ٲٴ� ��
		SuperCar s = (SuperCar) c;
		s.mode = "normal";
		s.openRoof();
		
		Object[] ar = {myCar, momCar, "�ȳ�", s};
		
		
	}
}
