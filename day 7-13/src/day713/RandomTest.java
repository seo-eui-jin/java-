package day713;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		// nextInt() --> Random
		Random r = new Random();
		
		// nextInt(��) --> 0���� ��-1 ������ ������ �������� �����´�.
		System.out.println(r.nextInt(100)+1); // 1~100������ ���� �� �����ϰ� ������.
	}
}
