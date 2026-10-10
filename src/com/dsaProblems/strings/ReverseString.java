package com.dsaProblems.strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		// wrong approach
//		for (int i = 0; i < str.length(); i++) {
//			char temp = str.charAt(i);
//			str.replace(temp, str.charAt(str.length() - i - 1));
//			str.replace(str.charAt(str.length() - i - 1), temp);
//		}
//		System.out.println(str);

		// not for interview
		StringBuilder s = new StringBuilder(str);
		System.out.println(s.reverse());

		// using charArray[]
		char[] carr = str.toCharArray();
		for (int i = 0; i < carr.length / 2; i++) {
			char temp = carr[i];
			carr[i] = carr[carr.length - i - 1];
			carr[carr.length - i - 1] = temp;
		}
		// System.out.println(Arrays.toString(carr));
		System.out.println(new String(carr));
	}

}
