package com.dsaProblems.strings;

import java.util.Scanner;

public class MaxLengthWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String[] str = sc.nextLine().split(" ");
		int max = str[0].length();
		String maxword = str[0];
		for (String s : str) {// to avoid first iteration change to for(int i=1;i<str.length();i++)loop
			if (s.length() > max) {
				max = s.length();
				maxword = s;
			}
		}
		System.out.println("Maximum Length Word is " + maxword);

	}

}
