package com.kh.example.chap02_abstractInterface.family.model.vo;

import java.io.Serializable;

public interface Basic extends Cloneable, Serializable{
	//						   ----------------------- ==> Marker Interface
	// 													: �� ��Ŀ �������̽��� ��ӹ��� Ŭ������ �̷��� Ư���� �־�� ��� ǥ�ø� �����ش�.
	/*public abstract*/ void eat();
	/*public abstract*/ void sleep(); 
}
