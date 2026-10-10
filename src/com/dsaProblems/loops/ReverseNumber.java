package com.dsaProblems.loops;

import java.util.Scanner;

public class ReverseNumber {

	private static int reverseNumber(int n) {
		int rev = 0;
		while (n != 0) {
			int r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int reverse = reverseNumber(n);
		System.out.println("Reverse of the Given number is " + reverse);
		sc.close();
	}

}
