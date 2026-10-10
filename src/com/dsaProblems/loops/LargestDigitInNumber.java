package com.dsaProblems.loops;

import java.util.Scanner;

public class LargestDigitInNumber {

	static int largestDigit(int n) {
		int max = 0;
		while (n != 0) {
			int r = n % 10;
			max = Math.max(max, r);
			n = n / 10;
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range");
		int n = sc.nextInt();
		int largeDigit = largestDigit(n);
		System.out.println("Largest Digit Of this number is " + largeDigit);
		sc.close();
	}

}
