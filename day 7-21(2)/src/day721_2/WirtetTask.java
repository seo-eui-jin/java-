package day721_2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WirtetTask {
	public static void main(String[] args) {
		// memo 폴더 안에 task.txt 파일에다가
		// 0번째줄입니다
		// 1번째줄입니다
		// ..
		// 8번째줄입니다
		// 9번째줄입니다
		// 출력하기
		int num = 0;

//		0. 파일객체 만들기
		File f = new File("C:\\memo\\task.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;
//		1. 파일 데이터가 전송될 수 있게 스트림 열기
		try {
			fw = new FileWriter(f);

//		1-2. 버퍼 생성하기
			bw = new BufferedWriter(fw);

//		2. 읽거나 쓰기
			for (int i = 0; i < 10; i++) {
				bw.write(num + "번 째 줄입니다.\n");
				
			}
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {

//			3-0. 버퍼 닫기
				if (bw != null) bw.close();

//			3. 스트림 닫기
				if (fw != null) fw.close();

			} catch (IOException e) {

			}
		}

	}
}
