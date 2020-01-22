package com.kh.practice.set.view;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import com.kh.practice.set.controller.LotteryController;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryMenu {
	private Scanner sc = new Scanner(System.in);
	private LotteryController lc = new LotteryController();
	
	public void mainMenu() {
		System.out.println("========= KH ��÷ ���α׷� =========\n");
		
		while(true) {
			System.out.println("******* ���� �޴� *******");
			System.out.println("1. ��÷ ��� �߰�");
			System.out.println("2. ��÷ ��� ����");
			System.out.println("3. ��÷ ��� Ȯ��");
			System.out.println("4. ���ĵ� ��÷ ��� Ȯ��");
			System.out.println("5. ��÷ ��� �˻�");
			System.out.println("9. ����\n");
			System.out.print("�޴� ��ȣ ���� : ");
			int menuItem = Integer.parseInt(sc.nextLine());
			
			switch(menuItem) {
			case 1: insertObject(); break;
			case 2: deleteObject(); break;
			case 3: winObject(); break;
			case 4: sortedWinObject(); break;
			case 5: searchWinner(); break;
			case 9: System.out.println("���α׷� ����."); return;
			default: System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���.\n");
			}			
		}
	}
	
	public void insertObject() {
		System.out.print("�߰��� ��÷ ��� �� : ");
		int loop = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<loop; i++) {
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("�ڵ��� ��ȣ('-'����) : ");
			String phone = sc.nextLine();
			Lottery l = new Lottery(name, phone);
			
			if(lc.insertObject(l)==true) {
				
			}
			else {
				System.out.println("�ߺ��� ����Դϴ�. �ٽ� �Է��ϼ���.");
				i--;
			}
			System.out.println();
		}
		
		
		System.out.println(loop+"�� �߰� �Ϸ�Ǿ����ϴ�.");
	}
	
	public void deleteObject() {
		System.out.println("������ ����� �̸��� �ڵ��� ��ȣ�� �Է��ϼ���.");
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�ڵ��� ��ȣ('-'����) : ");
		String phone = sc.nextLine();
		
		if(lc.deleteObject(new Lottery(name, phone)) == true) {
			System.out.println("���� �Ϸ�Ǿ����ϴ�.");
		}
		else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
		}
			
		
	}
	public void winObject() {
		HashSet<Lottery> win = new HashSet<Lottery>();
		win = lc.winObject();
		if(win.size() < 4) {
			System.out.println("��÷�� ���� 4�� �̻��̿��� �մϴ�.");
		}
		else {
			System.out.println(win);	
		}
	}
	public void sortedWinObject() {
		Iterator<Lottery> it = lc.sortedWinObject().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public void searchWinner() {
		System.out.println("�˻��� ����� �̸��� �ڵ��� ��ȣ�� �Է��ϼ���.");
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�ڵ��� ��ȣ('-'����) : ");
		String phone = sc.nextLine();
		
		if(lc.searchWinner(new Lottery(name,phone))== true) {
			System.out.println("�����մϴ�. ��÷ ��Ͽ� �����մϴ�.");
		}
		else {
			System.out.println("��Ÿ������ ��÷ ��Ͽ� �������� �ʽ��ϴ�.");
		}
		
	}
}
