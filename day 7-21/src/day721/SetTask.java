package day721;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SetTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<String> names = new HashSet<String>(); // 이름을 저장할 저장공간
		
		// 반에 존재하는 학생 이름의 종류와 갯수를 출력하는 프로그램
		// 프로그램을 시작하면 학생 이름을 입력받기 시작한다
		// 이때 "종료" 를 입력하면 학생 이름을 그만 입력 받는다
	
		while(true) {
			System.out.println("이름(종료를 입력하면 멈춥니다) : ");
			String name = sc.nextLine();
			if(name.equals("종료")) {
				break;
			}
			names.add(name);
			System.out.println("이름 추가됨");
		}
		// 입력이 끝나고 나면 해당 반 학생 이름들과 이름의 갯수를 출력한다
		Iterator<String> iter = names.iterator();
		int num = 0;
		while(iter.hasNext()) {
			num++;
			System.out.println("이름" + num + " : " + iter.next());
		}
		System.out.println("총" + names.size() + "개의 이름이 존재합니다.");
		
	}
}
