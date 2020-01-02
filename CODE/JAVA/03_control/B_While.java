package com.kh.example.chap02.loop;

import java.util.Scanner;

public class B_While {
	/*
	 	while(���ǽ�){
	 		���� ����;
	 		[������ or �б⹮];
	 	}
	 	���ǽ� Ȯ�� -> (���ǽ��� true�� ��) ���� ���� ���� -> ���ǽ� Ȯ�� -> (�ݺ�)
	 	���ǽ� ����� false�� �� ������ �ݺ�
	 */
	public void method1() {
		// 1���� 5���� ���
		int i = 1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
	}
	
	public void method2() {
		// 5���� 1���� ���
		int i = 0;
		while(i<5) {
			System.out.println(5-i);
			i++;
		}
	}
	
	public void method3() {
		// 1���� 10 ������ Ȧ���� ���
		int i =1;
		while(i<11) {
			if(i%2==1) {
				System.out.println(i);
			}
			i++;
		}
	}
	
	public void method4() {
		// ���� �� ���� �Է� �޾� �� ���� ���� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �� ���� �Է��ϼ���");
		System.out.print("\n��, ù ��° ���ڰ� �� ��° ���ں��� �۰� �Է��ϼ���\n");
		System.out.print("ù ��° ���� : ");
		int first = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int second = sc.nextInt();
		
		while(first<=second) {
			System.out.println(first);
			first++;
		}
		
	}
	
	public void method4_1() {
		// ������ �ϳ� �Է� �޾� �� ���� 1~9 ������ �� �϶��� �� ���� ������ ���
		// ������ ���� ������ 1~9������ ����� �Է��Ͽ����մϴ� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �� ���� �Է��ϼ��� : ");
		int num = sc.nextInt();
		int dan = 1;
		
		if(num>=1 && num<=9) {
			while(dan<=9) {
				System.out.println(num+" * "+dan+" = "+ (num*dan));
				dan++;
			}
		} else {
			System.out.println("1~9������ ����� �Է��Ͽ����մϴ�.");
		}
	}
	
	public void method5() {
		// 1���� 10 ������ ������ ������ ���� 1 ���� ���������� ���� �հ� ���
		int random = (int)(Math.random() * 10 + 1);
		int i =1;
		int sum = 0;
		System.out.println(random);
		while(i<=random) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
		
	}
	
	public void method6() {
		// ����ڿ��� ���ڿ��� �Է� �޾� �ε��� ���� ���� ���
		// ���ڿ� �Է� : apple
		// 0 : a
		// 1 : p
		// 2 : p
		// 3 : l
		// 4 : e
		Scanner sc =new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String str = sc.nextLine();
		int i = 0;
		while(i<str.length()) {
			System.out.println(i+" : "+str.charAt(i));
			i++;
		}
		
		for(int j =0; j<str.length(); j++) {
			System.out.println(j + " : " + str.charAt(j));
			
		}
	}
	
	public void method7() {
		// 2�ܺ��� 9�ܱ��� ���
		int num = 2;
		
		while(num<=9) {
			int dan=1;
			while(dan<=9) {
				System.out.println(num + " * " +dan+" = " +(num*dan));
				dan++;
			}
			num++;
			System.out.println("-------------");
		}
		
	}
	
	public void method8() {
		// �Ƴ��α� �ð�
		int hour = 0;
		int min = 0;
		
		while(hour < 24) {
			min = 0;
			while(min<60) {
				System.out.printf("%2d�� %02d�� \n",hour,min);
				min++;
			}
			hour++;
		}
	}
	
	public void method9() {
		Scanner sc = new Scanner(System.in);
		
		int menu = 0;
		
		while(menu!=9) {
			System.out.println("1. 1~5���� ���");
			System.out.println("2. 5~1���� ���");
			System.out.println("3. 1~10���� Ȧ�� ���");
			System.out.println("9. ����");
			System.out.print("�޴� ���� : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: method1(); break;
			case 2: method2(); break;
			case 3: method3(); break;
			case 9: System.out.println("�����մϴ�."); break;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
		
	}
}
