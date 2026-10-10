package com.Labprograms.logicalStatements;

import java.util.Scanner;

public class Sum1toN {

	static int sum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How many numbers you want to sum?");
		int n = sc.nextInt();
		int result = sum(n);
		System.out.println("Sum(1 to " + n + ")= " + result);
	}
}
