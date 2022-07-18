package WrapperTest;

public class StringTest {
	public static void main(String[] args) {
		String msg = "�ȳ� �ϼ��� �ݰ� ���ϴ�";
		// length() : �ش繮�ڿ��� ���̸� return
		System.out.println(msg.length());
		
		// charAt(�ε���) : �ش� �ε����� ���ڸ� return
		System.out.println(msg.charAt(0));
		
		// indexOf(���ڿ�) : Ư�� ���ڿ��� �ε����� return
		System.out.println(msg.indexOf("�ݰ�"));
		System.out.println(msg.indexOf("a")); // ���ٸ� -1
		String msg2 = "apple apple";
		System.out.println(msg2.indexOf("p", 2)); // ã�� �����ϴ� ���� ���� ����
		
		// subString() --> ���ڿ� �ڸ��� String[] return��
 		System.out.println(msg2.substring(3));
		String[] res = msg.split(" ");
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
		
		// join(���Ṯ�ڿ�, �����ų�迭)
		System.out.println(String.join("-", res));
	}
}
