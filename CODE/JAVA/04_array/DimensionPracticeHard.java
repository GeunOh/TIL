package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPracticeHard {
	public void practice10() {
		String[][] arr = new String[6][6];
		
		for(int i=0; i<arr.length; i++) {	// ��� �迭�ε����� " " �� ���� (�ʱ�ȭ)
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] =" ";
			}
		}
		for(int i=1; i<arr.length; i++) {	// �� �� �࿡ �� ����
			arr[0][i] = Integer.toString(i-1);
		}
		for(int i=1; i<arr.length; i++) {	// �� �� ���� �� ����
			arr[i][0] = Integer.toString(i-1);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �ε��� �Է� : ");
		int row = sc.nextInt();
		System.out.print("�� �ε��� �Է� : ");
		int col = sc.nextInt();
		
		arr[row+1][col+1] = "X";
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void practice11() {
		String[][] arr = new String[6][6];
		
		for(int i=0; i<arr.length; i++) {	// ��� �迭�ε����� " " �� ���� (�ʱ�ȭ)
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] =" ";
			}
		}
		for(int i=1; i<arr.length; i++) {	// �� �� �࿡ �� ����
			arr[0][i] = Integer.toString(i-1);
		}
		for(int i=1; i<arr.length; i++) {	// �� �� ���� �� ����
			arr[i][0] = Integer.toString(i-1);
		}
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("�� �ε��� �Է� : ");
			int row = sc.nextInt();
			if(row==99) {
				System.out.println("\n ���α׷� ����");
				break;
			}
			else {
				System.out.print("�� �ε��� �Է� : ");
				int col = sc.nextInt();
				
				arr[row+1][col+1] = "X";
				
				for(int i=0; i<arr.length; i++) {
					for(int j=0; j<arr[i].length; j++) {
						System.out.print(arr[i][j]+" ");
					}
					System.out.println();
				}
			}
		}

	}
}
