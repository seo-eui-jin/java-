package day721_2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTest {
	public static void main(String[] args) {
		// 파일로 풀력(파일에 쓰기)
//		0. 파일객체 만들기
		// 생성자에는 내가 사용할 파일의 경로를 써준다
		// 처음부터 끝까지 경로를 알려주는 방식 : 절대경로
		// 'test.txt' --> 상대경로 : 내 프로젝트의 위치에 따라서 달라지는 방식
		// .. : 상위 폴더를 의미한다 \\ : 폴더 안을 의미한다
		// Write 할 때 해당 파일이 존재하지 않는다면 파일을 만들어준다
		
		File f = new File("..\\..\\memo\\temp.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;
//			1. 파일 데이터가 전송될 수 있게 스트림 열기
			// 생성자 매개변수로 내가 사용할 파일 객체를 써준다
			try {
			fw = new FileWriter(f, true); // true : 덧붙이기, false or 생략시 덮어쓰기
//			1-2. 버퍼 생성하기
			// 생성자 매개변수로는 내가 열어놓은 스트림 객체를 써준다
			bw = new BufferedWriter(fw);
//			2. 쓰기
			// write() : 파일에 문자열 값을 출력해준다, 줄바꿈은 포함하지 않는다
			bw.write("오늘은\n");
			bw.write("목요일입니다\n");
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
//				3-0. 버퍼 닫기
				if(bw != null) bw.close();		
				
//				3. 스트림 닫기
				if(fw != null) fw.close();
				
			} catch(IOException e) {
				
			}		
			
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}








