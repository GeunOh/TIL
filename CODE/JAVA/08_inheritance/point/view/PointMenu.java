package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;
import com.kh.practice.point.model.vo.Rectangle;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("===== �޴� =====");
			System.out.println("1. ��");
			System.out.println("2. �簢��");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ : ");
			int menuItem = Integer.parseInt(sc.nextLine());
			
			switch(menuItem) {
			case 1: circleMenu(); break;
			case 2: rectangleMenu(); break;
			case 9: System.out.println("���α׷��� �����մϴ�.\n"); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�.\n");
			}
			if(menuItem==9)
				break;
		}
		
	}
	public void circleMenu() {
		System.out.println("===== �� �޴� =====");
		System.out.println("1. �� �ѷ�");
		System.out.println("2. �� ����");
		System.out.println("9. ��������");
		System.out.print("�޴� ��ȣ : ");
		int menuItem = Integer.parseInt(sc.nextLine());
		
		switch(menuItem) {
		case 1: calcCircum(); break;
		case 2: calcCircleArea(); break;
		case 9: System.out.println("�������� ���ư��ϴ�.\n"); break;
		default: System.out.println("�߸� �Է��ϼ̽��ϴ�.\n");
		}
	}
	public void rectangleMenu() {
		System.out.println("===== �簢�� �޴� =====");
		System.out.println("1. �簢�� �ѷ�");
		System.out.println("2. �簢�� ����");
		System.out.println("9. ��������");
		System.out.print("�޴� ��ȣ : ");
		int menuItem = Integer.parseInt(sc.nextLine());
		
		switch(menuItem) {
		case 1: calcPerimeter(); break;
		case 2: calcRectArea(); break;
		case 9: System.out.println("�������� ���ư��ϴ�.\n"); break;
		default: System.out.println("�߸� �Է��ϼ̽��ϴ�.\n");
		}
	}
	public void calcCircum() {
		System.out.print("x ��ǥ : ");
		int x = Integer.parseInt(sc.nextLine());
		System.out.print("y ��ǥ : ");
		int y = Integer.parseInt(sc.nextLine());
		System.out.print("������ : ");
		int radius = Integer.parseInt(sc.nextLine());
		
		System.out.println(cc.calcCircum(x, y, radius));
	}
	public void calcCircleArea() {
		System.out.print("x ��ǥ : ");
		int x = Integer.parseInt(sc.nextLine());
		System.out.print("y ��ǥ : ");
		int y = Integer.parseInt(sc.nextLine());
		System.out.print("������ : ");
		int radius = Integer.parseInt(sc.nextLine());
		
		System.out.println(cc.calcArea(x, y, radius));
	}
	public void calcPerimeter() {
		System.out.print("x ��ǥ : ");
		int x = Integer.parseInt(sc.nextLine());
		System.out.print("y ��ǥ : ");
		int y = Integer.parseInt(sc.nextLine());
		System.out.print("���� : ");
		int height = Integer.parseInt(sc.nextLine());
		System.out.print("�ʺ� : ");
		int width = Integer.parseInt(sc.nextLine());
		
		System.out.println(rc.calcPerimeter(x, y, height, width));
	}
	public void calcRectArea(){
		System.out.print("x ��ǥ : ");
		int x = Integer.parseInt(sc.nextLine());
		System.out.print("y ��ǥ : ");
		int y = Integer.parseInt(sc.nextLine());
		System.out.print("���� : ");
		int height = Integer.parseInt(sc.nextLine());
		System.out.print("�ʺ� : ");
		int width = Integer.parseInt(sc.nextLine());
		
		System.out.println(rc.calcArea(x, y, height, width));
	}
}
