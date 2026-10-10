package com.Labprograms.logicalStatements.patterns;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n - i - 1; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < 2 * i + 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for (int i = 1; i < n; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print(" ");
//			}
//			// for (int j = i; j < 2 * n - i - 1; j++) {
//			for (int j = 0; j < 2 * (n - i) - 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// Second Way
		int space = n - 1;
		int star = 1;
		for (int i = 0; i < (2 * n) - 1; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}
			if (i < n - 1) {
				space--;
				star += 2;
			} else {
				space++;
				star -= 2;
			}
			System.out.println();
		}
		sc.close();
	}

}
