package com.kh.practice.chap02_abstractNInterface.model.vo;

public class V40 extends SmartPhone implements NotePen{
	
	public V40() {
		super.setMaker("LG");
	}

	@Override
	public String charge() {
		// TODO Auto-generated method stub
		return "��� ����, ��� ���� ����\n";
	}

	@Override
	public String makeCall() {
		// TODO Auto-generated method stub
		return "��ȣ�� ������ ��ȭ��ư�� ����\n";
	}

	@Override
	public String takeCall() {
		// TODO Auto-generated method stub
		return "���� ��ư�� ����\n";
	}

	@Override
	public String picture() {
		// TODO Auto-generated method stub
		return "1200, 1600�� Ʈ���� ī�޶�\n";
	}

	@Override
	public String touch() {
		// TODO Auto-generated method stub
		return "������\n";
	}

	@Override
	public boolean bluetoothPen() {
		// TODO Auto-generated method stub
		return !PEN_BUTTON;
	}

	@Override
	public String printInformation() {
		// TODO Auto-generated method stub
		return "V40�� "+super.getMaker()+"���� ��������� ������ ������ ����.\n"+
		makeCall()+takeCall()+picture()+charge()+touch()+"������� �� ž�� ���� : "+bluetoothPen()+"\n";
	}
	
}
