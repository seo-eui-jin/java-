package day719_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 구현페이지
		Scanner sc = new Scanner(System.in);

		ArrayList<User> users = new ArrayList<User>();
		
		boolean isDup = false;
		String id = null;

		while (true) {
			System.out.println("1.회원가입\n2.로그인\n3.회원정보\n4.나가기");
			System.out.println("입력 : ");
			int choice = Integer.parseInt(sc.nextLine());

			if (choice == 4) {
				break;
			} else if (choice == 1) {
				isDup = false;
				System.out.println("id : ");
				id = sc.nextLine();
				// id가 만약 중복 되었다면 회원가입 실패
				// id 중복여부 검사
				for (int i = 0; i < users.size(); i++) {
					// users.get(i).id.equals(id)
					if (users.get(i).getId().equals(id)) {
						// 중복된 아이디가 존재할 때 오는 영역
						isDup = true;
						break;

					}
				}

				if (!isDup) {
					User u = new User();
					u.setId(id); // u.id = id;
					System.out.println("pw : ");
					u.setPw(sc.nextLine()); // u.pw = sc.nextLine();
					System.out.println("이름 : ");
					u.setName(sc.nextLine()); // u.name = sc.nextLine();
					System.out.println("나이 : ");
					u.setAge(Integer.parseInt(sc.nextLine())); // u.age = Integer.parseInt(sc.nextLine());
					users.add(u);
				} else {
					System.out.println("중복된 아이디가 존재합니다");
				}
			} else if (choice == 2) {
				// 1.아이디를 입력받는다
				// 비밀번호를 입력받는다
				isDup = false;
				System.out.println("아이디 : ");
				id = sc.nextLine();
				System.out.println("비밀번호 : ");
				String pw = sc.nextLine();

				// 2.해당 아이디가 users에서 동일한 id가 있는지 검사한다
				// 3.만일 동일한 id를 찾았다면
				// 해당 비밀번호가 일치하는지 확인한다
				// 비밀번호가 일치한다면 로그인 성공! 000님 환영합니다
				for (User u : users) {
					if (u.getId().equals(id) && u.getPw().equals(pw)) {
						isDup = true;
						System.out.println("로그인 성공");
						System.out.println(u.getName() + "님 환영합니다");
						break;

					} 	
				}
				// 비밀번호가 일치하지 않는다면 로그인 실패
				if(isDup == false) { // isDup이 false라면 로그인이 실패했다는 의미
					System.out.println("로그인 실패");
					
				}
				// 4. 동일한 id가 users에 존재하지 않는다면 로그인 실패
				// 빠른 for문

			} else if (choice == 3) {
				isDup = false;
				// 1.아이디를 입력받는다
				System.out.println("검색할 id : ");
				id = sc.nextLine();
				// 2. 해당아이디가 users에서 동일한 id가 있다면
				for (int i = 0; i < users.size(); i++) {
					if(users.get(i).getId().equals(id)) {
						isDup = true;
						users.get(i).show();
						break;
					}
				}
				// 해당 회원의 정보를 보여준다
				// 동일한 id가 없다면
				// 검색실패!, 해당 아이디가 존재하지 않습니다
				// 빠른for문, 일반 for문
				if(isDup == false) {
					System.out.println("검색 실패");
				}
			} else {
				System.out.println("잘못 입력 했습니다");
			}
		}

	}
}
