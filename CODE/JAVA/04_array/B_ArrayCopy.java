package com.kh.example.array;

import java.util.Arrays;

public class B_ArrayCopy {
	// ���� ���� : �迭�� �ּҸ� ����
	// ���� ���� : ������ ���ο� �迭�� �����Ͽ� ���� ���� �� ����
	//		1) for���� �̿��� 1:1 ����
	//		2) System.arraycopy() �̿��� ����
	//		3) Arrays.copyOf() �̿��� ����
	//		4) clone() �̿��� ����
		
	public void method1() {
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = originArr; // ���� ����
		
		for(int i = 0; i< originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		}
		System.out.println();
		for(int i =0; i<copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println();
		
		// ���� �迭�� 0��° �ε����� 99�� ����
		originArr[0] = 99;
		
		for(int i = 0; i< originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		}
		System.out.println();
		for(int i =0; i<copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println();

		//���� �ּҰ� Ȯ��
		System.out.println("originArr�� �ּ� �� : "+originArr);
		System.out.println("copyArr�� �ּ� �� : "+ copyArr);
	}
	
	public void method2() {
		// ���� ���� 1. for�� �̿�
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[10];
		
		for(int i =0; i<originArr.length; i++) {
			copyArr[i] = originArr[i];
		}
		
		System.out.println("===== ���� ���� =====");
		for(int i =0; i<originArr.length; i++) {
			System.out.print(originArr[i] +" ");
		}
		System.out.println();
		for(int i =0; i< copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println();
		
		System.out.println("===== originArr�� 0��° �ε����� 99�� ���� =====");
		originArr[0] = 99;
		
		for(int i = 0; i< originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		}
		System.out.println();
		for(int i =0; i<copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");
		}
	}
	
	public void method3() {
		// ���� ���� 2: arraycopy() �̿�
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[10];
		
//						       �����迭 ���� ��ġ	    ����迭 ���� ��ġ
//		System.arraycopy(src, srcPos, dest, destPos, length);
//						�����迭		   ���� �迭			   ���� ����
		// originArr�迭�� ��� �����͸� copyArr�迭�� ���縦 �ϴµ�
		// copyArr�� 3��°�������� �ٿ��ְ� ����
		System.arraycopy(originArr, 0, copyArr, 2, originArr.length);
		
		for(int i =0; i<copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println();
		for(int i =0; i<copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println();
		
		originArr[0] = 99;
		
		for(int i = 0; i< originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		}
		System.out.println();
		for(int i =0; i<copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");
		}
	}
	
	public void method4() {
		// ���� ���� 3: Arrays.copyOf() �̿�
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[10];
		
		System.out.println("===== ó�� �� =====");
		for(int i=0; i<originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		}
		System.out.println();
		for(int i=0; i<copyArr.length; i++) {
			System.out.print(copyArr[i] +" ");
		}
		System.out.println();
		
		System.out.println("===== copyOf()�� ���� �� =====");
		// Arrays.copyOf(original, newLength)
		//				���� �迭		������ ����
		copyArr = Arrays.copyOf(originArr, originArr.length);
		
		for(int i = 0; i< originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		}
		System.out.println();
		for(int i =0; i<copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println();
	}
}
