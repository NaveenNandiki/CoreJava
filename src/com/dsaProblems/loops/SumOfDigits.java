package com.dsaProblems.loops;

import java.util.Scanner;

public class SumOfDigits {

	static int sumOfDigits(int n) {
		int sum = 0;
		while (n != 0) {
			int r = n % 10;
			sum += r;
			n = n / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int sum = sumOfDigits(n);
		System.out.println("Sum of Digits in the given number is " + sum);
	}

}
