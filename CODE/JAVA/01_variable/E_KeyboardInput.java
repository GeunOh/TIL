package com.kh.variable;

import java.util.Scanner;

public class E_KeyboardInput {
	public void inputScanner() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : "); // �ȳ� ���� ����

		String name = sc.nextLine();
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		System.out.print("Ű(�Ҽ��� ù° �ڸ����� �Է�) : ");
		double height = sc.nextDouble();
		
		System.out.println(name + "���� " + age +"���̸�, Ű�� " +height+ "cm �Դϴ�.");
		
	}
	
	public void inputScanner2() {
		// ����ڿ��� �̸��� ���̸� �Է� ��������
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		System.out.print("���̸� �Է��ϼ��� : ");
//		int age = sc.nextInt();
//		sc.nextLine();
//		String address = sc.nextLine();
		
		// �ذ��ϴ� ���
		// ���1. �ٹٲ��� ������ �� �ִ� nextLine() �߰�
//		int age = sc.nextInt();
//		sc.nextLine(); // ���ۿ� �����ִ� �ٹٲ��� �������ִ� ����
//		System.out.print("�ּҸ� �Է��ϼ��� : ");
//		String address = sc.nextLine();
		
		// ���2. age�� ���� ���� nextLine()�� ���� int�� �Ľ��ϱ�
		// �Ľ� : ���ڿ��� �⺻�ڷ������� �ٲ��ִ� ��
		int age = Integer.parseInt(sc.nextLine());
//		String userAge = sc.nextLine();
//		int age = Integer.parseInt(userAge);
		System.out.print("�ּҸ� �Է��ϼ��� : ");
		String address = sc.nextLine();

		// ���3. next()�� �ּҸ� �ޱ�
		// �Ѱ� : next()�� ���⸦ �����ڷ� �ν��ϱ� ������ ó���� �� �͸� �����´�.
//		int age = sc.nextInt();
//		System.out.print("�ּҸ� �Է��ϼ��� : ");
//		String address = sc.next();
		
		// + �߰� : char���� �ް� ���� ����?
		System.out.print("������ �Է��ϼ��� : "); // F / M
//		String userGender = sc.nextLine();
//		char gender = userGender.charAt(0);
		char gender = sc.nextLine().charAt(0);
		
		
		System.out.println("�̸��� " +name+" ���̴� " +age+" �ּҴ� "+ address +" ������ " +gender +" �Դϴ�.");
	}
}
