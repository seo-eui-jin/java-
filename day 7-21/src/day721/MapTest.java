package day721;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapTest {
	public static void main(String[] args) {
		HashMap<String, Integer> scores = new HashMap<String, Integer>();
		System.out.println(scores);
		System.out.println(scores.size());
		
		// �� �߰��ϱ�
		// put(key, value)
		scores.put("����", 80);
		scores.put("����", 70);
		scores.put("����", 80); // ������ �������� �ʴ´�
		System.out.println(scores);
		System.out.println(scores.size());
		
		System.out.println(scores.get("����"));
		
		// �̹� �����ϴ� key�� ����ϸ� value�� �����ȴ�
		scores.put("����", 100);
		System.out.println(scores);
		
		System.out.println(scores.keySet());
		System.out.println(scores.values());
		
		for (String string : scores.keySet()) {
			System.out.println(string);
		}
		
		System.out.println(scores.values());
		
		for (Integer num : scores.values()) {
			System.out.println(num);
		}
		
		for(Entry<String, Integer> entry : scores.entrySet()) {
			System.out.println(entry);
			// getKey() �ش� Entry�� key���� return
			// getValue() �ش� Entry�� value���� return
			System.out.println("key : " + entry.getKey() + " value : " + entry.getValue());
			System.out.println();
		}
	}
}
