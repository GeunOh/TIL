package com.kh.practice.book.view;

import java.util.Calendar;
import java.util.Scanner;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	private Book[] bArr;
	
	public BookMenu() {
		bc.makeFile();
		bArr = bc.fileRead();
	}
	
	public void mainMenu() {
		while(true) {
			System.out.println("1. ���� �߰� ����");
			System.out.println("2. ���� ���� ���");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ��ȣ : ");
			int menuItem = Integer.parseInt(sc.nextLine());
			
			switch(menuItem) {
			case 1: fileSave(); break;
			case 2: fileRead(); break;
			case 9: System.out.println("���α׷� ����"); break;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.\n");
			}
			
			if(menuItem == 9)
				break;
		}
	
	}
	
	public void fileSave() {
		System.out.print("���� �� : ");
		String title = sc.nextLine();
		System.out.print("���� �� : ");
		String author = sc.nextLine();
		System.out.print("���� ���� : ");
		int price = Integer.parseInt(sc.nextLine());
		System.out.print("���� ��¥(yyyy-mm-dd) : ");
		String day = sc.nextLine();
		String[] dateArr = day.split("-");
		int year = Integer.parseInt(dateArr[0]);
		int month = Integer.parseInt(dateArr[1]) -1;
		int date = Integer.parseInt(dateArr[2]);
		
		Calendar c = Calendar.getInstance();
		c.set(year, month, date);
	
		System.out.print("������ : ");
		double discount = Double.parseDouble(sc.nextLine());
		for(int i=0; i<bArr.length; i++) {
			if(bArr[i] == null) {
				bArr[i] = new Book(title, author, price, c, discount);
				break;
			}
		}

		bc.fileSave(bArr);
	}
	
	public void fileRead() {
		for(int i=0; i<bArr.length; i++) {
			if(bc.fileRead()[i] != null)
				System.out.println(bc.fileRead()[i]);			
		}
			
	}
}
