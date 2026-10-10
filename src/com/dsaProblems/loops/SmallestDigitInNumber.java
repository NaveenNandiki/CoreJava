package com.dsaProblems.loops;

import java.util.Scanner;

public class SmallestDigitInNumber {

	static int MinDigit(int n) {
		int min = Integer.MAX_VALUE;
		while (n != 0) {
			int r = n % 10;
			min = Math.min(min, r);
			n = n / 10;
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int minDigit = MinDigit(n);
		System.out.println("Smallest Digit Of this number is " + minDigit);
	}
}
