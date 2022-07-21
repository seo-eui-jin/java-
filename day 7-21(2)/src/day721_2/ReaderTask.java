package day721_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReaderTask {
	public static void main(String[] args) {
		// memo 폴더 안의 task.txt 파일에서
		// 사용자가 원하는 줄까지 콘솔창에 출력하기
		// 사용자에게 콘솔창으로 정수를 입력 받는다
		// 정수 입력 : 5 
		// 콘솔창에 5번줄까지 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();
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
			for (int i = 0; i < num; i++) {
				System.out.println(br.readLine());
			}
			
		} catch (IOException e) {
				e.printStackTrace();
		} finally {
			
			try { 
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
		

