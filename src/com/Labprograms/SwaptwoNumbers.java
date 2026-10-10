package com.Labprograms;

public class SwaptwoNumbers {
	public static void main(String args[]) {
		int a = 7;
		int b = 4;
		System.out.println("1st way");
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a: " + a + " b: " + b);

		System.out.println("2nd way");
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("a: " + a + " b: " + b);

		System.out.println("3nd way");
		b = b + a;
		a = b - a;
		b = b - a;
		System.out.println("a: " + a + " b: " + b);

	}

}
