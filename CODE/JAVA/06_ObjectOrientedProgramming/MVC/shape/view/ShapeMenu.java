package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();
	
	public void inputMenu() {
		while(true) {
			System.out.println("===== ���� ���α׷� =====");
			System.out.println("3. �ﰢ��");
			System.out.println("4. �簢��");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ��ȣ : ");
			int menuItem = Integer.parseInt(sc.nextLine());
			switch(menuItem) {
			case 3: triangleMenu(); break;
			case 4: squareMenu(); break;
			case 9 : System.out.println("���α׷��� �����մϴ�."); break;
			default : System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
			}
			if(menuItem==9) {
				break;
			}
		}
		
	}
	
	public void triangleMenu() {
		while(true) {
			System.out.println("===== �ﰢ�� =====");
			System.out.println("1. �ﰢ�� ����");
			System.out.println("2. �ﰢ�� ��ĥ");
			System.out.println("3. �ﰢ�� ����");
			System.out.println("9. ��������");
			System.out.print("�޴� ��ȣ : ");
			int menuItem = Integer.parseInt(sc.nextLine());
			switch(menuItem) {
			case 1: inputSize(3,1); break;
			case 2: inputSize(3,2); break;
			case 3: printInformation(3); break;
			case 9 : System.out.println("�������� ���ư��ϴ�."); break;
			default : System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
			}
			if(menuItem==9) {
				break;
			}
		}
	}
	
	public void squareMenu() {
		while(true) {
			System.out.println("===== �簢�� =====");
			System.out.println("1. �簢�� �ѷ�");
			System.out.println("2. �簢�� ����");
			System.out.println("3. �簢�� ��ĥ");
			System.out.println("4. �簢�� ����");
			System.out.println("9. ��������");
			System.out.print("�޴� ��ȣ : ");
			int menuItem = Integer.parseInt(sc.nextLine());
			switch(menuItem) {
			case 1: inputSize(4,1); break;
			case 2: inputSize(4,2); break;
			case 3: inputSize(4,3); break;
			case 4: printInformation(4); break;
			case 9 : System.out.println("�������� ���ư��ϴ�."); break;
			default : System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
			}
			if(menuItem==9) {
				break;
			}
		}
	}
	
	public void inputSize(int type, int menuNum) {
		if(type==3 && menuNum ==1) {
			System.out.print("���� : ");
			int height = Integer.parseInt(sc.nextLine());
			System.out.print("�ʺ� : ");
			int width = Integer.parseInt(sc.nextLine());
			
			System.out.println("�ﰢ�� ���� : "+tc.calcArea(height, width));
		}
		else if(type==3 && menuNum==2) {
			System.out.print("������ �Է��ϼ��� : ");
			String color = sc.nextLine();
			tc.paintColor(color);
			System.out.println("���� �����Ǿ����ϴ�.");
		}
		
		if(type==4 && ( menuNum==1 || menuNum ==2) ) {
			System.out.print("���� : ");
			int height = Integer.parseInt(sc.nextLine());
			System.out.print("�ʺ� : ");
			int width = Integer.parseInt(sc.nextLine());
			
			if(menuNum==1) {
				System.out.println("�簢�� �ѷ� : "+scr.calcPerimeter(height, width));
			}
			else if(menuNum==2) {
				System.out.println("�簢�� ���� : "+scr.calcArea(height, width));
			}
		}
		else if(type==4 && menuNum ==3) {
			System.out.print("������ �Է��ϼ��� : ");
			String color = sc.nextLine();
			scr.paintColor(color);
			System.out.println("���� �����Ǿ����ϴ�.");
		}
	}
	
	public void printInformation(int type) {
		if(type == 3) {
			System.out.println(tc.print());
		}
		else if(type == 4) {
			System.out.println(scr.print());
		}
	}
}
