package com.kh.variable;

public class D_Cast {
	public void rule1() {
		boolean flag = true;
//		boolean flag2 = 100;
		//boolean �ڷ����� ������ true, false�� �� �� ���� (����ȯ ����)
		
		int num = 'A';
		System.out.println("num : "+num);
		
		char ch = 97;
		System.out.println("ch : "+ch);
		
		char ch2 = (char)num;
		System.out.println("ch2 : "+ch2);
		// Type mismatch: cannot convert from int to char
		// : ���ͷ��� ���� �� �׳� �˾Ƽ� �Ǵµ� �̷��� ������ �ְԵǸ� �� ������ �ڷ����� ���� ������ 4����Ʈ�� 2����Ʈ char�� 
		//   �� �� ���⶧���� ���� ����ȯ�� �ʿ��ϴ�
		
		int num2 = -97;
		char ch3 = (char) num2;
		System.out.println("ch3 : "+ ch3);
		// ���⼭ ������� ? �� �ߴ°� ã�� �� ��� ?�� �ߴ°��� ?�� �´� �����ڵ尡 ���缭 ������ ������� �ƴϴ�.	
	}
	
	public void rule2() {
		int iNum = 10;
		long lNum = 100;
		
//		int result = iNum + lNum;
		// Type mismatch: cannot convert from long to int
		// : ������ ū �ڷ������� �ڵ� ����ȯ�� �� �� ����ó���� �Ǳ� ������ iNum + lNum�� ����� long���� �� ����
		//   �� ���¿��� result Ÿ�� int�� �������� �ϱ� ������ ���� ����ȯ�� �ʿ���
		
		// iNum + lNum�� int result�� ������ �� �ִ� ���
		// ��� 1. ���� ����� int�� ���� ����ȯ
		int result = (int) (iNum + lNum);
		
		// ��� 2. long�� lNum�� int�� ���� ����ȯ
		int result2 = iNum +(int)lNum;
		
		// ����. ��� ���� �����ϴ� result�� long������ ����
		long result3 = iNum + lNum;
		
	}
	
	public void rule3() {
		int iNum = 290;
		
		byte bNum = (byte) iNum;
		
		System.out.println("bNum : "+bNum);
		// ��Overflow�� �ƴ� ������ �ս��� �Ͼ�� 290�� �ƴ϶� 34�� ��µȴ�.
		
	}
}
