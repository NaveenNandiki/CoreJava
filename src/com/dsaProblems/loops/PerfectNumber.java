package com.dsaProblems.loops;

import java.util.Scanner;

public class PerfectNumber {

//	static boolean isPerfectnumber(int n) {
//		int sum = 0;
//		for (int i = 1; i <= n / 2; i++) {
//			if (n % i == 0) {
//				sum += i;
//			}
//		}
//		return sum == n;
//	}

	static boolean isPerfectnumber(int n) {
		int sum = 1;
		for (int i = 2; i <= (int) Math.sqrt(n); i++) {
			if (n % i == 0) {
				sum += i;
				if (i != n / i)
					sum += n / i;
			}
		}
		return sum == n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		if (isPerfectnumber(n))
			System.out.println("Perfect Number");
		else
			System.out.println("Not aPerfect Number");
	}

}
