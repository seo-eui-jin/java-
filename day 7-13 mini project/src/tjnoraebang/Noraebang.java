package tjnoraebang;

import java.util.Random;
import java.util.Scanner;

public class Noraebang {
	public static void main(String[] args) {
//		코인 노래방
//		1. 금액 입력하기
//			한곡 당 : 300원
//			노래 곡수
//			잔돈이 있다면 잔돈출력 (없다면 잔돈 출력 안 함)
//		
//		2. 노래 부르기
//			랜덤으로 노래 점수 출력
//			100점 노래 한 곡 서비스
//			50점 미만 노래 한 곡 차감
//		
//		3. 음료 선택하기
//			노래 세곡에 음료수 한잔
//		
//		4. 내 노래실력 파악하기
//			전체부른 노래의 평균 점수 알려주기
//		
//		5. 나가기
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int choice = 0;
		int songCnt = 0;
		int totalScore = 0; // 점수 총합을 저장할 변수
		int totalSong = 0; // 부른 총 노래 곡수를 저장할 변수
		
	
		String introMsg = "------안녕하세요 노래방입니다------";
		String mainMenu = "1.금액 입력하기\n"
						+ "2.노래 부르기\n"
						+ "3.음료 선택하기\n" 
						+ "4.내 노래 실력보기\n" 
						+ "5.나가기\n";
		
		System.out.println(introMsg);
		
		while(true) {
			System.out.println(mainMenu);
			choice = sc.nextInt();
			if(choice == 5) { // 나가기
				System.out.println("다음에 또 오세요");
				break;
			}else if(choice == 1) { // 금액 입력하기
				// 사용자에게 금액을 입력받아서
				// 부를 수 있는 노래 곡 수와 잔돈 출력하기
				System.out.println("금액을 입력하세요 : ");
				int money = sc.nextInt();
				// money에 300 미만이 들어있다면 잘 못 입력했습니다. 출력 후 메인 메뉴로 이동하기
				if(money < 300) {
					System.out.println("잘 못 입력하셨습니다.\n");
					continue;
				}
				songCnt = songCnt + money / 300;
				int rest = money % 300;
				
				System.out.println("부를 수 있는 노래 곡 수는 : " + songCnt );
				if(rest != 0) {
					System.out.println("잔 돈은 : " + rest + "원 입니다.");
				}
				
			}else if(choice == 2) { // 노래 부르기
				if(songCnt < 1) {
					System.out.println("금액을 먼저 출력해주세요\n");
					continue;
				}
				songCnt--;
				int score = r.nextInt(100)+1;
				totalScore += score;
				totalSong++;
				
				System.out.println("당신의 점수는 " + score + "점 입니다.");
				if(score == 100) {
					songCnt++;
					System.out.println("100점이라 한 곡 서비스 입니다.");
				} else if(score >= 80) {
					System.out.println("훌륭합니다.");
				} else if(score >= 50) {
					System.out.println("다음엔 더 좋은 결과가 있을 거에요");
				} else {
					if(songCnt >= 1) {
						songCnt--;
				}
					System.out.println("50점 미만이라 노래 한 곡을 차감합니다.");
				}
					System.out.println("부를 수 있는 노래 : " + songCnt + "곡 입니다.");
			}else if(choice == 3) { // 음료 선택하기
				System.out.println("1. 생수(3곡) 2. 포카리(5곡) 3. 구매취소");
				choice = sc.nextInt();
				switch(choice) {
				case 1:
					if(songCnt < 3) {
						System.out.println("노래 곡 수가 부족합니다.");
						continue;
					}
					songCnt -= 3;
					System.out.println("생수 1병을 드렸습니다.");
					System.out.println("부를 수 있는 노래 : " + songCnt + "곡 입니다.");
					break;
				case 2:
					if(songCnt >= 5) {
						songCnt -= 5;
						System.out.println("포카리 1병을 드렸습니다.");
						System.out.println("부를 수 있는 노래 : " + songCnt + "곡 입니다.");
					}else {
						System.out.println("노래 곡 수가 부족합니다.");
					}
					break;
				case 3:
					System.out.println("메인메뉴로 이동합니다.");
					break;
				}
				
			}else if(choice == 4) { // 내 노래 실력보기
				// 지금까지 부른 노래 점수 총합 / 지금까지 부른 노래 갯수
				// 소수점 아래 두 자리까지 출력하기
				if(totalSong == 0) {
					System.out.println("노래를 먼저 불러주세요~\n");
					continue;
				}
				double avg = (double)(totalScore / totalSong);
				System.out.printf("지금까지 부른 노래 평균 점수는 %.2f점입니다\n", avg);
				
			}else { // 잘 못 입력시 오는 영역
				System.out.println("잘 못 입력하셨습니다.");
			} // if문 닫는 중괄호
			System.out.println();
		} // while문 닫는 중괄호		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

