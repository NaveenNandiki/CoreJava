package com.dsaProblems.strings;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfEvenPositionString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String[] str = sc.nextLine().split(" ");
//		String s1 = "";
		StringBuilder s1 = new StringBuilder("");
		int count = 0;
		for (String s : str) {
			count++;
			if ((count & 1) == 0) {
				// s1 += s + " ";// this is not optimized
				// s1.append(s + " ");//not better
				s1.append(s).append(" ");
			}

		}
		System.out.println(Arrays.toString(s1.toString().split(" ")));

	}

}
