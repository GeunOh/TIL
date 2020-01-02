package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		int menuNum = 0;
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("9. ����");
		System.out.print("�޴� ��ȣ�� �Է��ϼ���  : ");
		menuNum = sc.nextInt();
		
		switch(menuNum) {
		case 1: System.out.println("�Է¸޴��Դϴ�"); break;
		case 2: System.out.println("�����޴��Դϴ�"); break;
		case 3: System.out.println("��ȸ�޴��Դϴ�"); break;
		case 4: System.out.println("�����޴��Դϴ�"); break;
		case 7: System.out.println("���α׷��� ����˴ϴ�."); break;
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num>0) {
			if(num%2==0) {
				System.out.println("¦����");
			}
			else {
				System.out.println("Ȧ����");
			}
		}
		else {
			System.out.println("����� �Է����ּ���.");
		}	
		
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������� : ");
		int korea = sc.nextInt();
		System.out.print("�������� : ");
		int math = sc.nextInt();
		System.out.print("�������� : ");
		int english = sc.nextInt();
		int sum = korea+math+english;
		double avg =(sum)/3.0;
		if(korea>=40 && english>=40 && math >= 40 && avg>=60) {
			System.out.println("���� : "+korea);
			System.out.println("���� : "+math);
			System.out.println("���� : "+english);
			System.out.println("�հ� : "+sum);
			System.out.println("��� : "+avg);
			System.out.println("�����մϴ�, �հ��Դϴ�!");
		}
		else {
			System.out.println("���հ��Դϴ�.");
		}
		
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 ������ ���� �Է� : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 12:
		case 1:
		case 2:
			System.out.println(num+"���� �ܿ��Դϴ�.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println(num+"���� ���Դϴ�.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(num+"���� �����Դϴ�.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(num+"���� �����Դϴ�.");
			break;
			
		default: System.out.println(num+"���� �߸� �Էµ� ���Դϴ�.");
		}
		
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		String id = "myId";
		String password = "myPassword12";
		
		System.out.print("���̵� : ");
		String inputId = sc.nextLine();
		System.out.print("��й�ȣ : ");
		String inputPassword = sc.nextLine();
		
		if(id.equals(inputId) && password.equals(inputPassword)) {
			System.out.println("�α��� ����");
			
		}
		else if(id.equals(inputId) && !password.equals(inputPassword)) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}
		else if(!id.equals(inputId) && password.equals(inputPassword)) {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}
		else {
			System.out.println("�Ѵ� Ʋ�Ƚ��ϴ�.");
		}
		
	}

	public void practice6() {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
		String str = sc.nextLine();
		
		switch(str) {
		case "������": System.out.println("ȸ������, �Խñ� ����, �Խñ� �ۼ�, ��� �ۼ�, �Խñ� ��ȸ"); break;
		case "ȸ��": System.out.println("�Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�"); break;
		case "��ȸ��": System.out.println("�Խñ� ��ȸ");
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ű(m)�� �Է����ּ��� : ");
		double key = sc.nextDouble();
		System.out.print("������(kg)�� �Է����ּ��� : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (key*key);
		
		if(bmi<18.5) {
			System.out.println("BMI ���� : "+bmi);
			System.out.println("��ü��");
		}
		else if(bmi >= 18.5 && bmi<23) {
			System.out.println("BMI ���� : "+bmi);
			System.out.println("����ü��");
		}
		else if(bmi >= 23 && bmi<25) {
			System.out.println("BMI ���� : "+bmi);
			System.out.println("��ü��");
		}
		else if(bmi >= 25 && bmi<30) {
			System.out.println("BMI ���� : "+bmi);
			System.out.println("��");
		}
		else if(bmi >= 30) {
			System.out.println("BMI ���� : "+bmi);
			System.out.println("�� ��");
		}
		
		
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ǿ�����1 �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ǿ�����1 �Է� : ");
		int num2 = sc.nextInt();
		System.out.print("�����ڸ� �Է�(+,-,*,/,%) : ");
		char op = sc.next().charAt(0);
		double result =0;
		switch(op) {
		case '+':
			if(num1>0 && num2>0) {
				result = num1 + num2;
				System.out.println(num1+" "+op+" "+num2+" = "+result);
			}
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
			}
			break;
		case '-':
			if(num1>0 && num2>0) {
				result = num1 - num2;
				System.out.println(num1+" "+op+" "+num2+" = "+result);
			}
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
			}
			break;
		case '*':
			if(num1>0 && num2>0) {
				result = num1 * num2;
				System.out.println(num1+" "+op+" "+num2+" = "+result);
			}
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
			}
			break;
		case '/':
			if(num1>0 && num2>0) {
				result = (double)num1 / (double)num2;
				System.out.println(num1+" "+op+" "+num2+" = "+result);
			}
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
			}
			break;
		case '%':
			if(num1>0 && num2>0) {
				result = num1 % num2;
				System.out.println(num1+" "+op+" "+num2+" = "+result);
			}
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
			}
			break;
		default: 	System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
		}
		
	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�߰� ��� ���� : ");
		int middle = sc.nextInt();
		System.out.print("�⸻ ��� ���� : ");
		int last = sc.nextInt();
		System.out.print("���� ���� : ");
		int assignment = sc.nextInt();
		System.out.print("�⼮ ȸ�� : ");
		int attendance = sc.nextInt();
		System.out.println("============= ���  =============");
		double middleScore = (20*middle) / 100;
		double lastScore = (30*last) / 100;
		double assignmentScore = (30*assignment)/100;
		double attendanceScore = attendance;
		double total = middleScore+ assignmentScore+ lastScore + attendanceScore;
		
		if(total>=70 && attendanceScore>=(20*0.7)) {
			System.out.println("���� : "+total);
			System.out.println("PASS");
		}
		else if(attendanceScore<(20*0.7) && total>=70){
			System.out.println("���� : "+total);
			System.out.println("Fail [�⼮ ȸ�� ���� (" +attendance+"/20)]");
		}
		else if(attendanceScore<(20*0.7) && total<70) {
			System.out.println("���� : "+total);
			System.out.println("Fail [���� �̴�, �⼮ ȸ�� ���� ("+attendance+"/20)]");
		}
		else if(total<70 && attendanceScore>=(20*0.7)) {
			System.out.println("���� : "+total);
			System.out.println("Fail [���� �̴�]");
		}
	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		int menu = 100;
		while(menu!=0) {
			System.out.println("1. �޴� ���");
			System.out.println("2. ¦��/Ȧ��");
			System.out.println("3. �հ�/���հ�");
			System.out.println("4. ����");
			System.out.println("5. �α���");
			System.out.println("6. ���� Ȯ��");
			System.out.println("7. BMI");
			System.out.println("8. ����");
			System.out.println("9. P/F");
			System.out.println("0. ����");
			
			System.out.print("���� : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: practice1(); break;
			case 2: practice2(); break;
			case 3: practice3(); break;
			case 4: practice4(); break;
			case 5: practice5(); break;
			case 6: practice6(); break;
			case 7: practice7(); break;
			case 8: practice8(); break;
			case 9: practice9(); break;
			case 0: System.out.println("���α׷��� �����մϴ�."); break;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}		
	}


}
