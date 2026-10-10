package com.dsaProblems.loops;

import java.util.Scanner;

public class CheckPalindromeNumber {

	private static int reverseNumber(int n) {
		int rev = 0;
		while (n != 0) {
			int r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;
		}
		return rev;
	}

	static boolean isPalindrome(int n) {
		int reverse = reverseNumber(n);
		return reverse == n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n = sc.nextInt();
		if (isPalindrome(n))
			System.out.println("Palindrome Number");
		else
			System.out.println("Not a palindrome Number");
		sc.close();

	}

}
