package day710;

public class PrintTest2 {
	public static void main(String[] args) {
		System.out.print("안녕하세요");
		System.out.print("반갑습니다");
		System.out.println();
		System.out.println();

		System.out.printf("오늘은 %-10d일입니다\n", 31);
		System.out.printf("오늘은 %-10.3f입니다\n", 3.14);
		System.out.printf("저의 학점은 %10c\n", 'A');
		System.out.printf("제 이름은 %10.2s입니다\n", "서의진");
		
		//형식지정자가 여러개 쓰였을 경우
		//순서를 맞추어 사용한다
		System.out.printf("%c, %d 와 %s", 'a', 10, "ddd");
	}

}
