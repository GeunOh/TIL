package com.kh.variable;

public class A_Variable { // Ŭ����
	
	public void declareVariable	() { // �޼ҵ�
		// ���� ���� �� �ʱ�ȭ
		// A. �������� : �ڷ��� ������;
		// 1. ����
		boolean isTrue;
		// 2. ������
		// 2-1. ����
		char ch;
		// 2-2. ���ڿ�
		String str;
		// 3. ������
		// 3-1. ����
		byte bnum;
		short snum;
		int inum;
		long lnum;
	
		// 3-2. �Ǽ�
		float fnum;
		double dnum;
		
		// B. �ʱ�ȭ(����) : ������ = ��;
		isTrue = true;
		bnum = 1;
		snum = 2;
		inum = 4;
		lnum = 8L;
		
		//fnum = 4.0;
		// Type mismatch: cannot convert from double to float
		// : 4.0�� �Ǽ��ε� �⺻������ �Ǽ��� double�� �⺻���̱� ������
		//   4.0�� float�� �ƴ� double�� ���� ����
		//   �ٵ� fnum�� �ڷ����� float(4byte)�ε� �ְ����ϴ� ���� 8byte�� double���̱� ������
		//   ū ���� ���� ������ ������� �� ���ٸ鼭 ������ ����
		fnum = 4.0f;
		dnum = 8.0;
		
		ch = 'A';
		str = "ABCD";
		
		System.out.println("isTrue�� �� : " + isTrue);
		System.out.println("bnum�� �� : "+bnum);
		System.out.println("snum�� �� : "+snum);
		System.out.println("inum�� �� : "+inum);
		System.out.println("lnum�� �� : "+lnum);
		System.out.println("fnum�� �� : "+fnum);
		System.out.println("dnum�� �� : "+dnum);
		System.out.println("ch�� �� : "+ch);
		System.out.println("str�� �� : "+str);
	}
	
	public void initVariable() {
		// ���� ����� ���ÿ� �ʱ�ȭ
		// 1. ����
		boolean isTrue = false;
		// 2. ������
		char ch = '��';
		String str = "�����ٶ�";
		// 3. ������
		// 3-1. ����
		byte bnum = 1;
		short snum = 2;
		int inum = 4;
		long lnum = 8L;
		// 3-2. �Ǽ�
		float fnum = 4.0f;
		double dnum = 8.0d;
		
		System.out.println("isTrue�� �� : " + isTrue);
		System.out.println("bnum�� �� : " + bnum);
		System.out.println("snum�� �� : " + snum);
		System.out.println("inum�� �� : " + inum);
		System.out.println("lnum�� �� : "+ lnum);
		System.out.println("fnum�� ��: " + fnum);
		System.out.println("dnum�� ��: "+ dnum);
		System.out.println("ch�� �� : " + ch);
		System.out.println("str�� �� : "+ str);
	}
	/*
	public static void main(String[] args) {
		declareVariable();
		// static�� �ִ� �޼ҵ忡�� �ٸ� �޼ҵ带 �ҷ��ö��� �� �ҷ������� �޼ҵ嵵 static �޼ҵ忩�߸��Ѵ�.
		// �� �޼ҵ尡 main�� �ƴϿ��� static�޼ҵ� ���� �ٸ� �޼ҵ带 �ҷ��ö� �� �޼ҵ嵵 static�̿�����
	}
	*/
}
