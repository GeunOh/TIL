package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	public void vp1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		System.out.print("������ �Է��ϼ���(��/��) : ");
		String gender = sc.nextLine();
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("Ű�� �Է��ϼ���(cm) : ");
		double height = Double.parseDouble(sc.nextLine());
		
		System.out.println("Ű "+height+"cm�� "+age+"�� "+gender+"�� "+name+"�� �ݰ����ϴ� ^^");
		
		
	}
}
