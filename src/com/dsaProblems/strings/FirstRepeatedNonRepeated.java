package com.dsaProblems.strings;

import java.util.Scanner;

public class FirstRepeatedNonRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Two Approaches
		// Non Optimized O(n^2)
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();

		for (int i = 0; i < str.length() - 1; i++) {
			boolean Rflag = false;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					Rflag = true;
					break;
				}
			}
			if (Rflag) {
				System.out.println("First Repeated " + str.charAt(i));
				break;
			}
		}

		for (int i = 0; i < str.length() - 1; i++) {
			boolean Nrflag = false;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					Nrflag = true;
					break;
				}
			}
			if (!Nrflag) {
				System.out.println("First Non Repeated " + str.charAt(i));
				break;
			}
		}

		/// another Optimized approach O(n)
		int[] freq = new int[256];
		for (int i = 0; i < str.length(); i++) {
			freq[str.charAt(i)]++;
		}

		for (int i = 0; i < str.length(); i++) {
			if (freq[str.charAt(i)] > 1) {
				System.out.println("First Repeated Character " + str.charAt(i));
				break;
			}
		}
		for (int i = 0; i < str.length(); i++) {
			if (freq[str.charAt(i)] == 1) {
				System.out.println("First Non Repeated Character " + str.charAt(i));
				break;
			}
		}
	}

}
