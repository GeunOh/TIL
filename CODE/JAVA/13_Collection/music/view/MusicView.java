package com.kh.practice.list.music.view;

import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("******* ���� �޴� *******");
			System.out.println("1. ������ ��ġ�� �� �߰�");
			System.out.println("2. ù ��ġ�� �� �߰�");
			System.out.println("3. ��ü �� ��� ���");
			System.out.println("4. Ư�� �� �˻�");
			System.out.println("5. Ư�� �� ����");
			System.out.println("6. Ư�� �� ���� ����");
			System.out.println("7. ��� �������� ����");
			System.out.println("8. ������ �������� ����");
			System.out.println("9. ����");
			System.out.println();
			System.out.print("�޴� ��ȣ ���� : ");
			
			int menuItem = Integer.parseInt(sc.nextLine());
			
			switch(menuItem) {
			case 1: addList(); break;
			case 2: addAtZero(); break;
			case 3: printAll(); break;
			case 4: searchMusic(); break;
			case 5: removeMusic(); break;
			case 6: setMusic(); break;
			case 7: ascTitle(); break;
			case 8: descSinger(); break;
			case 9: System.out.println("����\n"); return;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}	
		}
	}
	
	public void addList() {
		System.out.println("****** ������ ��ġ�� �� �߰� ******");
		System.out.print("��� : ");
		String title = sc.nextLine();
		System.out.print("���� �� : ");
		String singer = sc.nextLine();
		int result = mc.addList(new Music(title, singer));
		if(result==1) {
			System.out.println("�߰� ����\n");
		}
		else {
			System.out.println("�߰� ����\n");
		}
		
		
	}
	
	public void addAtZero() {
		System.out.println("****** ù ��ġ�� �� �߰� ******");
		System.out.print("��� : ");
		String title = sc.nextLine();
		System.out.print("���� �� : ");
		String singer = sc.nextLine();
		int result = mc.addAtZero(new Music(title, singer));
		if(result==1) {
			System.out.println("�߰� ����\n");
		}
		else {
			System.out.println("�߰� ����\n");
		}
		
	}
	
	public void printAll() {
		System.out.println("****** ��ü �� ��� ��� ******");
		System.out.println(mc.printAll());
	}
	
	public void searchMusic() {
		System.out.println("****** Ư�� �� �˻� ******");
		System.out.print("�˻��� �� �� : ");
		String title = sc.nextLine();
		Music m = mc.searchMusic(title);
		if(m.getTitle() != null && m.getSinger()!= null) {
			System.out.println("�˻��� ���� "+m+" �Դϴ�.");
		}
		else {
			System.out.println("�˻��� ���� �����ϴ�.");
		}
	}
	
	public void removeMusic() {
		System.out.println("****** Ư�� �� ���� ******");
		System.out.print("������ �� �� : ");
		String title = sc.nextLine();
		Music m = mc.removeMusic(title);
		if(m.getTitle() != null && m.getSinger()!= null) {
			System.out.println(m+"��(��) ���� �߽��ϴ�.");
		}
		else {
			System.out.println("������ ���� �����ϴ�.");
		}
	}
	
	public void setMusic() {
		System.out.println("****** Ư�� �� ���� ���� ******");
		System.out.print("�˻��� �� �� : ");
		String title = sc.nextLine();
		System.out.print("������ �� �� : ");
		String updateTitle = sc.nextLine();
		System.out.print("������ ���� �� : ");
		String updateSinger = sc.nextLine();
		
		Music m = mc.setMusic(title, new Music(updateTitle, updateSinger));
		
		if(m.getTitle() != null && m.getSinger()!= null) {
			System.out.println(m+"�� ���� ���� �Ǿ����ϴ�.");
		}
		else {
			System.out.println("������ ���� �����ϴ�.");
		}
	}
	
	public void ascTitle() {
		System.out.println("****** �� �� �������� ���� ******");
		int result = mc.ascTitle();
		
		if(result ==1) {
			System.out.println("���� ����\n");
		}
		else {
			System.out.println("���� ����\n");
		}
	}
	
	public void descSinger() {
		System.out.println("****** ���� �� �������� ���� ******");
		int result = mc.descSinger();
		
		if(result ==1) {
			System.out.println("���� ����\n");
		}
		else {
			System.out.println("���� ����\n");
		}
	}
}
