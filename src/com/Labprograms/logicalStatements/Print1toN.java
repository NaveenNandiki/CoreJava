package com.Labprograms.logicalStatements;

import java.util.Scanner;

public class Print1toN {
	static void printNumbers(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you want?");
		int n = sc.nextInt();
		printNumbers(n);
	}

}
