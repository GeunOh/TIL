package com.kh.example.chap01.condition;

import java.util.Scanner;

public class C_IfElseIf {
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		String result = null;
		if(num>0) {
			result = "�����";
		} else if(num ==0) {
			result = "0�̴�";
		} else if(num<0) {
			result=  "������";
		}
		
		System.out.println(result);
	}
	
	public void method2() {
		// ���̸� �Է� �޾� 13�� ���ϸ� "���", 13�ʰ� 19�� ���ϸ� "û�ҳ�", 19�� �ʰ� "����" ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		if(age<=13) {
			System.out.println("���");
		} else if(age>19) {
			System.out.println("����");
		} else {
			System.out.println("û�ҳ�");
		}
		
	}
}
