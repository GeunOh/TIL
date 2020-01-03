package com.kh.example.array;

import java.util.Scanner;

public class A_Array {
	// �迭 : ���� �ڷ����� ������ �ϳ��� �������� �ٷ�� ��
	
	// �迭 ����
	// 		�ڷ���[] �迭��;
	//		�ڷ��� �迭��[];
	// �迭 �Ҵ�
	//		�ڷ���[] �迭�� = new �ڷ���[�迭ũ��];
	//		�ڷ��� �迭��[] = new �ڷ���[�迭ũ��];
	//		new�����ڸ� ���� Heap������ �迭ũ�⸸ŭ ���� ����
	//		������ �����Ǵ� ���� �� ������ ���� �ּҰ��� ����
	//		�� �ּ� ���� Stack�� �ִ� �迭�� ������ ����(�����ϰ� ����)
	
	// �迭 �ʱ�ȭ
	//		1) �ε��� �̿�
	//			�迭��[�ε�����ȣ] = ��;
	//		2) for�� �̿� : ��Ģ�� ���� ���� ��� ����
	//			for(int i = 0; i < �迭��.length; i++){
	//				�迭��[i] = ��;
	//			}
	//		3) ����� ���ÿ� �ʱ�ȭ
	//			�ڷ���[] �迭�� = {��};
	//			�ڷ���[] �迭�� = new �ڷ���[]{��};

	public void method1() {
		int[] arr = new int[9];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 60;
		arr[6] = 70;
		arr[7] = 80;
		arr[8] = 90;
//		arr[9] = 100;	// java.lang.ArrayIndexOutOfBoundsException: 9
		
		for(int i =0; i< arr.length; i++) {
			arr[i] = (i+1) * 10;
		}
		
		int sum = 0;
		for(int i =0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		for(int i =0; i<arr.length; i++) {
			System.out.println("arr["+i+"] : "+arr[i]);
		}
		System.out.println("sum : "+sum);
		
	}
	
	public void method2() {
		// �迭�� �� �� ������ �迭�� ũ�⸦ ������ �� ����
		double[] dArr = new double[10];
		System.out.println("dArr�� �ּ� : "+dArr);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �迭 ũ�� : ");
		int size = sc.nextInt();
		
		dArr = new double[size];
		System.out.println("dArr�� �ּ� : "+dArr);
		dArr = null;
		System.out.println("dArr�� �ּ� : "+dArr);
	}
	
	public void method3() {
		// �迭 �ʱ�ȭ
		// 1. �ε��� �̿�
		// iArr�̶�� int�� 5��¥�� �迭 ����
		int[] iArr = new int[5];
		iArr[0] = 1;
		iArr[1] = 2;
		iArr[2] = 3;
		iArr[3] = 4;
		iArr[4] = 5;
		
		// 2. for�� �ʱ�ȭ
		for(int i = 0; i<iArr.length; i++) {
			iArr[i]= i +1;
		}
		// 3. ����� ���ÿ� �ʱ�ȭ
		int[] iArr2 = {1,2,3,4,5};
		int[] iArr3 = new int[] {1,2,3,4,5};
	}
	
}
