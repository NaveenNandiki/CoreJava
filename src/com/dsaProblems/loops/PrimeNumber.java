package com.dsaProblems.loops;

import java.util.Scanner;

public class PrimeNumber {

	static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		if (n == 2)
			return true;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		if (isPrime(n))
			System.out.println("Prime Number");
		else
			System.out.println("Not Prime Number");
	}

}
