package com.Labprograms.dsa;

import java.util.Scanner;

public class RomToDec {

	static int value(char ch) {
		switch (ch) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return -1;
		}
	}

	static boolean validSubtraction(char a, char b) {
		return (a == 'I' && (b == 'V' || b == 'X')) || (a == 'X' && (b == 'L' || b == 'C'))
				|| (a == 'C' && (b == 'D' || b == 'M'));
	}

	static int romanToDecimal(String s) {

		if (s == null || s.length() == 0)
			return -1;

		int sum = 0;
		int repeat = 1;

		for (int i = 0; i < s.length(); i++) {

			char currChar = s.charAt(i);
			int curr = value(currChar);

			// Invalid character
			if (curr == -1)
				return -1;

			// Repetition check
			if (i > 0 && currChar == s.charAt(i - 1)) {

				repeat++;

				// V, L, D cannot repeat
				if (currChar == 'V' || currChar == 'L' || currChar == 'D')
					return -1;

				// I, X, C, M cannot repeat more than 3 times
				if (repeat > 3)
					return -1;

			} else {
				repeat = 1;
			}

			// Compare with next symbol
			if (i < s.length() - 1) {

				char nextChar = s.charAt(i + 1);
				int next = value(nextChar);

				if (next == -1)
					return -1;

				if (curr < next) {

					// Invalid subtraction
					if (!validSubtraction(currChar, nextChar))
						return -1;

					// Reject IIV, XXC, CCM
					if (repeat > 1)
						return -1;

					sum -= curr;
				} else {
					sum += curr;
				}

			} else {
				sum += curr;
			}
		}

		return sum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Roman Numeral: ");
		String input = sc.next().toUpperCase();

		int ans = romanToDecimal(input);

		if (ans == -1)
			System.out.println("Invalid Roman Numeral");
		else
			System.out.println("Decimal = " + ans);

		sc.close();
	}
}