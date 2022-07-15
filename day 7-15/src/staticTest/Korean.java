package staticTest;

public class Korean {
	String name; // 인스턴스 변수
	int age; // 인스턴스 변수
	static String country = "KOREA"; // 클래스 변수
	
	// 초기화 생성사 단축키 : alt + shift + s > o > enter
	public Korean(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 스태틱 메소드, 정적 메소드
	public static void show() { // 모든 인스턴스에서 동일하게 동작하는 메소드
		System.out.println("static 메소드 호출됨");
		System.out.println(country); // 인스턴스마다 달라지지 않는 스태틱 변수는 사용 가능
		// 인스턴스마다 달라지는 인스턴스변수는 사용할 수 없다.
		// System.out.println(this.name);
	}
	
	
}
