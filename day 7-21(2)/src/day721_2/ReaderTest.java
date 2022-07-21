package day721_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest {
	public static void main(String[] args) {
//		0. 파일객체 만들기
		File f = new File("C:\\memo\\task.txt");
		FileReader fr = null;
		BufferedReader br = null;
		
		
		try {
//		1. 파일 데이터가 전송될 수 있게 스트림 열기
			fr = new FileReader(f);
//		1-2. 버퍼 생성하기
			br = new BufferedReader(fr);
			
//		2. 읽기
			// br.readline() : 한 줄의 문자열을 return하며, 더이상 읽을 내용이 없으면 null이 return된다.
			
//			String line = br.readLine();
//			while(line != null) {
//				System.out.println(line);
//				line = br.readLine();	
//			}
			
			String line = "";
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (IOException e) {
				e.printStackTrace();
		} finally {
			
			try { // 영역잡기 단축키 : alt + shift + z
//		3-0. 버퍼 닫기
				if(br != null) br.close();
				
//		3. 스트림 닫기
				if(fr != null) fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
	}
}
