package com.kh.example.list.model.vo;

public class Student implements Comparable<Student> {
	private String name;
	private int score;
	
	public Student() {}
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getScore() {
		return score;
	}
	
	@Override
	public String toString() {
		return name+"("+score+"��)";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31; // 31�� ��ǻ�Ͱ� �������� �� ����ϱ� �����鼭 ������ ū �Ҽ��Դϴ�.
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());	// ������ ������ �� �̷��� ���׿����ڸ� �̿��ϰ�
		result = prime * result + score;									// �⺻�� �ڷ����� �� �̷��� �׳� ���ϸ� ��
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		/* ��ü ��ü�� ���� �κ� */
		if(this == obj) { // this�� �� �ּҰ��� ��� �ִ� ���۷��� ����
			return true;	// �Ű������� ���� ��ü�� �ּҰ��� �� �ּҰ��� ������ ���� ������ ����
		}
		if(obj == null) {
			return false;	// ���� ��ü�� null�̸� ���� ���� ���� ������ false
		}
		if(getClass() != obj.getClass()) {	// getClass() : �� Ŭ������ ���� ������ ��� �ִ� �޼ҵ�
			return false;
		}
		
		/* �ʵ忡 ���ؼ� �� */
		Student other = (Student)obj;
		if(name == null) {				// ������ ������ �� �̷��� ���� null�� �ƴ������� �˻��ؾ���
			if(other.name != null) {	// ���� ������ �ִ� name�� null�϶� ������ name�� null�� �ƴϸ� �ٸ���
				return false;
			}
		} else if(!name.equals(other.name)) {	// ���� ������ �ִ� null�� �ƴϸ鼭 ������ name�̶� ���� ������ �ٸ���
			return false;
		}
		
		if(score != other.score) {		// �⺻�� �ڷ����϶� �̷��� �񱳸� �ϸ� ��
			return false;
		}
		
		return true;
	}

	@Override
	public int compareTo(Student o) {
		// �̸��� ���ؼ� �������� ����
		// �̸� ==> String
		// ==> String�� ���� �������� ����
		
		String othername = o.getName();
		
		/*
			compareTo�� ��ȯ �� : int
			�� ��ü�� �� ���� ������ 0 ��ȯ
			�� ��ü�� �� ��󺸴� ũ�� 1 ��ȯ
			�� ��ü�� �� ��󺸴� ������ -1 ��ȯ
		 */
		
		return name.compareTo(othername);	// ���������� �ÿ��� �տ� -�� ������ ��
	}
}
