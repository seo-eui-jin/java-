package day714_2;

public class ClassTest {
	public static void show(Student s) {
		System.out.println("----학생 정보----");
		System.out.println("이름 : " + s.name);
		System.out.println("국어 : " + s.kor);
		System.out.println("영어 : " + s.eng);
	}
	
	
	
	public static void main(String[] args) {
		String name = "서의진";
		// kim : 객체, 인스턴스 
		// new : 메모리에 할당시켜주는 연산자
		// student() : 저장할 위치를 알려준다 , 생성자
		Student kim = new Student(); // 객체화
		Student park = new Student(); // 객체화
		
		park.name = "박영희";
		park.kor = 100;
		park.eng = 70;
		
		kim.name = "김철수";
		kim.kor = 90;
		kim.eng = 80;
		
		kim.introduce();
		park.introduce();
		
		ClassTest.show(park);
		ClassTest.show(kim);
		
//		System.out.println("===학생 정보===");
//		System.out.println("이름 : " + kim.name);
//		System.out.println("국어 점수 : " + kim.kor);
//		System.out.println("영어 점수 : " + kim.eng);
//		
//		System.out.println("===학생 정보===");
//		System.out.println("이름 : " + park.name);
//		System.out.println("국어 점수 : " + park.kor);
//		System.out.println("영어 점수 : " + park.eng);
	}
}


class Student{ // 우리만의 자료형(type)을 만들었다
	String name; // 멤버 , 멤버 변수, 인스턴스 변수
	int kor; // 멤버 , 멤버 변수, 인스턴스 변수
	int eng; // 멤버 , 멤버 변수, 인스턴스 변수
	
	public void introduce() { // 멤버, 멤버 함수 == 메소드
		// this : 자기 자신 객체를 의미한다.
		System.out.println("----학생정보출력----");
		System.out.println("이름 : " + this.name);
		System.out.println("국어 : " + this.kor);
		System.out.println("영어 : " + this.eng);
	}
}