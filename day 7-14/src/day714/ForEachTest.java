package day714;

public class ForEachTest {
	public static void main(String[] args) {
		String[] fruits = {"사과", "딸기", "오렌지", "포도"};
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		// 값을 대입하거나 수정할 떄, 인덱스번호가 필요할 때 일반 for문을 사용하면 편리하다.
		fruits[0] = "바나나";
		
		System.out.println("-----------------------");
		// fruits라는 배열 속의 요소를 name이라는 변수가 받아온다
		for(String name : fruits) {
			System.out.println(name);
		}
		
		int[] nums = {10, 20, 30};
		for(int num : nums) {
			System.out.println(num);
		}
	}
}
