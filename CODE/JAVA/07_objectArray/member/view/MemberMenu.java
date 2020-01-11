package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public MemberMenu() {}
	public void mainMenu() {
		while(true) {
			System.out.println("�ִ� ��� ������ ȸ�� ���� "+mc.SIZE+"���Դϴ�.");
			System.out.println("���� ��ϵ� ȸ�� ���� "+mc.exitsMemberNum()+"���Դϴ�.");
			if(mc.exitsMemberNum()!=mc.SIZE) {
				System.out.println("1. �� ȸ�� ���");
			}
			else {
				System.out.println("ȸ�� ���� ��� �� á�� ������ �Ϻ� �޴��� ���µ˴ϴ�.");
			}
			System.out.println("2. ȸ�� �˻�");
			System.out.println("3. ȸ�� ���� ����");
			System.out.println("4. ȸ�� ����");
			System.out.println("5. ��� ���");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ : ");
			int menuItem = Integer.parseInt(sc.nextLine());
			
			switch(menuItem) {
			case 1: 
				if(mc.exitsMemberNum()!=mc.SIZE) {
					insertMember();
				}
				else {
					System.out.println("ȸ�� ���� ��� �� á�� ������ �߰��� �Ұ��մϴ�.");
				}
				break;
			case 2:
				searchMember(); break;
			case 3:
				updateMember(); break;
			case 4:
				deleteMember(); break;
			case 5:
				printAll(); break;
			case 9:
				System.out.println("���α׷��� �����մϴ�.\n"); break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			if(menuItem==9)
				break;
		}
	}
	
	public void insertMember() {
		System.out.println("�� ȸ���� ����մϴ�.");
		String id;
		while(true) {
			System.out.print("���̵� : ");
			id = sc.nextLine();
			if(mc.checkId(id)==true) {
				System.out.println("�ߺ��� ���̵��Դϴ�. �ٽ� �Է����ּ���.");
			}
			else {
				break;
			}
		}
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("��й�ȣ : ");
		String password = sc.nextLine();
		System.out.print("�̸��� : ");
		String email = sc.nextLine();
		char gender;
		while(true) {
			System.out.print("����(M/F) : ");
			gender = sc.nextLine().charAt(0);
			if(gender=='M'||gender=='F'||gender=='m'||gender=='f') {
				break;
			}
			else {
				System.out.println("������ �ٽ� �Է��ϼ���.");
			}
		}
		System.out.print("���� : ");
		int age = Integer.parseInt(sc.nextLine());
		mc.insertMember(id, name, password, email, gender, age);
	}
	
	public void searchMember() {
		System.out.println("1. ���̵�� �˻��ϱ�");
		System.out.println("2. �̸����� �˻��ϱ�");
		System.out.println("3. �̸��Ϸ� �˻��ϱ�");
		System.out.println("9. �������� ���ư���");
		System.out.print("�޴� ��ȣ : ");
		int menuItem = Integer.parseInt(sc.nextLine());
		
		switch(menuItem) {
		case 1: searchId(); break;
		case 2: searchName(); break;
		case 3: searchEmail(); break;
		case 9:
			System.out.println("�������� ���ư��ϴ�.\n");
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.\n");
		}
	}
	
	public void searchId() {
		System.out.print("�˻��� ���̵� : ");
		String id = sc.nextLine();
		if(mc.searchId(id).equals("")) {
			System.out.println("�˻� ����� �����ϴ�.\n");
		}
		else {
			System.out.println("ã���� ȸ�� ��ȸ ����Դϴ�.");
			System.out.println(mc.searchId(id));
			System.out.println();
		}
	}
	
	public void searchName() {
		System.out.print("�˻��� �̸� : ");
		String name = sc.nextLine();
		int cnt =0;
		for(int i =0; i<mc.searchName(name).length; i++) {
			if(mc.searchName(name)[i]!=null) {
				cnt++;
			}
		}
		if(cnt==0) {
			System.out.println("�˻� ����� �����ϴ�.\n");
		}
		else {
			System.out.println("ã���� ȸ�� ��ȸ ����Դϴ�.");
			for(int i=0; i<cnt; i++) {
				System.out.println(mc.searchName(name)[i].inform());
			}
			System.out.println();
		}
	}
	
	public void searchEmail() {
		System.out.print("�˻��� �̸��� : ");
		String email = sc.nextLine();
		int cnt =0;
		for(int i =0; i<mc.searchEmail(email).length; i++) {
			if(mc.searchEmail(email)[i]!=null) {
				cnt++;
			}
		}
		if(cnt==0) {
			System.out.println("�˻� ����� �����ϴ�.\n");
		}
		else {
			System.out.println("ã���� ȸ�� ��ȸ ����Դϴ�.");
			for(int i=0; i<cnt; i++) {
				System.out.println(mc.searchEmail(email)[i].inform());
			}
			System.out.println();
		}
	}
	
	public void updateMember() {
		System.out.println("1. ��й�ȣ �����ϱ�");
		System.out.println("2. �̸� �����ϱ�");
		System.out.println("3. �̸��� �����ϱ�");
		System.out.println("9. �������� ���ư���");
		System.out.print("�޴� ��ȣ : ");
		int menuItem = Integer.parseInt(sc.nextLine());
		
		switch(menuItem) {
		case 1: updatePassword(); break;
		case 2: updateName(); break;
		case 3: updateEmail(); break;
		case 9:
			System.out.println("�������� ���ư��ϴ�.\n");
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.\n");
		}
	}
	
	public void updatePassword() {
		System.out.print("������ ȸ���� ���̵� : ");
		String id = sc.nextLine();
		System.out.print("������ ��й�ȣ : ");
		String password = sc.nextLine();
		if(mc.updatePassword(id, password)==true) {
			System.out.println("������ ���������� �Ǿ����ϴ�.\n");
		}
		else {
			System.out.println("�������� �ʴ� ���̵��Դϴ�.\n");
		}
	}
	
	public void updateName() {
		System.out.print("������ ȸ���� ���̵� : ");
		String id = sc.nextLine();
		System.out.print("������ �̸� : ");
		String name = sc.nextLine();
		if(mc.updateName(id, name)==true) {
			System.out.println("������ ���������� �Ǿ����ϴ�.\n");
		}
		else {
			System.out.println("�������� �ʴ� ���̵��Դϴ�.\n");
		}
	}
	
	public void updateEmail() {
		System.out.print("������ ȸ���� ���̵� : ");
		String id = sc.nextLine();
		System.out.print("������ �̸��� : ");
		String email = sc.nextLine();
		if(mc.updateEmail(id, email)==true) {
			System.out.println("������ ���������� �Ǿ����ϴ�.\n");
		}
		else {
			System.out.println("�������� �ʴ� ���̵��Դϴ�.\n");
		}
	}
	
	public void deleteMember() {
		System.out.println("1. Ư�� ȸ�� �����ϱ�");
		System.out.println("2. ��� ȸ�� �����ϱ�");
		System.out.println("9. �������� ���ư���");
		System.out.print("�޴� ��ȣ : ");
		int menuItem = Integer.parseInt(sc.nextLine());
		
		switch(menuItem) {
		case 1: deleteOne(); break;
		case 2: deleteAll(); break;
		case 9:
			System.out.println("�������� ���ư��ϴ�.\n");
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.\n");
		}
	}
	
	public void deleteOne() {
		System.out.print("������ ȸ���� ���̵� : ");
		String id = sc.nextLine();
		System.out.print("���� �����Ͻðڽ��ϱ�?(y/n) : ");
		char isCheck = sc.nextLine().charAt(0);
		if(isCheck=='y'||isCheck=='y') {
			if(mc.delete(id)==true){
				System.out.println("���������� �����Ͽ����ϴ�.\n");
			}
			else {
				System.out.println("�������� �ʴ� ���̵��Դϴ�.\n");
			}
		}
		else if(isCheck=='n'||isCheck=='N'){
			System.out.println("���θ޴��� ���ư��ϴ�.\n");
		}
		else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ���θ޴��� ���ư��ϴ�.\n");
		}
	}
	
	public void deleteAll() {
		System.out.print("���� �����Ͻðڽ��ϱ�?(y/n) : ");
		char isCheck = sc.nextLine().charAt(0);
		if(isCheck=='y'||isCheck=='y') {
			mc.delete();
			System.out.println("���������� �����Ͽ����ϴ�.\n");
		}
		else if(isCheck=='n'||isCheck=='N'){
			System.out.println("���θ޴��� ���ư��ϴ�.\n");
		}
		else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ���θ޴��� ���ư��ϴ�.\n");
		}
	}
	
	public void printAll() {
		int cnt=0;
		
		if(mc.printAll()==null) {
			System.out.println("����� ȸ���� �����ϴ�.\n");
		}
		else{
			for(int i=0; i<mc.printAll().length; i++) {	
				if(mc.printAll()[i]!=null) {
					System.out.println(mc.printAll()[i].inform());
					cnt++;
				}
			}
			if(cnt == 0)
				System.out.println("����� ȸ���� �����ϴ�.\n");
			System.out.println();
		}
	}
	
}
