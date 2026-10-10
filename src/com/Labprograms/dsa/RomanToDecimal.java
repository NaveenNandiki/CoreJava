package com.Labprograms.dsa;

import java.util.Scanner;

public class RomanToDecimal {

	public static boolean isValidSubtraction(char ch1, char ch2) {

		return (ch1 == 'I' && (ch2 == 'V' || ch2 == 'X')) || (ch1 == 'X' && (ch2 == 'L' || ch2 == 'C'))
				|| (ch1 == 'C' && (ch2 == 'D' || ch2 == 'M'));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Romman Number");
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine().toUpperCase();
		// char[] rom= {'I','V','X','L','C','D','M'};
		String rom = "IVXLCDM";
		int sum = 0;
		int[] dec = { 1, 5, 10, 50, 100, 500, 1000 };
		for (int i = 0; i < in.length(); i++) {

			int num1 = dec[rom.indexOf(in.charAt(i))];
			if (i == in.length() - 1) {
				sum += num1;
			} else {
				int num2 = dec[rom.indexOf(in.charAt(i + 1))];
				if (num1 < num2) {
					if (!isValidSubtraction(in.charAt(i), in.charAt(i + 1))) {
						System.out.println("Invalid Roman Numeral");
						return;
					}
					sum -= num1;
				} else
					sum += num1;
			}

		}
		System.out.println(sum);

	}

}
