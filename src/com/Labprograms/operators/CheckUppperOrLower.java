package com.Labprograms.operators;

import java.util.Scanner;

public class CheckUppperOrLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter charater");
		char ch = sc.nextLine().charAt(0);
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("Upper Case");
			System.out.println("Lower Case is  " + (char) (ch + 32));
		} else {
			System.out.println("Lower Case");
			System.out.println("Upper Case is  " + (char) (ch - 32));
		}

	}

}
