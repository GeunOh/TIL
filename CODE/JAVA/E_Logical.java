package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	// && : �ǿ����ڰ� ��� true�϶� true ��ȯ(�׸���, ~�鼭)
	// || : �ǿ����� �߿��� �ϳ��� true�� �� true ��ȯ(�Ǵ�, ~�ų�)
	public void method1() {
		// �Է��� ���� ���� 1~100 ������ �������� Ȯ��
		// ���� �ϳ� �Է� : 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� :");
		int num = sc.nextInt();
		
		System.out.println("���� 1 ~ 100 ������ ���Դϱ� ? : " + (num>=1 && num<=100));
		
		
	}
	
	public void method2() {
		// �Է��� ���� ���� �빮������ Ȯ��
		// ���� �ϳ� �Է� :
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.println("�Է��� ���ڰ� �빮���Դϱ� ? : " + (ch>='A' && ch<='Z'));
		
		// ��� �Ͻ÷��� y Ȥ�� Y�� �Է��ϼ��� :
		// ��� �ϰڴٰ� �ϼ̽��ϱ�? : ______(�����)
		System.out.print("��� �Ͻ÷��� y Ȥ�� Y�� �Է��ϼ��� ");
		char ch2 = sc.nextLine().charAt(0);

		System.out.println("��� �ϰڴٰ� �ϼ̽��ϱ�? : "+ (ch2=='y' || ch2=='Y'));
		
		
	}
}
