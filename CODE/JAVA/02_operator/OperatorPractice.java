package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		System.out.println();
		String result = num > 0 ? "�����" : "����� �ƴϴ�";
		System.out.println(result);
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		System.out.println();
		String result = num > 0 ? "�����" : (num==0 ? "0�̴�" : "������");
		System.out.println(result);
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		System.out.println();
		String result = num%2 ==0 ? "¦����" : "Ȧ����";
		System.out.println(result);
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ο� �� : ");
		int people = sc.nextInt();
		System.out.print("���� ���� : ");
		int candy = sc.nextInt();
		
		System.out.println();
		System.out.println("1�δ� ���� ���� : "+candy/people);
		System.out.println("���� ���� ���� : "+candy%people);
		
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�г�(���ڸ�) : ");
		int grade = Integer.parseInt(sc.nextLine());
		System.out.print("��(���ڸ�) : ");
		int ban = Integer.parseInt(sc.nextLine());
		System.out.print("��ȣ(���ڸ�) : ");
		int number = Integer.parseInt(sc.nextLine());		
		System.out.print("����(M/F) : ");
		char chGender = sc.nextLine().charAt(0);
		System.out.print("����(�Ҽ��� �Ʒ� ��°�ڸ�����) : ");
		double score = Double.parseDouble(sc.nextLine());
		System.out.println();
		String gender = chGender=='M'?"���л�":"���л�";
		System.out.print(grade+"�г� "+ban+"�� "+number+"�� "+name+" "+gender+"�� ������ "+score+"�̴�.");				
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		String str = age<=13 ? "���" : age<=19? "û�ҳ�":"����";
		System.out.println();
		System.out.println(str);
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int korea = sc.nextInt();
		System.out.print("���� : ");
		int english = sc.nextInt();
		System.out.print("���� : ");
		int math = sc.nextInt();
		System.out.println();
		System.out.println("�հ� : "+(korea+english+math));
		double avg = (double)(korea+english+math)/3.0;
		System.out.println("��� : "+avg);
		String result = korea>=40 && english>=40 && math>=40 && avg >=60 ? "�հ�" : "���հ�";
		System.out.println(result);
		
		
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹι�ȣ�� �Է��ϼ���(- ����) : ");
		String juminNumber = sc.nextLine();
		String result = juminNumber.charAt(7)==1?"����":"����";
		System.out.println();
		System.out.println(result);
	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		System.out.print("����2 : ");
		int num2 = sc.nextInt();
		System.out.print("�Է� : ");
		int input = sc.nextInt();
		String isTrue = input<=num1 || input>num2 ? "true" :"false";
		System.out.println();
		System.out.println(isTrue);
	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է�1 : ");
		int input1 = sc.nextInt();
		System.out.print("�Է�2 : ");
		int input2 = sc.nextInt();
		System.out.print("�Է�3 : ");
		int input3 = sc.nextInt();
		String result = (input1==input2) ? (input2==input3)?"ture":"false":"false";
		System.out.println();
		System.out.println(result);
	}

	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A����� ���� : ");
		int a = sc.nextInt();
		System.out.print("B����� ���� : ");
		int b = sc.nextInt();
		System.out.print("C����� ���� : ");
		int c = sc.nextInt();
		
		System.out.println();
		double A_insen = a+(a*0.4);
		double B_insen = b;
		double C_insen = ((double)c+((double)c*0.15));
		
		System.out.println("A��� ����/����+a : "+a+"/"+A_insen);
		System.out.println(A_insen >=3000 ?"3000 �̻�":"3000 �̸�");
		
		System.out.println("B��� ����/����+a : "+b+"/"+B_insen );
		System.out.println(B_insen >=3000 ?"3000 �̻�":"3000 �̸�");
		
		System.out.println("C��� ����/����+a : " +c+"/"+C_insen);
		System.out.println(C_insen >=3000 ?"3000 �̻�":"3000 �̸�");
		
	}

}
