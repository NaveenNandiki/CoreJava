package com.Labprograms;

import java.util.Scanner;

public class TicketPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ticket Prices Available");
		System.out.println("G-Gold");
		System.out.println("P-Platinum");
		System.out.println("V-VIP");
		System.out.println("Enter yout Choice");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		ch = Character.toUpperCase(ch);
		switch (ch) {
		case 'G' -> System.out.println("Price 150");
		case 'P' -> System.out.println("Price 250");
		case 'V' -> System.out.println("Price 400");
		default -> System.out.println("Invalid");
		}

	}

}
