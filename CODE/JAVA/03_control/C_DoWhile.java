package com.kh.example.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	public void method1() {
		// Ű����� ���ڿ� ���� �Է� �޾� ��� �ݺ� ����
		// ��, exit�� ������ �ݺ� ����
		Scanner sc = new Scanner(System.in);
//		String str = null;
		// Exception in thread "main" java.lang.NullPointerException
		// : null�̸� �ƹ��͵� ���µ� ������ ���ϴ��� �𸥴ٴ°ű� ������ ������ ���°���
		
//		// 1. while
//		String str = "";
//		while(!str.equals("exit")) {
//			System.out.print("���ڿ� �Է� : ");
//			str = sc.nextLine();
//			System.out.print("str : "+str);
//			System.out.println();
//		}
		
		// 2. do while ��
		String str = null;
		// String str = null; �� ������ ������ do ~ while ���� while�� �� �ٸ��� �ϴ� �ѹ��� ����Ǳ� ������
		// str�ȿ� ���� �� ���¼� while�� ���� ������ ������
		do {
			System.out.print("���ڿ� �Է� : ");
			str = sc.nextLine();
			System.out.print("str : "+str);
			System.out.println();
		} while(!str.equals("exit"));		
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		int menuNum =0;
		do {
			System.out.println("1. �׽�Ʈ 1");
			System.out.println("2. �׽�Ʈ 2");
			System.out.println("3. �׽�Ʈ 3");
			System.out.println("9. ����");
			System.out.print("�޴� ���� : ");
			menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1: System.out.println(1); break;
			case 2: System.out.println(2); break;
			case 3: System.out.println(3); break;
			case 9: System.out.println("�����մϴ�."); break;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�."); break;
			}
		} while(menuNum!=9);
		// do while �� do �ȿ��� ���� ����Ǵ°� ������ while menuNum�� ���� ���� �ߴ� ������
		// while menuNum�� do �ۿ� �ִ� �����̱� ������ ������ ��
	}
}
