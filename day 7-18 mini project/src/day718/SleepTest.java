package day718;

public class SleepTest {
	public static void main(String[] args) {
		// ��õ��� ������ ���ߴ� �޼ҵ�
		// sleep(�и���) --> Thread, static �޼ҵ���
		System.out.println("����");
		for (int i = 0; i < 10; i++) {
			System.out.print("~");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
			System.out.println("����");
			
			
		}
}
