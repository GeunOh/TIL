package com.kh.variable;

public class B_Constant {
	public void finalConstant() {
		int age; // �Ϲ� ���� ����
		final int AGE; // ��� ����
		
		age = 20;
		AGE = 20;

		System.out.println("age : "+age);
		System.out.println("AGE : "+AGE);

		// ������ �� ����
		age = 30;
//		AGE = 30;
		// The final local variable AGE may already have been assigned
		// : final���� (���)�� �ѹ��� ���� ������ �� �ִµ� �� �ٲٷ��� �ϴϱ� ������ ����.
		
		System.out.println("�� ���� �� age : "+ age);
		System.out.println("�� ���� �� AGE : "+AGE);
	}
}
