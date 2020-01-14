package com.kh.practice.leap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	public LeapView() {
		LeapController lc = new LeapController();
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		
		String str = "";
		
		if(lc.isLeapYear(year)==true)
			str = "����";
		else 
			str = "���";
		
		System.out.println(year+"���� "+str+"�Դϴ�.");
		System.out.println("�� ��¥ �� : "+lc.leapDate(c));
	}
	
}
