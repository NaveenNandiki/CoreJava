package com.dsaProblems.strings;

import java.util.Scanner;

public class RemoveSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		System.out.println(str);
		String resultString = str.trim();
		System.out.println(resultString);
		System.out.println(str.strip());
//		String s = "\u2003Naveen\u2003";
		String s = str;
		System.out.println("[" + s.trim() + "]");
		System.out.println("[" + s.strip() + "]");
		System.out.println(s.replace(" ", ""));
	}

}
