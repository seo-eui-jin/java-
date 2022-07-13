package day713_2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask {
	public static void main(String[] args) {
		// 해당 배열을 콘솔창에
		// {10, 20, 30, 40, 50}
		// 으로 출력하기
		int[] ar = {10, 20, 30, 40, 50};
		System.out.print("{");
		for (int i = 0; i < ar.length; i++) {
			if(i == ar.length-1) {
				System.out.print(ar[i]);
			}else{
			System.out.print(ar[i] + ", ");
			}
			}
			System.out.println("}");
		
		// 해당 배열에서 짝수 인덱스 번호에 해당하는 값들을 모두 100으로 변경하여
		// {100, 20, 100, 40, 100}
		// 출력하기
		for (int i = 0; i < ar.length; i++) {
			if(i%2==0) {
				ar[i] = 100;
			}
		}
		System.out.print("{");
		for (int i = 0; i < ar.length; i++) {
			if(i == ar.length - 1) {
				System.out.print(ar[i]);
				break;
			}
			System.out.print(ar[i] + ", ");
		}
		System.out.println("}");
	
		
		
		// 사용자가 입력한 정수 5개를 배열에 넣어준 후 출력하기
		// 정수 입력 : 10
		// 정수 입력 : 36
		// 정수 입력 : 98
		// 정수 입력 : 5
		// 정수 입력 : 17
		// {10, 36, 98, 5, 17}
		// 출력하기
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int [5];
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("정수 입력 : ");
			numbers[i] = sc.nextInt();
		}
		System.out.print("{");
		for (int i = 0; i < numbers.length; i++) {
			if(i == numbers.length - 1) {
				System.out.print(numbers[i]);
				break;
			}
			System.out.print(numbers[i] + ", ");
		}
		System.out.println("}");
		
		
		// 사용자가 입력한 배열에서 최댓값을 출력하기
		// 최댓값 : 98
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if(max < numbers[i]) {
				max = numbers[i];
			}
		}
		System.out.println("최댓값 : " + max);
		
		// 사용자가 입력한 배열에서 최솟값 출력하기
		// 최솟값 : 5
		int min = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if(min > numbers[i]) {
				min = numbers[i];
			}
		}
		System.out.println("최댓값 : " + min);
		
		
		// 사용자에게 국어, 수학, 영어 점수를 입력 받아서
		// 평균 출력하기 (단, 배열을 사용해서)
		int[] grades = new int [3];
		String[] subjects = {"국어", "수학", "영어"};
		
		for (int i = 0; i < grades.length; i++) {
			System.out.print(subjects[i] + "점수 : ");
			grades[i] = sc.nextInt();
		}
		
		int total = 0;
		for (int i = 0; i < grades.length; i++) {
			total += grades[i];
		}
		System.out.println("평균 : " + (double)total / subjects.length);
			
		}
	}

