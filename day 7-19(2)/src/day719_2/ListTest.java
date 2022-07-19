package day719_2;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		// <> 안에는 리스트 안에 저장할 요소의 클래스 타입을 써줘야 한다
		// 뒤에 있는 <>안에는 생략이 가능하다
		ArrayList<Integer> ar = new ArrayList<Integer>();
		System.out.println(ar);
		// ar이라는 ArrayList에 값을 추가하기
		// add(값) --> 값을 리스트의 요소로 추가해준다
		
		ar.add(10);
		ar.add(35);
		ar.add(15);
		ar.add(10); // 순서가 존재하고, 중복 값을 넣을 수 있다.
		System.out.println(ar);
		
		// size() : ArrayList 속의 요소 갯수를 return
		System.out.println("ar.size() : " + ar.size());
		
		// get(인덱스) : ArrayList안에 해당 인덱스 요소를 return
		for (int i = 0; i < ar.size(); i++) {
		System.out.println(ar.get(i));
		}
//		System.out.println(ar.get(0));
//		System.out.println(ar.get(1));
//		System.out.println(ar.get(2));
//		System.out.println(ar.get(3));
//		System.out.println(ar.get(4)); 인덱스번호 벗어나면 오류 발생
		
		// 값을 중간에 삽입하기
		// 1번째 인덱스에 100 삽입하기
		ar.add(1, 100);
		System.out.println(ar);
		
		// remove(인덱스) : 해당 인덱스의 요소를 삭제한다
		ar.remove(1);
		System.out.println(ar);
		
		// isEmpty()
		System.out.println(ar.isEmpty());
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("안녕");
		names.add("반가워");
		names.add("다음에");
		names.add("또보자");
		System.out.println(names);
		
		for(String n : names) {
			System.out.println(n);
		}

		// 리스트를 쓰고 있다는 가독성을 높이기 위해 이렇게 표현 하기도 한다
		List <Double> ar2 = new ArrayList<Double>();
		
		
		// 제네릭을 생략하면 기본적으로 Object 타입이 들어간다
//		ArrayList temp = new ArrayList();
//		temp.add(10);
//		temp.add("안녕");
//		temp.add(3.1);
//		System.out.println(temp);
		
		
		
		
	}
}
