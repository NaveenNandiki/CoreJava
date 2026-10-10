package com.Labprograms.logicalStatements;

import java.util.Scanner;

public class PerfectNumber {

	static boolean isPerfect(int n) {
		int i = 1;
		if (n == 0)
			return false;
		int sum = 0;
		int temp = n;
		while (i < n) {
			if (n % i == 0) {
				sum += i;
			}
			i++;
		}
		return sum == temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		if (isPerfect(n))
			System.out.println("Given Number is Perfect Number");
		else
			System.out.println("Given Number is Not Perfect Number");

	}

}
