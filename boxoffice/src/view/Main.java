package view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import movieDAO.MovieDAO;
import movieDTO.MovieDTO;

public class Main {
	public static void main(String[] args) throws IOException {
		// View를 만드는 공간(콘솔창)
		Scanner sc = new Scanner(System.in);
		MovieDAO dao = new MovieDAO();
		
		
		while(true) {
			System.out.println("1.영화추가하기");
			System.out.println("2.영화수정하기");
			System.out.println("3.영화검색하기");
			System.out.println("4.영화삭제하기");
			System.out.println("5.모든영화정보보기");
			System.out.println("6.나가기");
			int choice = Integer.parseInt(sc.nextLine());
			
			
			
			if(choice == 6) {
				break;
			}else if(choice == 1) {
				// 영화 추가하기
				System.out.println("영화제목 : ");
				String title = sc.nextLine();
				System.out.println("개봉일 : ");
				String date = sc.nextLine();
				System.out.println("수익 : ");
				String revenue = sc.nextLine();
				System.out.println("관객수 : ");
				String view = sc.nextLine();
				System.out.println("스크린수 : ");
				String screen = sc.nextLine();
				
				dao.add(title, date, revenue, view, screen);
				System.out.println("추가 성공");
			}else if(choice == 2) {
				// 랭킹을 입력 받아서, 해당 랭킹 영화의 제목을 수정한다
				System.out.println("랭킹 입력 : ");
				int rank = Integer.parseInt(sc.nextLine());
				System.out.println("수정할 제목 : ");
				String title = sc.nextLine();
				
				if(dao.upadates(rank, title)) {
					System.out.println("수정 성공");
				}else {
					System.out.println("순위를 잘못 입력함 수정실패");
				}
				
			}else if(choice == 3) {
				System.out.println("검색할 제목 : ");
				String title = sc.nextLine();
				ArrayList<MovieDTO> list = dao.select(title);
				System.out.println("----검색결과----");
				for (MovieDTO movie : list) {
					System.out.println(movie.getRank()+"위---["+ movie.getTiltle()+"]---");
					System.out.println("|개봉일 : " + movie.getDate());
					System.out.println("|수익 : " + movie.getRevenue());
					System.out.println("|관객수 : " + movie.getView());
					System.out.println("|스크린수 : " + movie.getScreen());
				}
				
			}else if(choice == 4) {
				System.out.println("랭킹 입력 : ");
				int rank = Integer.parseInt(sc.nextLine());
				
				if(dao.remove(rank)) {
					System.out.println("삭제 성공");
				}else {
					System.out.println("삭제 실패");
				}
			}else if(choice == 5) {
				// 모든 영화 정보보기
				ArrayList<MovieDTO> list = dao.selectAll();
				System.out.println("----영화정보----");
				
				for (MovieDTO movie : list) {
					System.out.println(movie.getRank()+"위---["+ movie.getTiltle()+"]---");
					System.out.println("|개봉일 : " + movie.getDate());
					System.out.println("|수익 : " + movie.getRevenue());
					System.out.println("|관객수 : " + movie.getView());
					System.out.println("|스크린수 : " + movie.getScreen());
				}
				
			}else {
				System.out.println("잘못 입력하였습니다.");
			}
			
			
			System.out.println();
			
		} // while문 닫는 중괄호
	}
}
