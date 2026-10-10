package com.dsaProblems.strings;

import java.util.Scanner;

public class CharacterOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		System.out.println("Enter a Target Character");
		char target = sc.next().charAt(0);
		int count = 0;
		for (char ch : str.toCharArray()) {// here take extra space for charArray[] //to over come use charAt();
			if (ch == target)
				count++;
		}
		System.out.println("Target character Occur in Given String in " + count + " times");
	}

}
