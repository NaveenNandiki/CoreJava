package com.Labprograms.logicalStatements;

import java.util.Scanner;

public class StrongNumber {

	static int fact(int n) {
		if (n == 1 || n == 0)
			return 1;
		return n * fact(n - 1);
	}

	static boolean isStrongNum(int n) {
		int sum = 0;
		int temp = n;
		while (n != 0) {
			int r = n % 10;
			sum = sum + fact(r);
			n = n / 10;
		}
		return sum == temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		if (isStrongNum(n))
			System.out.println("Given Number is Strong Number");
		else
			System.out.println("Given Number is Not Strong Number");
	}

}
