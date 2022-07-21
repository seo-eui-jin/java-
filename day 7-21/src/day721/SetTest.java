package day721;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
	public static void main(String[] args) {
		HashSet<String> s = new HashSet<String>();
		System.out.println(s);
		// size() : 세트의 크기
		System.out.println(s.size());
		// isEmpty() : 비어있을때 true, 아니면 false return
		System.out.println(s.isEmpty());
		
		// add(값) : 값을 세트에 추가한다, 중복된 값이 있다면 1개만 추가된다
		s.add("banana");
		s.add("apple");
		s.add("grape");
		s.add("peach");
		s.add("apple"); // 중복된 값은 저장하지 않고, 순서가 없이 저장된다
		System.out.println(s);
		
		// remove(값) : 값을 세트에서 삭제한다
		System.out.println(s.remove("banana"));
		System.out.println(s.remove("bananaadfdas"));
		System.out.println(s);
		
		// 세트의 개별적 요소를 각각 조회하는 방법
		// iterator() 순서를 부여해준다 : 반복자
		Iterator<String> iter = s.iterator();
		// hasNext() --> 꺼낼 요소가 남아있다면 true를 return, 없다면 false를 return
		// next() --> 요소를 return 한다
		
		while(iter.hasNext() == true) {
			System.out.println(iter.next());
		}
		
				
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());
//		
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());
//		
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());
//		
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next()); 세트의 요소 갯수가 다 없이지면 오류
		
		System.out.println("-----------빠른for문------------");
		
		for(String fruit : s) {
			System.out.println(fruit);
		}
		
		
	}
}
