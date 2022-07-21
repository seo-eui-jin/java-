package day721;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
	public static void main(String[] args) {
		HashSet<String> s = new HashSet<String>();
		System.out.println(s);
		// size() : ��Ʈ�� ũ��
		System.out.println(s.size());
		// isEmpty() : ��������� true, �ƴϸ� false return
		System.out.println(s.isEmpty());
		
		// add(��) : ���� ��Ʈ�� �߰��Ѵ�, �ߺ��� ���� �ִٸ� 1���� �߰��ȴ�
		s.add("banana");
		s.add("apple");
		s.add("grape");
		s.add("peach");
		s.add("apple"); // �ߺ��� ���� �������� �ʰ�, ������ ���� ����ȴ�
		System.out.println(s);
		
		// remove(��) : ���� ��Ʈ���� �����Ѵ�
		System.out.println(s.remove("banana"));
		System.out.println(s.remove("bananaadfdas"));
		System.out.println(s);
		
		// ��Ʈ�� ������ ��Ҹ� ���� ��ȸ�ϴ� ���
		// iterator() ������ �ο����ش� : �ݺ���
		Iterator<String> iter = s.iterator();
		// hasNext() --> ���� ��Ұ� �����ִٸ� true�� return, ���ٸ� false�� return
		// next() --> ��Ҹ� return �Ѵ�
		
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
//		System.out.println(iter.next()); ��Ʈ�� ��� ������ �� �������� ����
		
		System.out.println("-----------����for��------------");
		
		for(String fruit : s) {
			System.out.println(fruit);
		}
		
		
	}
}
