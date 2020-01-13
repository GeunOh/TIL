package practice3.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {
	public static void main(String[] args) {
		Animal[] a = new Animal[5];
		a[0] = new Dog("�κ�","��Ƽ��",4);
		a[1] = new Cat("����","��ġŲ","����","���");
		a[2] = new Cat("�˸�","����ũ��","�ε�","���");
		a[3] = new Dog("ȫ��","���޶�Ͼ�",3);
		a[4] = new Dog("����","Ǫ��",4);
		
		for(int i =0; i<a.length; i++) {
			if( a[i] instanceof Dog) {
				((Dog)a[i]).speak();
			} else if( a[i] instanceof Cat) {
				((Cat)a[i]).speak();
			}
		}
	}
}
