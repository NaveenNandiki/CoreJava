package com.dsaProblems.patterns;

public class HallowPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		System.out.println("1st Way");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
//				if ((i + j) == (n - 1) || i == j && (i + j) >= n - 1 || i == n - 1)
				if ((i + j) == (n - 1) && i >= (n / 2) || i == j && (i + j) >= n - 1 || i == n - 1) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("2nd Way");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= (2 * i); j++) {
				if (j == 0 || i == (n - 1) || j == (2 * i)) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
