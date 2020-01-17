package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("***** My Note *****");
			System.out.println("1. ��Ʈ ���� �����");
			System.out.println("2. ��Ʈ ����");
			System.out.println("3. ��Ʈ ��� �����ϱ�");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ : ");
			int menuItem = Integer.parseInt(sc.nextLine());
			
			switch(menuItem) {
			case 1: fileSave(); break;
			case 2: fileOpen(); break;
			case 3: fileEdit(); break;
			case 9: System.out.println("���α׷��� �����մϴ�."); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.\n");
			}
			if(menuItem == 9)
				break;
		}
		
	}
	
	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			System.out.println("���Ͽ� ������ ������ �Է��ϼ���.");
			System.out.println("ex��it �̶�� �Է��ϸ� ����˴ϴ�.");
			System.out.print("���� : ");
			String str = sc.nextLine();
			if(str.equals("ex��it")) {
				while(true) {
					System.out.print("������ ���� ���� �Է����ּ���(ex. myFile.txt) : ");
					String file = sc.nextLine();
					if(fc.checkName(file) == true) {
						System.out.print("�̹� �����ϴ� �����Դϴ�. ����ðڽ��ϱ�?(y/n) : ");
						char isCheck = sc.nextLine().charAt(0);
						if(isCheck=='y'||isCheck=='y') {
							fc.fileSave(file, sb);
							break;
						}
					}
					else {
						fc.fileSave(file, sb);
						break;
					}
				}
				break;
			}
			else{
				sb.append(str);
				sb.append("\n");
			}
		}
	}
	
	public void fileOpen() {
		System.out.print("�� ���� �� : ");
		String file = sc.nextLine();
		
		if(fc.checkName(file)== true) {
			System.out.println(fc.fileOpen(file));
		}
		else {
			System.out.println("���� �����Դϴ�.\n");
		}
	}
	
	public void fileEdit() {
		System.out.print("������ ���� �� : ");
		String file = sc.nextLine();
		
		if(fc.checkName(file)==false) {
			System.out.println("���� �����Դϴ�. \n");
		}
		else {
			StringBuilder sb = new StringBuilder();
			while(true) {
				System.out.println("���Ͽ� ������ ������ �Է��ϼ���.");
				System.out.println("ex��it �̶�� �Է��ϸ� ����˴ϴ�.");
				System.out.print("���� : ");
				String str = sc.nextLine();
				
				if(str.equals("ex��it")) {
					fc.fileEdit(file, sb);
					break;
				}
				else{
					sb.append(str);
					sb.append("\n");
				}
			}
		}
	}
}
