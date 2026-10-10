package com.dsaProblems.strings;

import java.util.Scanner;

public class CountUpperLowerDigitSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.nextLine();
		int i = 0;
		int dcount = 0;
		int ucount = 0;
		int lcount = 0;
		int scount = 0;
		while (i < s.length()) {
			if (Character.isDigit(s.charAt(i))) {
				dcount++;
			} else if (Character.isUpperCase(s.charAt(i))) {
				ucount++;
			} else if (Character.isLowerCase(s.charAt(i))) {
				lcount++;
			} else {
				scount++;
			}
			i++;
		}
		System.out.println("Digit Count " + dcount);
		System.out.println("Upper Case Count " + ucount);
		System.out.println("Lower case Count " + lcount);
		System.out.println("Special Character Count " + scount);
	}

}
