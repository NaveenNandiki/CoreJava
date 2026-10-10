package com.Labprograms.logicalStatements;

import java.util.Scanner;

public class PerfectNumbersInRange {

	static boolean isPerfectNumber(int n) {

		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		return sum == n;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range Up to ?");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (isPerfectNumber(i)) {
				System.out.println(i + " Perfect Number");
			} else {
				System.out.println(i + " Not perfect Number");
			}
		}

	}

}
