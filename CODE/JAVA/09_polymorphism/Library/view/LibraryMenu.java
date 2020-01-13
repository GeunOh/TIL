package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("���� : ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("���� : ");
		char gender = sc.nextLine().charAt(0);
		
		Member mem = new Member(name, age, gender);
		lc.insertMember(mem);
		
		while(true) {
			System.out.println();
			System.out.println("==== �޴� ====");
			System.out.println("1. ����������");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻�");
			System.out.println("4. ���� �뿩�ϱ�");
			System.out.println("9. ���α׷� �����ϱ�");
			System.out.print("�޴� ��ȣ : ");
			int menuItem = Integer.parseInt(sc.nextLine());
			
			switch(menuItem) {
			case 1: System.out.println(lc.myInfo()); break;
			case 2: selectAll(); break;
			case 3: searchBook(); break;
			case 4: rentBook(); break;
			case 9: System.out.println("���α׷��� �����մϴ�.\n"); break;
			default :
				System.out.println("�߸� �Է��ϼ̽��ϴ�.\n");
			}
			if(menuItem ==9) {
				break;
			}
		}
	}
	public void selectAll() {
		for(int i =0; i<lc.selectAll().length; i++) {
			if(lc.selectAll()[i] != null) {
				System.out.println(i+"������ : "+lc.selectAll()[i]);
			}
		}
	}
	public void searchBook() {
		System.out.println();
		System.out.print("�˻��� ���� Ű���� : ");
		String keyword = sc.nextLine();
		for(int i =0; i<lc.searchBook(keyword).length; i++) {
			if(lc.searchBook(keyword)[i]!=null)
				System.out.println(lc.searchBook(keyword)[i]);
		}

	}
	public void rentBook() {
		System.out.println();
		selectAll();
		System.out.print("�뿩�� ���� ��ȣ ���� : ");
		int index = Integer.parseInt(sc.nextLine());
		int result = lc.rentBook(index);
		
		switch(result) {
		case 0: System.out.println("���������� �뿩�Ǿ����ϴ�."); break;
		case 1: System.out.println("���� �������� �뿩 �Ұ����Դϴ�."); break;
		case 2: System.out.println("���������� �뿩�Ǿ����ϴ�. �丮�п� ������ �߱޵Ǿ����� �������������� Ȯ���ϼ���."); break;
		}
		
	}
}
