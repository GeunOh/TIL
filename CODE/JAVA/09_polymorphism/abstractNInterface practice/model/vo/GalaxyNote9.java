package com.kh.practice.chap02_abstractNInterface.model.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen{

	public GalaxyNote9() {
		super.setMaker("�Ｚ");
	}
	@Override
	public String charge() {
		// TODO Auto-generated method stub
		return "�������, ��� ���� ����\n";
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
		return "1200�� ��� ī�޶�\n";
	}

	@Override
	public String touch() {
		// TODO Auto-generated method stub
		return "������, ������ ����\n";
	}

	@Override
	public boolean bluetoothPen() {
		// TODO Auto-generated method stub
		return PEN_BUTTON;
	}

	@Override
	public String printInformation() {
		// TODO Auto-generated method stub
		return "������ ��Ʈ9�� "+super.getMaker()+"���� ��������� ������ ������ ����.\n"+
				makeCall()+takeCall()+picture()+charge()+touch()+"������� �� ž�� ���� : "+bluetoothPen()+"\n";
	}
	

}
