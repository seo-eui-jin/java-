package day714;

public class ForEachTest {
	public static void main(String[] args) {
		String[] fruits = {"���", "����", "������", "����"};
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		// ���� �����ϰų� ������ ��, �ε�����ȣ�� �ʿ��� �� �Ϲ� for���� ����ϸ� ���ϴ�.
		fruits[0] = "�ٳ���";
		
		System.out.println("-----------------------");
		// fruits��� �迭 ���� ��Ҹ� name�̶�� ������ �޾ƿ´�
		for(String name : fruits) {
			System.out.println(name);
		}
		
		int[] nums = {10, 20, 30};
		for(int num : nums) {
			System.out.println(num);
		}
	}
}
