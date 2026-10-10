package com.dsaProblems.patterns;

import java.util.Scanner;

public class FloydsTriangle {

	static void printFloydsTriangle(int n) {
		int count = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(count++ + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range");
		int n = sc.nextInt();
		printFloydsTriangle(n);
		sc.close();

	}

}
