package WrapperTest;

import java.util.Scanner;

public class StringTask {
	public static void main(String[] args) {
		// 사용자에게 비밀번호를 입력받아서 암호화하여 출력하라
		// 비밀번호는 한글 제외함
		Scanner sc = new Scanner(System.in);
		System.out.println("비밀번호 입력 : ");
		String pw = sc.nextLine();
		
		String en_pw = "";
		for (int i = 0; i < pw.length(); i++) {
			en_pw += (char)(pw.charAt(i) * 3);
			}
		System.out.println("암호화된 비밀번호 : " + en_pw);
		
		System.out.println("--------------------");
		
		// en_pw에 들어있는 암호화된 비밀번호를 복호화 하여 출력하라
		String de_pw = "";
		for (int i = 0; i < en_pw.length(); i++) {
			de_pw += (char)(en_pw.charAt(i) / 3);
		}
		System.out.println("복호화된 비밀번호 : " + de_pw);
		
		System.out.println("--------------------");
		
		// 사용자에게 휴대전화번호를 입력받아서 010-1234-1234
		// 해당 휴대전화를 01012341234 로 변경하여 출력하라
		System.out.println("전화번호를 입력하세요 : ");
		String phone = sc.nextLine();
		String[] temp = phone.split("-");
		String res = String.join("", temp);
		
//		for (int i = 0; i < temp.length; i++) {
//			res += temp[i];
//		}
		
		System.out.println("정제된 데이터 : " + res);
		
		System.out.println("--------------------");
		
		
		// 사용자에게 나이 이름 핸드폰번호를 입력받아서
		// 나이,이름,핸드폰번호
		// 로 연결된 하나의 문자열을 출력하라
		String[] info = new String[3];
		String[] head = {"나이", "이름", "핸드폰번호"};
		
		for (int i = 0; i < info.length; i++) {
			System.out.println(head[i] + " : ");
			info[i] = sc.nextLine();
		}
		
		String res2 = String.join(",", info);
		System.out.println(res2);
		
//		System.out.println("나이를 입력하세요 : ");
//		info[0] = sc.nextLine();
//		System.out.println("이름을 입력하세요 : ");
//		info[1] = sc.nextLine();
//		System.out.println("핸드폰 번호를 입력하세요 : ");
//		info[2] = sc.nextLine();
		
		System.out.println("--------------------");
		
		// 사용자에게 영어 단어를 입력받아서
		// 두번째 o부터 끝까지 잘라서 출력하라
		// ex) orange delicious --> ous
		String target = sc.nextLine();
		int firstO = target.indexOf("o");
		int secondO = target.indexOf("o", firstO + 1);
		System.out.println("첫번째 o의 위치 : " + firstO);
		System.out.println("두번째 o의 위치 : " + secondO);
		String res3 = target.substring(secondO);
		System.out.println(res3);
		
		System.out.println("--------------------");
		
		// 사용자에게 띄어쓰기로 두 수를 입력받아서 두 수를 더한 결과를 출력하라
		System.out.println("두 수를 띄어쓰기로 입력");
		String[] temp2 = sc.nextLine().split(" ");
		System.out.println("결과 : " + Integer.parseInt(temp2[0]) + Integer.parseInt(temp2[1]));
		
		// 사용자에게 한글로 숫자를 입력바아서
		// 숫자로 변경하여 출력하라
		// ex) 입력 >> 일공이삼
		// 출력 >> 1023
		String input = sc.nextLine();
		
		String hangeul = "공일이삼사오육칠팔구";
		
		String res4 = "";
		for (int i = 0; i < input.length(); i++) {
			// System.out.println("input.charAt("+i+") : " + input.charAt(i));
			res += (hangeul.indexOf(input.charAt(i)));
		}
		System.out.println("바뀐 결과 : " + res4);
		
		
	}
}
