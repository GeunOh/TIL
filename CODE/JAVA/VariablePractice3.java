package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	public void vp3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		double hor = Double.parseDouble(sc.nextLine()); 
		System.out.print("���� : ");
		double ver =Double.parseDouble(sc.nextLine()); 
		
		System.out.println("���� : "+(hor*ver));
		System.out.println("�ѷ� : "+((hor+ver)*2));
		
		
	}
}
