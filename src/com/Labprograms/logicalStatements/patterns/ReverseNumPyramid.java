package com.Labprograms.logicalStatements.patterns;

import java.util.Scanner;

public class ReverseNumPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = n; j > n - i - 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
