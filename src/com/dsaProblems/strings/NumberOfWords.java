package com.dsaProblems.strings;

import java.util.Scanner;

public class NumberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		String[] Sarr = str.split(" ");
		System.out.println(Sarr.length);
	}

}
