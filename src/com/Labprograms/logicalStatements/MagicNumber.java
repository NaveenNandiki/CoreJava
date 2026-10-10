package com.Labprograms.logicalStatements;

import java.util.Scanner;

public class MagicNumber {

	static boolean isMagicNum(int n) {
		int sum = 0;
		while (n != 0) {
			int r = n % 10;
			n = n / 10;
			sum = sum + r;
			if (n == 0) {
				if (sum <= 9)
					break;
				else {
					n = sum;
					sum = 0;
				}
			}
		}
		System.out.println(sum);
		return sum == 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		if (isMagicNum(n))
			System.out.println("Magic Number");
		else
			System.out.println("Not Magic Number");

	}

}
