package com.Labprograms.logicalStatements;

import java.util.Scanner;

public class PrimePositionPrimeNumber {

	static boolean isPrime(int n) {
		if (n == 0 || n == 1)
			return false;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (isPrime(i)) {
				count++;
//				System.out.print(i + " ");
				if (isPrime(count)) {
					System.out.print(i + " ");
				}

			}
		}

	}

}
