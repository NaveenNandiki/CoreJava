package com.Labprograms.logicalStatements;

import java.util.Scanner;

public class Palindrome {

	static boolean isPrime(int n) {
		int temp = n;
		int rev = 0;
		while (n > 0) {
			int r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;
		}
		return temp == rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		if (isPrime(n))
			System.out.println("Given Number is Prime");
		else
			System.out.println("Given Number is Not Prime Number");
		sc.close();
	}

}
