package com.Labprograms.logicalStatements.patterns;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n - i - 1; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < i + 1; j++) {
//				System.out.print("*");
//			}
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// Second Way
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= n - i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= 2 * i - 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// Third Way
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
