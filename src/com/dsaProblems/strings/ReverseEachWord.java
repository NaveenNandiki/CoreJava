package com.dsaProblems.strings;

import java.util.Scanner;

public class ReverseEachWord {

	// time complexity O(n^2)
//	static String stringRev(String s) {
//		String str = "";
//		for (int i = 0; i < s.length(); i++)
//			str = s.charAt(i) + str;
//		return str;
//	}

	// optimized to O(n)
	static StringBuilder stringRev(String s) {
		StringBuilder str = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--)
			str.append(s.charAt(i));
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String[] s = sc.nextLine().split(" ");

		// approach 1
		for (String str : s) {
			System.out.print(new StringBuilder(str).reverse() + " ");
		}

		System.out.println();

		// approach 2
		for (String str : s) {
			System.out.print(stringRev(str) + " ");
		}

	}

}
