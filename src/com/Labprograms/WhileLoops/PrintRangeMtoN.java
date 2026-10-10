package com.Labprograms.WhileLoops;

import java.util.Scanner;

public class PrintRangeMtoN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting value");
		int m = sc.nextInt();
		System.out.println("Enter Ending Value");
		int n = sc.nextInt();
		while (m < n) {
			System.out.println(m + "");
			m++;
		}
	}

}
