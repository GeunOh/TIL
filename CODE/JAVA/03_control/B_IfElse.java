package com.kh.example.chap01.condition;

import java.util.Scanner;

public class B_IfElse {
	// if-else��
	// if(���ǽ�){
	//		������ ����1;
	// } else {
	//		������ ����2;
	// }
	// �� �� �� ���� �����ϴ� ���ǹ�
	// ���ǽ� ��� ���� ��(true)�̸� if�� �ȿ� �ִ� ������ ����1 ����
	// ���ǽ� ��� ���� ����(false)�̸� if���� �������� else�� �ȿ� �ִ� ������ ����2 ����
	
	public void method1() {
		// Ű����� �Է��� ���ڰ� ¦������ Ȧ������ ���
		
		// '���� �� ���� �Է��ϼ��� : ' �ȳ����� ��� �� num������ ������ ����
		// ¦���̸� "�Է��Ͻ� ���ڴ� ¦���Դϴ�.", Ȧ���̸� "�Է��Ͻ� ���ڴ� Ȧ���Դϴ�" ���
		// ���α׷��� ���� �� "���α׷� ����" ���� ��� �� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("�Է��Ͻ� ���ڴ� ¦���Դϴ�.");
		} else {
			System.out.println("�Է��Ͻ� ���ڴ� Ȧ���Դϴ�.");
		}
		
		System.out.println("���α׷� ����");
		
	}
	
	public void method2() {
		// ����ڿ��� ����, ����, ���� ������ �Է� �޾Ƽ� ���� kor, eng, math ������ ����
		// �� ���� ������ 40�� �̻��̰� �� ���� ��� ������ 60�� �̻��� �� "���� ���",
		// �ϳ��� ���� �̴��� �� "���� �����" ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int kor = sc.nextInt();
		System.out.print("���� : ");
		int eng = sc.nextInt();
		System.out.print("���� : ");
		int math = sc.nextInt();
		
		double avg = (double)(kor+eng+math)/3.0;
		
		if (kor>=40 && eng>=40 && math>=40 && avg >=60) {
			System.out.println("���� ���");			
		} else {
			System.out.println("���� �����");
		}
		
	}
	
	public void method3() {
		// ���ڿ� ���ϱ� : StringŬ���� �ȿ� �ִ� equals() �޼ҵ带 �̿�
		// boolean java.lang.String.equlas(Object object)
		// ����ڿ��� �̸��� �޴µ� ���� ������ �̸��� ������ "�����Դϴ�"
		// ���� ������ "������ �ƴմϴ�" ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		String park = "�ڽſ�";
		String park2 = "�ڽſ�";
		if(park2==park) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("������ �ƴմϴ�.");
		}
		
	}
}
