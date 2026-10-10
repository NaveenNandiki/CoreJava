package com.dsaProblems.loops;

import java.util.Scanner;

public class ProductOfDigits {

	static int productOfDigits(int n) {
		int pro = 1;
		while (n != 0) {
			int r = n % 10;
			pro *= r;
			n = n / 10;
		}
		return pro;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int pro = productOfDigits(n);
		System.out.println("Product of Digits in the given number is " + pro);
	}

}
