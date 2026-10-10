package com.dsaProblems.loops;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		int digitCount = digitCount(n);
		System.out.println("There are \"" + digitCount + "\" Digits in Your number");
		sc.close();
	}

	private static int digitCount(int n) {
		// TODO Auto-generated method stub
		int count = 0;
		while (n != 0) {
			n = n / 10;
			count++;
		}
		return count;
	}

}
