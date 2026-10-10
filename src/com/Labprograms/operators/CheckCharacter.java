package com.Labprograms.operators;

import java.util.Scanner;

public class CheckCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter charater");
		char ch = sc.next().charAt(0);
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("Upper case");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println("Lower case");
		} else if (ch >= '0' && ch <= '9') {
			System.out.println("Digit");
		} else {
			System.out.println("Special Charater");
		}

	}

}
