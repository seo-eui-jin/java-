package day721;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapTest {
	public static void main(String[] args) {
		HashMap<String, Integer> scores = new HashMap<String, Integer>();
		System.out.println(scores);
		System.out.println(scores.size());
		
		// 값 추가하기
		// put(key, value)
		scores.put("국어", 80);
		scores.put("영어", 70);
		scores.put("수학", 80); // 순서가 존재하지 않는다
		System.out.println(scores);
		System.out.println(scores.size());
		
		System.out.println(scores.get("수학"));
		
		// 이미 존재하는 key를 사용하면 value가 수정된다
		scores.put("영어", 100);
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
			// getKey() 해당 Entry의 key값을 return
			// getValue() 해당 Entry의 value값을 return
			System.out.println("key : " + entry.getKey() + " value : " + entry.getValue());
			System.out.println();
		}
	}
}
