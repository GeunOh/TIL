package com.kh.example.chap01_poly.test.controller;

import com.kh.example.chap01_poly.test.model.vo.Child1;
import com.kh.example.chap01_poly.test.model.vo.Child2;
import com.kh.example.chap01_poly.test.model.vo.Parent;

public class PolyController {

	public void method() {
		System.out.println("1. �θ�Ÿ�� ���۷����� �θ� ��ü�� �ٷ�� ���");
		Parent p = new Parent();
		// ���θ�Ÿ�� ���۷���       �� �θ� ��ü
		p.printParent();		// ��� : �� �θ��
		
		System.out.println("2. �ڽ�Ÿ�� ���۷����� �ڽ� ��ü�� �ٷ�� ���");
		Child1 c1 = new Child1();
		// ���ڽ�Ÿ�� ���۷���         �� �ڽ� ��ü
		c1.printChild1();		// ��� : �� ù ��° �ڽ��̾�
		c1.printParent();		// ��� : �� �θ��
		
		System.out.println("3. �θ�Ÿ�� ���۷����� �ڽ� ��ü�� �ٷ�� ���");
		Parent p2 = new Child2();	// ������(��ĳ���� : �θ�Ÿ���� ������ ������ ��� �ڽ� ��ü�� ���� �� �ִ� ��)
		p2.printParent();			// Parent �޼ҵ常 Ȯ�� ������
		((Child2)p2).printChild2(); // (�ٿ�ĳ���� : �θ�Ÿ���� ������ ������ �ڽ��� ����� �����ؾ��� ���, ����ȯ�� ���� Child2 �޼ҵ���� Ȯ�� ������)
		
		System.out.println("4. �ڽ�Ÿ�� ���۷����� �θ� ��ü�� �ٷ�� ���");
//		Child2 c2 = new Parent();	// �θ�� �ڽ��� ���� �� ������ �ڽ��� �θ� ���� �� ����.
		// Type mismatch: cannot convert from Parent to Child2
		// 3���� parent�� ���� ����  child2�� ������ �ڱ��ڽŰ� parent�� �����Ͽ� ������ �ֱ⶧���� �̹� �������ִ°Ϳ��� �޶�� ���̱⶧���� ������ ���� ������
		// �� ���� child2�� ���� ���� parent�� ������ parent �ۿ� ���⶧���� ������ ��
		
		System.out.println();
		System.out.println("=== ���� ���� ===");
		System.out.println();
		
		Parent[] pArr = new Parent[4];
		pArr[0] = new Child1();
		pArr[1] = new Child2();
		pArr[2] = new Child1();
		pArr[3] = new Child2();
		
		for(int i =0; i< pArr.length; i++) {
			if(pArr[i] instanceof Child1) {
				((Child1)pArr[i]).printChild1();
			} else if (pArr[i] instanceof Child2) {
				((Child2)pArr[i]).printChild2();
			}
		}
		
		for(int i =0; i<pArr.length; i++) {
			pArr[i].print();
		}
	}

}
