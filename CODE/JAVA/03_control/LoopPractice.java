package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
		Scanner sc =new Scanner(System.in);
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num<=0) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		}
		else {
			for(int i=1; i<=num; i++) {
				System.out.print(i+" ");
			}
		}
	}
	public void practice2() {
		Scanner sc =new Scanner(System.in);
		int num =0;
		do {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			num = sc.nextInt();
			if(num<=0) {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			}
			else {
				for(int i=1; i<=num; i++) {
					System.out.print(i+" ");
				}
			}			
		} while(num<=0);
	}
	public void practice3() {
		Scanner sc =new Scanner(System.in);
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		
		if(num<=0) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		}
		else {
			for(int i=num; i>=1; i--) {
				System.out.print(i+" ");
			}
		}			
		
	}
	public void practice4() {
		Scanner sc =new Scanner(System.in);
		int num = 0;
		
		do {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			num = sc.nextInt();
			if(num<=0) {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			}
			else {
				for(int i=num; i>=1; i--) {
					System.out.print(i+" ");
				}
			}			
		}while(num<=0);
	}
	public void practice5() {
		Scanner sc =new Scanner(System.in);
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		int sum =0;
		
		if(num<=0) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		}
		else {
			for(int i=1; i<=num; i++) {
				if(i!=num) {
					System.out.print(i+" + ");
					sum += i;
				} else {
					sum +=i;
					System.out.print(i+" = "+sum);
				}
			}
		}			
	}
	public void practice6() {
		Scanner sc =new Scanner(System.in);
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		if(num1<=0||num2<=0) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		}
		else {
			if(num1<num2) {
				for(int i =num1; i<=num2; i++) {
					System.out.print(i+" ");
				}
			}
			else if(num1>num2) {
				for(int i =num2; i<=num1; i++) {
					System.out.print(i+" ");
				}
			}
			else if(num1==num2) {
				System.out.println(num1);
			}
		}
		
	}
	public void practice7() {
		Scanner sc =new Scanner(System.in);
		int num1 =0;
		int num2 =0;
		
		while(num1<=0||num2<=0) {
			System.out.print("ù ��° ���� : ");
			 num1 = sc.nextInt();
			System.out.print("�� ��° ���� : ");
			 num2 = sc.nextInt();
			if(num1<=0||num2<=0) {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			}
			else {
				if(num1<num2) {
					for(int i =num1; i<=num2; i++) {
						System.out.print(i+" ");
					}
				}
				else if(num1>num2) {
					for(int i =num2; i<=num1; i++) {
						System.out.print(i+" ");
					}
				}
				else if(num1==num2) {
					System.out.println(num1);
				}
			}
		}
	}
	public void practice8() {
		Scanner sc =new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		System.out.println("===== "+num+"�� =====");
		
		for(int i=1; i<=9; i++) {
			System.out.println(num+" * "+i+" = "+(i*num));
		}
	}
	public void practice9() {
		Scanner sc =new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num>=10) {
			System.out.println("9 ������ ���ڸ� �Է����ּ���.");
		} else {
			while(num<=9) {
				System.out.println("===== "+num+"�� =====");
				
				for(int i=1; i<=9; i++) {
					System.out.println(num+" * "+i+" = "+(i*num));
				}
				num++;
			}

		}
	}
	public void practice10() {
		Scanner sc =new Scanner(System.in);
		int num =10;
		while(num>=10) {
			System.out.print("���� : ");
			num = sc.nextInt();
			if(num>=10) {
				System.out.println("9 ������ ���ڸ� �Է����ּ���.");
			} else {
				while(num<=9) {
					System.out.println("===== "+num+"�� =====");
					
					for(int i=1; i<=9; i++) {
						System.out.println(num+" * "+i+" = "+(i*num));
					}
					num++;
				}
				num=0;
	
			}
		}
	}
	public void practice11() {
		Scanner sc =new Scanner(System.in);
		System.out.print("���� ���� : ");
		int startNum = sc.nextInt();
		System.out.print("���� : ");
		int gong = sc.nextInt();
		int sum = startNum;
		for(int i = 0; i<10; i++) {
			System.out.print(sum+" ");
			sum += gong;
		}
	}
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		String op = "";
		while(true) {
			System.out.print("�����ڸ� �Է�(+,-,*,/,%) : ");
			op = sc.nextLine();
			if(op.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			System.out.print("����1 �Է� : ");
			int num1 = Integer.parseInt(sc.nextLine());
			System.out.print("����2 �Է� : ");
			int num2 = Integer.parseInt(sc.nextLine());
			double result =0;
			switch(op) {
			case "+":
				result = num1 + num2;
				System.out.println(num1+" "+op+" "+num2+" = "+result);
				break;
			case "-":
				result = num1 - num2;
				System.out.println(num1+" "+op+" "+num2+" = "+result);
				break;
			case "*":
				result = num1 * num2;
				System.out.println(num1+" "+op+" "+num2+" = "+result);
				break;
			case "/":
				if(num2!=0) {
					result = (double)num1 / (double)num2;
					System.out.println(num1+" "+op+" "+num2+" = "+result);
				}
				else {
					System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
				}
				break;
			case "%":
				result = num1 % num2;
				System.out.println(num1+" "+op+" "+num2+" = "+result);
			
				break;
			default: 	System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���.");
			}
		}
		
	}
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j =1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j =num; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
