package com.Labprograms.operators;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		if ((n & 1) == 0) {
			System.out.println("Even number");
		} else {
			System.out.println("Odd Number");
		}

	}

}
