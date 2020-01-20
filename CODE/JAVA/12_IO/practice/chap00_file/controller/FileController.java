package com.kh.example.chap00_file.controller;

import java.io.File;
import java.io.IOException;

public class FileController {
	public void method1() {
		
		try {
			File f1 = new File("test.txt");
			f1.createNewFile();
			
			File f2 = new File("c:/test/test.txt");
			f2.createNewFile();
			
			File f3 = new File("c:\\temp3\\temp2");
			File f4 = new File("c:\\temp3\\temp2\\test.txt");
			f3.mkdirs();
			f4.createNewFile();
			f4.delete();
			
			System.out.println(f2.exists()); // true : �����̵� ������ �����ϸ� true ��ȯ
			System.out.println(f3.exists()); // true
			System.out.println(f3.isFile()); // false : exists()�� �ٸ��� ���ϸ� ���翩�� Ȯ��
			
			// �� �� �޼ҵ��
			System.out.println("���� �� : "+f1.getName()); // test.txt
			System.out.println("���� ���� ��� : "+ f1.getAbsolutePath()); // D:\1_java_workspace\13_IO\test.txt
			System.out.println("���� ��� ��� : "+ f1.getPath()); // test.txt
			
			System.out.println("���� �뷮 : " + f1.length()); // 0
 			System.out.println("f1 ���� ���� : "+ f1.getParent()); // null
			System.out.println("f4 ���� ���� : " + f4.getParent()); // c:\temp3\temp2
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
