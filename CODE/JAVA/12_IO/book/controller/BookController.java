package com.kh.practice.book.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import com.kh.practice.book.model.dao.BookDAO;
import com.kh.practice.book.model.vo.Book;

public class BookController {
	private BookDAO bd = new BookDAO();
	
	public void makeFile() {
		try(FileInputStream fr = new FileInputStream("book.txt")){	// ������ �ִٸ� �Ѿ
			
		} catch(FileNotFoundException e) {		// ������ ���ٸ� ����
			try(FileWriter fw = new FileWriter("book.txt")){
				
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileSave(Book[] bArr) {
		bd.fileSave(bArr);
	}
	
	public Book[] fileRead() {
		return bd.fileRead();
	}
}
