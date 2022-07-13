package day713;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		// nextInt() --> Random
		Random r = new Random();
		
		// nextInt(값) --> 0부터 갑-1 사이의 정수를 랜덤으로 가져온다.
		System.out.println(r.nextInt(100)+1); // 1~100까지의 숫자 중 랜덤하게 가져옴.
	}
}
