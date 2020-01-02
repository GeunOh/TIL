package com.kh.example.chap03.branch;

public class B_Continue {
	// continue�� �ݺ��� �ȿ����� ��� ����
	// continue�� ������ �Ʒ� ���� �������� �ʰ�
	// �ݺ����� �ٽ� ������
	// for���� ��� ���������� ����, while���� ��� ���ǽ����� ��
	public void method1() {
		// 1~100���� �������� �հ踦 ����ϵ� ��, 4�� ����� ���� ���
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i%4==0) {
				continue;
			}
			
			System.out.print(i + " ");
			sum += i;
		}
		System.out.println();
		System.out.println("sum = "+sum);
	}
	
	public void method2() {
		// ������ ��� : ¦�� ��, ¦�� �� ���� ���
		
		int dan = 2;
		int dan2 = 9;
		
		while(dan<=9) {
			dan2 = 1;
			while(dan2<=9) {
				if(dan%2==0 || dan2%2==0) {
					dan2++;
					continue;
				}
				System.out.println(dan+" * "+dan2+" = "+(dan*dan2));
				dan2++;
			}
			dan++;
			System.out.println();
		}
	}
}
