package com.dsaProblems.loops;

import java.util.Scanner;

public class FibonacciSeries {

	static void printFibonacci(int n) {
		int n1 = 0;
		int n2 = 1;
		System.out.print(n1 + " " + n2);
		for (int i = 3; i <= n; i++) {
			int n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		printFibonacci(n);
	}

}
