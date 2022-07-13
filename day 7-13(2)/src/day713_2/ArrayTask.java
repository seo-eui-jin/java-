package day713_2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask {
	public static void main(String[] args) {
		// �ش� �迭�� �ܼ�â��
		// {10, 20, 30, 40, 50}
		// ���� ����ϱ�
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
		
		// �ش� �迭���� ¦�� �ε��� ��ȣ�� �ش��ϴ� ������ ��� 100���� �����Ͽ�
		// {100, 20, 100, 40, 100}
		// ����ϱ�
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
	
		
		
		// ����ڰ� �Է��� ���� 5���� �迭�� �־��� �� ����ϱ�
		// ���� �Է� : 10
		// ���� �Է� : 36
		// ���� �Է� : 98
		// ���� �Է� : 5
		// ���� �Է� : 17
		// {10, 36, 98, 5, 17}
		// ����ϱ�
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int [5];
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("���� �Է� : ");
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
		
		
		// ����ڰ� �Է��� �迭���� �ִ��� ����ϱ�
		// �ִ� : 98
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if(max < numbers[i]) {
				max = numbers[i];
			}
		}
		System.out.println("�ִ� : " + max);
		
		// ����ڰ� �Է��� �迭���� �ּڰ� ����ϱ�
		// �ּڰ� : 5
		int min = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if(min > numbers[i]) {
				min = numbers[i];
			}
		}
		System.out.println("�ִ� : " + min);
		
		
		// ����ڿ��� ����, ����, ���� ������ �Է� �޾Ƽ�
		// ��� ����ϱ� (��, �迭�� ����ؼ�)
		int[] grades = new int [3];
		String[] subjects = {"����", "����", "����"};
		
		for (int i = 0; i < grades.length; i++) {
			System.out.print(subjects[i] + "���� : ");
			grades[i] = sc.nextInt();
		}
		
		int total = 0;
		for (int i = 0; i < grades.length; i++) {
			total += grades[i];
		}
		System.out.println("��� : " + (double)total / subjects.length);
			
		}
	}

