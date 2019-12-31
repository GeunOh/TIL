package com.kh.example.chap02.loop;

import java.util.Scanner;

public class A_For {
	/*
	 	for(�ʱ��; ���ǽ�; ������){
	 		���� ����;
	 	}
	 	�ʱ�� -> ���ǽ� -> (���ǽ��� true�� ��)���� ���� -> ������ -> ���ǽ� -> (�ݺ�)
	 	���ǽ� ����� false�� �ɶ����� �ݺ�
	 	
	 	for�� �ȿ� �ִ� �ʱ��, ���ǽ�, ������ ��� ���� ����
	 	������, ��� �������� �� �ݺ����� �������� ���� �빮��
	 	for�� ���̳� �ۿ��ٰ� �ʱ���� �������� ������ �������� ������ �󸶳� �ɰ����� ��� ǥ�� �ؾ� ��
	 	��, for() �ȿ����� ������ �� ��� �ʿ��� �����
	 */
	public void method1() {
		// 1���� 5���� ���
		for(int i = 1; i<=5; i++) {
			System.out.println(i+"��° �ݺ��� ����");
		}
		
	}
	
	public void method2() {
		// 5���� 1���� ����ϱ�
		for(int i = 5; i>=1; i--) {
			System.out.println(i+"��° �ݺ��� ����");
		}
		
	}
	
	public void method2_1() {
		for(int i =8; i>=3; i--) {
			System.out.println(i);
		}
	}
	
	public void method3() {
		// 1���� 10 ������ Ȧ���� ���
		for(int i =1; i<11; i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
		
		/*
		 	���մ��� ������ �̿�
		 	for(int i = 1; i<=10; i+=2){
		 		System.out.println(i);
		 	}
		 */
	}
	
	public void method4() {
		// ���� �ΰ��� �Է� �޾� �� ���� ���� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �� ���� �Է��ϼ���.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i=a; i<=b; i++) {
			System.out.print(i+" ");
		}

	}
	
	public void method4_1() {
		// ���� �ϳ��� �Է� �޾� �� ���� 1~9������ ���϶��� �� ���� ������ ���
		// ������ ���� ������ "1~9������ ����� �Է��Ͽ����մϴ�" ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ��� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num>=1 && num<=9) {
			for(int i=1; i<=9; i++) {
				System.out.println(num +" * "+i +" = "+(num*i));
			
			}
		} else {
			System.out.println("1~9������ ����� �Է��Ͽ����մϴ�.");
		}
		/*
			switch(num) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
				for(int i=1; i<=9; i++) {
					System.out.println(num +" * "+i +" = "+(num*i));
				
				}
				break;
			default:
				System.out.println("1~9������ ����� �Է��Ͽ����մϴ�.");
			}
		*/
		}
	
	public void method5() {
		// 1���� 10������ ������ ������ ���� 1���� ���������� ���� �հ�
		// Math.random(); // ������ ����(�Ǽ�)�� ��ȯ�ϴ� �޼ҵ�
		// ���� Math.random()�� ���� : 0 <= Math.random() < 1
		// 10���� ����� ���� 10 ���ϱ� : 0 <= Math.random() * 10 < 10
		// 10�� �����ϱ� ���� 1 ���ϱ� : 1 <= Math.random * 10 + 1 < 11
		// ������ ����� ���� int�� ��ȯ : 1 <= (int)(Math.random() * 10 + 1) < 11
		int random = (int)(Math.random() * 10 + 1);
		int sum =0;
		
		for(int i=1; i<=random; i++) {
			sum = sum +i;			
		}
		System.out.printf("1���� %d���� ���� �հ� : %d",random, sum);
	}
	
	public void method6() {
		// 2�ܺ��� 9�ܱ��� ���
		for(int i = 2; i<=9; i++) {
			for(int k=1; k<=9; k++) {
				System.out.println(i+" * "+k+" = "+(i*k));
			}
			System.out.println("-----------");
		}
	}
	
	public void method7() {
		// �Ƴ��α� �ð� ��� : 0�� 0�� ~ 23�� 59��
		for(int si = 0; si<24; si++) {
			for(int bun = 0; bun<=59; bun++) {
				System.out.println(si+"�� "+bun+"��");
			}
			System.out.println();
		}
	}
	
	public void method8() {
		// �� �ٿ� ��(*)ǥ�� 5�� ��µǴµ�
		// �� ���� ����ڰ� �Է��� ����ŭ ���
		/*
		 	����� �� �� : 3
		 	*****
		 	*****
		 	*****
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �� �� : ");
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			for(int k = 0; k<5; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void method9() {
		// �� �ٿ� ��ǥ ���ڸ� �Էµ� �� ���� ĭ �� ��ŭ �Է�
		// ��, �� ���� ĭ ���� ��ġ�ϴ� ��ġ���� �� ��ȣ�� ���� ������ ���
		/*
		 	�� �� : 6
		 	ĭ �� : 6
		 	1*****
		 	*2****
		 	**3***
		 	***4**
		 	****5*
		 	*****6
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� : ");
		int jul = sc.nextInt();
		System.out.print("ĭ �� : ");
		int can = sc.nextInt();
		
		for(int i = 1; i<=jul; i++) {
			for(int k = 1; k<=can; k++) {
				if(i==k) {
					System.out.printf("%d",k);
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
}
