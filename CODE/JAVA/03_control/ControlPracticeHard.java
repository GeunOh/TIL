package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPracticeHard {
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("��й�ȣ �Է�(1000~9999) : ");
		String str = sc.nextLine();
		int num = Integer.parseInt(str);
		int flag =10;

		if(str.length()!=4) {
			System.out.println("�ڸ��� �ȸ���");
		}
		else {
			for(int i =0; i<str.length(); i++) {
				if(flag==1) {
					break;
				}
				for(int j=0; j<str.length(); j++) {
					if(i!=j) {
						if(str.charAt(i)==str.charAt(j)){
							flag=1;
							break;
						}
						else {
							flag=0;
						}
					} 
				}
			}
			if(flag==0) {
				System.out.println("����");
			}
			else {
				System.out.println("�ߺ� �� ����");
			}
		}
		

	}
}
