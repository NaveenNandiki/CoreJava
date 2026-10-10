package com.Labprograms.WhileLoops;

import java.util.Scanner;

public class Read5EvenValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		Scanner sc = new Scanner(System.in);
		while (count < 5) {
			System.out.println("Enter even number");
			int n = sc.nextInt();
			if ((n & 1) == 0) {
				count++;
			}

		}
		System.out.println("Stop");
		System.out.println("You Entered 5 Even numbers");

	}

}
