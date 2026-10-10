package com.dsaProblems.loops;

import java.util.Scanner;

public class StrongNumber {

	private static int factorial(int n) {
		if (n == 0 || n == 1)
			return 1;
		return n * factorial(n - 1);
	}

	private static boolean isStrongNumber(int n) {
		int sum = 0;
		int temp = n;
		while (n != 0) {
			int dig = n % 10;
			sum += factorial(dig);
			n = n / 10;
		}
		return sum == temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		if (isStrongNumber(n))
			System.out.println("Strong Number");
		else
			System.out.println("Not a Strong Number");
	}

}
