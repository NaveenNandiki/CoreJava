package com.Labprograms.logicalStatements;

import java.util.ArrayList;
import java.util.Vector;

public class VowelsLowerCase {
//	String a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (ch == 'a') {
				System.out.print("a ");
			} else if (ch == 'e') {
				System.out.print("e ");
			} else if (ch == 'i') {
				System.out.print("i ");
			} else if (ch == 'o') {
				System.out.print("o ");
			} else if (ch == 'u') {
				System.out.println("u ");
			}
		}
		ArrayList<Integer> a = new ArrayList<>();
		System.out.println(a.size());
		Vector v = new Vector();
		System.out.println(v.capacity());
	}

}
