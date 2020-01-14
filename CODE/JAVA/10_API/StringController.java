package com.kh.example.chap01_String.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class StringController {
	public void method1() {
		String str1 = "java";
		String str2 = str1;
		String str3 = new String("java");
		
		
		System.out.println("str1�� str2�� �ּҴ� ������? : "+(str1 == str2));	// true
		System.out.println("str1�� str3�� �ּҴ� ������? : "+(str1 == str3));	// false
		
		System.out.println("str1�� hashCode : "+str1.hashCode());		// 3254818
		System.out.println("str2�� hashCode : "+str2.hashCode());		// 3254818
		System.out.println("str3�� hashCode : "+str3.hashCode());		// 3254818
		
		System.out.println("str1�� ���ּҰ� : "+System.identityHashCode(str1));	// 366712642
		System.out.println("str2�� ���ּҰ� : "+System.identityHashCode(str2));	// 366712642
		System.out.println("str3�� ���ּҰ� : "+System.identityHashCode(str3));	// 1829164700
		
		str2 += "oracle";
		System.out.println("str1�� str2�� �ּҴ� ������? : "+(str1==str2));		// false
		System.out.println("str1�� ���ּҰ� : "+System.identityHashCode(str1));	// 366712642
		System.out.println("str2�� ���ּҰ� : "+System.identityHashCode(str2));	// 2018699554
		System.out.println("str3�� ���ּҰ� : "+System.identityHashCode(str3));	// 1829164700
	}
	
	public void method2() {
		// StringBuffer Test
		// ����ؼ� ���� �����ؾ��� �� String���� ��� �Һ��̶�� Ư¡ ������ ���� ���� ����� ���� ��ġ�� �ٲ��ֱ� ������
		// ������ �÷��Ͱ� ��� �������ϴ� ������ ����
		// ������ ���� �б⸸ �ϴ� ��쿡�� �Һ� Ŭ������ String Ŭ������ �����ϰ�����
		// �����ؾ��ϴ� ���� ���� ��� StringBuffer�� StringBuilder�� �ϴ°� �� ȿ������
		
		StringBuffer buffer1 = new StringBuffer();
		System.out.println("�ʱ� buffer1�� ���뷮 : "+ buffer1.capacity());	// 16
		System.out.println("buffer1�� ����ִ� ���� ���� ���� : "+buffer1.length()); // 0
		
		System.out.println();
		
		StringBuffer buffer2 = new StringBuffer(100);	
		System.out.println("�ʱ� buffer2�� ���뷮 : "+buffer2.capacity());	// 100
		System.out.println("buffer2�� ����ִ� ���� ���� ���� : "+buffer2.length());	// 0
		
		System.out.println();
		
		StringBuffer buffer3 = new StringBuffer("abc");
		System.out.println("�ʱ� buffer3�� ���뷮 : "+buffer3.capacity());	// 19
		System.out.println("buffer3�� ����ִ� ���� ���� ���� : "+buffer3.length());	// 3
		
		System.out.println();
		
		StringBuilder builder = new StringBuilder("abc");
		System.out.println("�ʱ� builder�� ���뷮 : "+builder.capacity());	// 19
		System.out.println("builder�� ����ִ� ���� ���� ���� : "+builder.length()); // 3
		
		System.out.println();
		
		builder.append("abc").append("def"); // �޼ҵ� ü�̴�
		System.out.println("abc, def �߰� ���� builder : "+builder);	// abcabcdef
		System.out.println("abc, def �߰� ���� builder �뷮 : "+builder.capacity());	// 19
		System.out.println("abc, def �߰� ���� builder ���� : "+builder.length());	// 9

		System.out.println();
		
		builder.insert(2, "zzz");	
		System.out.println("�ε���2�� zzz �߰� ���� builder : "+builder);	// abzzzcabcdef
		
		System.out.println();

		builder.delete(2, 5); // start <= �ε��� < end
		System.out.println("�ε��� 2���� 5���� ���� ����  builder : "+builder);	// abcabcdef

		System.out.println();
		
		builder.reverse();
		System.out.println("reverse ����  builder : "+builder);	// fedcbacba
		
		StringBuilder sb = new StringBuilder("abc");
		sb = sb.append("zzz").insert(2, "yy").reverse().delete(1, 3);	
		
		System.out.println(sb); // zcyyba
	}
	
	public void method3() {
		String str = "Hello World";
		
		// 1. charAt(int index):char
		//    String�� index��° char ��ȯ
		char ch = str.charAt(4);	// o
		System.out.println(ch);
		
		// 2. concat(String str):String
		//    �Ű������� ���� ���� ���� String�� ���� �̾���� ��(String)�� ��ȯ
		String concatStr = str.concat("!!!");
		System.out.println("concatStr : "+concatStr);	// Hello World!!!
		
		str += "!!!";
		System.out.println(str);	// Hello World!!!
		
		// 3. equals():boolean
		System.out.println("concat.equals(str) : "+concatStr.equals(str)); // true
		
		// 4. substring(int beginIndex):String
		//    substring(int beginIndex, int endIndex):String
		//    String�� �Ϻθ� ��ȯ - �Ű������� �ϳ���, �� �ε������� ������ ��ȯ
		//                    - �Ű������� �ΰ���, ���� �ε��� <= ���� < �� �ε���
		System.out.println("str.substring(6) : "+str.substring(6));	// World!!!
		System.out.println("str.substring(0, 5) : "+str.substring(0, 5)); // Hello
		
		// 5. replace(char oldChar, char newChar):String
		//    ���� char�� ���ο� char�� ��ü�Ͽ� ��ȯ
		System.out.println("str.replace('l','e') : "+ str.replace('l', 'e'));	// Heeeo Wored!!!
		
		// 6. toUpperCase()/toLowerCase():String
		//    ��� �빮�� Ȥ�� �ҹ��ڷ� �ٲ� ��ȯ
		System.out.println("str.toUpperCase() : "+ str.toUpperCase());	// HELLO WORLD!!!
		System.out.println("str.toLowerCase() : "+ str.toLowerCase());	// hello world!!!
	
		// 7. equalsIgnoreCase():boolean
		String str2 = "Wonderful";
		String str3 = "wonderful";
		System.out.println("str2.equals(str3) : "+ str2.equals(str3));	// false
		System.out.println("str2.equalsIgnoreCase(str3) : "+ str2.equalsIgnoreCase(str3));	// true
		
		// 8. trim():String
		//    *��/��*�� �ִ� ����(�� ����)�� ������ ���ڿ� ��ȯ
		String str4 = "    Java";
		String str5 = "Java    ";
		String str6 = "    Java    ";
		System.out.println(str4+"| str4.trim() : "+str4.trim());	//     Java| str4.trim() : Java 
		System.out.println(str5+"| str5.trim() : "+str5.trim());	// Java    | str5.trim() : Java
		System.out.println(str6+"| str6.trim() : "+str6.trim());	//     Java    | str6.trim() : Java
		
		// 9. split(String str):String[]
		//    ���ڿ��� �и��Ͽ� �迭�� ��� ��ȯ
		String splitStr = "Java, Oracle, JDBC, Front, Server, Framework";
		String[] splitArr = splitStr.split(", ");
		System.out.println("�и��� ���ڿ� ����(split) : "+splitArr.length);	// �и��� ���ڿ� ����(split) : 6
		
		for(int i=0; i<splitArr.length; i++) {
			System.out.println(splitArr[i]);
		}
		
		// ���� for��(for-each��)/
		for(String s : splitArr) {
			System.out.println(s);
		}
		
		// 9-2. StringBuilder�� split�� ������ ��
		StringBuilder splitStr2 = new StringBuilder("Java, Oracle, JDBC, Front, Server, Framework");

		String[] temp = splitStr2.toString().split(", ");
	
		StringBuilder[] splitArr2 = new StringBuilder[temp.length];
		for(int i = 0; i < splitArr2.length; i++) {
			splitArr2[i] = new StringBuilder();
		}
		for(int i=0; i<temp.length; i++) {
			splitArr2[i].append(temp[i]);
		}
		for(int i=0; i<splitArr2.length; i++) {
			System.out.println(splitArr2[i]);
		}
	}
	
	public void method4() {
		String str = "Java, Oracle, JDBC, Front, Server, Framework";
		StringTokenizer stObj = new StringTokenizer(str,", ");
		System.out.println("�и��� ���ڿ� ���� : "+ stObj.countTokens());
		
		while(stObj.hasMoreTokens()) {
			System.out.println(stObj.nextToken());
		}
		System.out.println("���� ���� ���� ���ڿ� ���� : "+stObj.countTokens());
		
		System.out.println();
		
		String str2 = "Apple,Banana-Cream-Dessert#Egg Fruits";
		StringTokenizer stObj2 = new StringTokenizer(str2,", -*#");
		System.out.println("�и��� ���ڿ� ���� : "+stObj2.countTokens());
		
		while(stObj2.hasMoreTokens()) {
			System.out.println(stObj2.nextToken());
		}
		
		// split()�� StringTokenizer�� ������
		// 1. �и��� ���ڿ��� String[]�� ó���ϰ� ���� �� split() �޼ҵ�
		//    �и��� ���ڿ��� ��ü�� ó���ϰ� ���� �� StringTokenizerŬ����
		// 2. split()�޼ҵ��� �����ڴ� 1��
		//    StringTokenizerŬ������ �����ڴ� ���� ��
	}
}
