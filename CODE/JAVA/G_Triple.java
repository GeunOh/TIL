package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	// ���� ������
	// (���ǽ�) ? ��1 : ��2
	// ���ǽ��� true�� �� ��1 ����, false�� �� ��2 ����
	
	public void method1() {
		// �Է��� ������ ������� �ƴ��� �Ǻ�
		// '���� �ϳ� �Է� : ' �̶�� �ȳ��� ��� �� �Է��� ������ num�� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		
//		String result = num > 0 ? "�����" : "����� �ƴϴ�";
		// ��ø ���� ������
		String result = num > 0 ? "�����" : (num==0 ? "0�̴�" : "������");
		
		System.out.println(num+" ���ڴ� "+ result );
	}
	
	public void method2() {
		// �Է��� ������ ¦������ Ȧ������ �Ǻ�
		// Ȧ���� "Ȧ���Դϴ�", ¦���� "¦���Դϴ�" ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();

		String result = num<0 ? "�����Դϴ�" : num%2==1 ? "Ȧ���Դϴ�" : (num==0 ? "0�Դϴ�" : "¦���Դϴ�");
		System.out.println("�Է��� ������ : "+ result);
	}
}
