package day715;

public class Student {
	String name;
	int kor;
	int eng;
	
	// 정의된 생성자가 없다면 컴퓨터(컴파일러)가 알아서 생성자를 추가해준다
	// 정의된 생성자가 있다면 기본생성자를 추가해주지 않는다
	// 기본생성자를 명시적으로 정의함으로써 메소드 오버로딩처럼 여러 방식으로 생성자를 활용할 수 있다.
	public Student() {;}
	
	public Student(String name, int kor, int eng) { // 초기화 생성자 
		this.name = name; 
		this.kor = kor;
		this.eng = eng;
	}
	
	public void show() {
		System.out.println("===학생 정보====");
		System.out.println("이름 : " + this.name );
		System.out.println("국어 : " + this.kor);
		System.out.println("영어 : " + this.eng);
	}
}
