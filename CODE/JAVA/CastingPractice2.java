package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	public void cp2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		double korea = Double.parseDouble(sc.nextLine());
		
		System.out.print("���� : ");
		double english = Double.parseDouble(sc.nextLine());
		
		System.out.print("���� : ");
		double math = Double.parseDouble(sc.nextLine());
		
		System.out.println("���� : "+(int)(korea+english+math));
		System.out.println("��� : "+(int)((korea+english+math)/3));
		
		
	}
}
