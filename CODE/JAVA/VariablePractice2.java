package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	public void vp2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� : ");
		int fNum = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int sNum = sc.nextInt();
		System.out.println("���ϱ� ��� : "+ (fNum+sNum));
		System.out.println("���� ��� : "+ (fNum-sNum));
		System.out.println("���ϱ� ��� : "+ (fNum*sNum));
		System.out.println("������ ��� : "+ (fNum/sNum));
		
	}
}
