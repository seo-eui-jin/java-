package day718;

public class SleepTest {
	public static void main(String[] args) {
		// 잠시동안 실행을 멈추는 메소드
		// sleep(밀리초) --> Thread, static 메소드임
		System.out.println("시작");
		for (int i = 0; i < 10; i++) {
			System.out.print("~");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
			System.out.println("종료");
			
			
		}
}
