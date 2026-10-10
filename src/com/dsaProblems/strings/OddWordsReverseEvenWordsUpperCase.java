package com.dsaProblems.strings;

import java.util.Scanner;

public class OddWordsReverseEvenWordsUpperCase {

	static String reverse(String str) {
		StringBuilder s = new StringBuilder(str.length());
		for (int i = str.length() - 1; i >= 0; i--) {
			s.append(str.charAt(i));
		}
		return new String(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String[] str = sc.nextLine().split(" ");
		int count = 0;
		for (String s : str) {
			if (++count % 2 == 0) {
				System.out.print(reverse(s) + " ");
			} else {
				System.out.print(s.toUpperCase() + " ");
			}
		}

	}

}
