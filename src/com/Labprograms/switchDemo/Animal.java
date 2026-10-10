package com.Labprograms.switchDemo;

import java.util.Scanner;

public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Domestic Animal");
		System.out.println("2.Wild Animals");
		System.out.println("Select Category");
		int ch = sc.nextInt();
		switch (ch) {
		case 1 -> {
			System.out.println("1.Cow");
			System.out.println("2.Dog");
			System.out.println("Select your choice ");
			int Da = sc.nextInt();
			switch (Da) {
			case 1 -> System.out.println("You Selected Cow Category");
			case 2 -> System.out.println("You Selected Dog Category");
			default -> System.out.println("Invalid category");
			}
		}
		case 2 -> {
			System.out.println("1.Lion");
			System.out.println("2.Tiger");
			System.out.println("Select your choice ");
			int Da = sc.nextInt();
			switch (Da) {
			case 1 -> System.out.println("You Selected Lion Category");
			case 2 -> System.out.println("You Selected Tiger Category");
			default -> System.out.println("Invalid category");
			}
		}
		default -> System.out.println("Invalid Category");
		}

	}

}
