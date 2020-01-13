package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("�л��� �ִ� 3����� ������ �� �ֽ��ϴ�.");
			int cntStudent = pc.personCount()[0];
			System.out.println("���� ����� �л��� "+cntStudent+"�� �Դϴ�.");
			System.out.println("����� �ִ� 10����� ������ �� �ֽ��ϴ�.");
			int cntEmployee = pc.personCount()[1];
			System.out.println("���� ����� ����� "+cntEmployee+"�� �Դϴ�.\n");
			
			System.out.println("1. �л� �޴�");
			System.out.println("2. ��� �޴�");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ : ");
			int menuItem= Integer.parseInt(sc.nextLine());
			System.out.println();
			
			switch(menuItem) {
			case 1: studentMenu(); break;
			case 2: employeeMenu();  break;
			case 9: System.out.println("�����մϴ�.\n"); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.\n");
			}
			if(menuItem==9) {
				break;
			}	
		}
	}
	public void studentMenu() {
		while(true) {
			int cntStudent = pc.personCount()[0];
			int flag =0;
			System.out.println("1. �л� �߰�");
			System.out.println("2. �л� ����");
			System.out.println("9. ��������");
			if(cntStudent==3) {
				System.out.println("�л��� ���� �� �ִ� ������ �� ���� ������ �л� �߰� �޴��� �� �̻� Ȱ��ȭ ���� �ʽ��ϴ�.");
				flag = 1;
			}
			System.out.print("�޴� ��ȣ : ");
			int menuItem = Integer.parseInt(sc.nextLine());
			
			switch(menuItem) {
			case 1: 
				if(flag==1) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���\n");
				}else {
					insertStudent();
				}
				break;
			case 2: printStudent(); break;
			case 9: System.out.println("�������� ���ư��ϴ�.\n"); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.\n");
			}
			if(menuItem==9)
				break;
		}
	}
	public void employeeMenu() {
		while(true) {
			int cntEmployee = pc.personCount()[1];
			int flag =0;
			System.out.println("1. ��� �߰�");
			System.out.println("2. ��� ����");
			System.out.println("9. ��������");
			if(cntEmployee==10) {
				System.out.println("����� ���� �� �ִ� ������ �� ���� ������ ��� �߰� �޴��� �� �̻� Ȱ��ȭ ���� �ʽ��ϴ�.");
				flag = 1;
			}
			System.out.print("�޴� ��ȣ : ");
			int menuItem = Integer.parseInt(sc.nextLine());
			
			switch(menuItem) {
			case 1: 
				if(flag==1) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���\n");
				}else {
					insertEmployee();
				}
				break;
			case 2: printEmployee(); break;
			case 9: System.out.println("�������� ���ư��ϴ�.\n"); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.\n");
			}
			
			if(menuItem==9)
				break;
		}
	}
	public void insertStudent() {
		System.out.println();
		while(true) {
			System.out.print("�л� �̸� : ");
			String name = sc.nextLine();
			System.out.print("�л� ���� : ");
			int age = Integer.parseInt(sc.nextLine());
			System.out.print("�л� Ű : ");
			double height = Double.parseDouble(sc.nextLine());
			System.out.print("�л� ������ : ");
			double weight = Double.parseDouble(sc.nextLine());
			System.out.print("�л� �г� : ");
			int grade = Integer.parseInt(sc.nextLine());
			System.out.print("�л� ���� : ");
			String major = sc.nextLine();
			
			pc.insertStudent(name, age, height, weight, grade, major);
			int cntStudent = pc.personCount()[0];
			if(cntStudent < 3) {
				System.out.print("�׸��Ͻ÷��� N(�Ǵ� n),�̾��Ͻ÷��� �ƹ� Ű�� �������� : ");
				char isCheck = sc.nextLine().charAt(0);
				
				if(isCheck=='N'||isCheck=='n') {
					break;
				}
			}
			else {
				System.out.println("�л��� ���� �� �ִ� ������ �� á�� ������ �л� �߰��� �����ϰ� �л� �޴��� ���ư��ϴ�.\n");
				break;
			}
		}
	}
	public void printStudent() {
		System.out.println();
		for(int i=0; i<pc.printStudent().length; i++) {
			if(pc.printStudent()[i] != null)
				System.out.println(pc.printStudent()[i]);
		}
		System.out.println();
	}
	public void insertEmployee() {
		System.out.println();
		while(true) {
			System.out.print("��� �̸� : ");
			String name = sc.nextLine();
			System.out.print("��� ���� : ");
			int age = Integer.parseInt(sc.nextLine());
			System.out.print("��� Ű : ");
			double height = Double.parseDouble(sc.nextLine());
			System.out.print("��� ������ : ");
			double weight = Double.parseDouble(sc.nextLine());
			System.out.print("��� �޿� : ");
			int salary = Integer.parseInt(sc.nextLine());
			System.out.print("��� �μ� : ");
			String dept = sc.nextLine();
			
			pc.insertEmployee(name, age, height, weight, salary, dept);
			int cntEmployee = pc.personCount()[1];
			if(cntEmployee < 10) {
				System.out.print("�׸��Ͻ÷��� N(�Ǵ� n),�̾��Ͻ÷��� �ƹ� Ű�� �������� : ");
				char isCheck = sc.nextLine().charAt(0);
				
				if(isCheck=='N'||isCheck=='n') {
					break;
				}
			}
			else {
				System.out.println("����� ���� �� �ִ� ������ �� á�� ������ ��� �߰��� �����ϰ� ��� �޴��� ���ư��ϴ�.\n");
				break;
			}
		}
	}
	public void printEmployee() {
		System.out.println();
		for(int i=0; i<pc.printEmployee().length; i++) {
			if(pc.printEmployee()[i] != null)
				System.out.println(pc.printEmployee()[i]);
		}
		System.out.println();
	}
}
