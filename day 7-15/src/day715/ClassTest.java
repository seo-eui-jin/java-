package day715;

import java.util.Scanner;

public class ClassTest {
	public static void main(String[] args) {
//		Student kim = new Student("김철수",90,70);
//		Student park = new Student("박영희",100,80);
//		Student s = new Student();
		
		Student[] students = {new Student("김철수",90,70), 
								new Student("박영희",100,80), 
								new Student("홍길동",50,60)};
		
		// 학생 이름을 입력 받아서
		// 해당 학생의 성적 정보를 출력하는 프로그램
		// 이 학교에는 세 명의 학생이 있고, 정보는 students라는 배열에 저장되어 있다.
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 이름을 입력하세요 : ");
		String name = sc.nextLine();
		boolean check = false; // flag 변수
		
		for(Student a : students) {
			if(a.name.equals(name)) {
				check = true;
				a.show();
			}
		}
		if(check == false) {
			System.out.println("해당 학생은 찾을 수 없습니다.");
		}
		
		
		students[0].show(); // kim이라는 객체 == kim.show();
		students[1].show(); // park이라는 객체 == park.show();
		students[2].show();
		
		// 빠른 for문
		for(Student st : students) {
			st.show();
		}
		
//		kim.name = "김철수";
//		kim.kor = 90;
//		kim.eng = 70;
//		
//		park.name = "김철수";
//		park.kor = 100;
//		park.eng = 80;
		
//		kim.show();
//		park.show();
		
				
	}
}



