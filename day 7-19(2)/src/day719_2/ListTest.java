package day719_2;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		// <> �ȿ��� ����Ʈ �ȿ� ������ ����� Ŭ���� Ÿ���� ����� �Ѵ�
		// �ڿ� �ִ� <>�ȿ��� ������ �����ϴ�
		ArrayList<Integer> ar = new ArrayList<Integer>();
		System.out.println(ar);
		// ar�̶�� ArrayList�� ���� �߰��ϱ�
		// add(��) --> ���� ����Ʈ�� ��ҷ� �߰����ش�
		
		ar.add(10);
		ar.add(35);
		ar.add(15);
		ar.add(10); // ������ �����ϰ�, �ߺ� ���� ���� �� �ִ�.
		System.out.println(ar);
		
		// size() : ArrayList ���� ��� ������ return
		System.out.println("ar.size() : " + ar.size());
		
		// get(�ε���) : ArrayList�ȿ� �ش� �ε��� ��Ҹ� return
		for (int i = 0; i < ar.size(); i++) {
		System.out.println(ar.get(i));
		}
//		System.out.println(ar.get(0));
//		System.out.println(ar.get(1));
//		System.out.println(ar.get(2));
//		System.out.println(ar.get(3));
//		System.out.println(ar.get(4)); �ε�����ȣ ����� ���� �߻�
		
		// ���� �߰��� �����ϱ�
		// 1��° �ε����� 100 �����ϱ�
		ar.add(1, 100);
		System.out.println(ar);
		
		// remove(�ε���) : �ش� �ε����� ��Ҹ� �����Ѵ�
		ar.remove(1);
		System.out.println(ar);
		
		// isEmpty()
		System.out.println(ar.isEmpty());
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("�ȳ�");
		names.add("�ݰ���");
		names.add("������");
		names.add("�Ǻ���");
		System.out.println(names);
		
		for(String n : names) {
			System.out.println(n);
		}

		// ����Ʈ�� ���� �ִٴ� �������� ���̱� ���� �̷��� ǥ�� �ϱ⵵ �Ѵ�
		List <Double> ar2 = new ArrayList<Double>();
		
		
		// ���׸��� �����ϸ� �⺻������ Object Ÿ���� ����
//		ArrayList temp = new ArrayList();
//		temp.add(10);
//		temp.add("�ȳ�");
//		temp.add(3.1);
//		System.out.println(temp);
		
		
		
		
	}
}
