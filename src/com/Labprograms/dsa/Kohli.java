package com.Labprograms.dsa;

public class Kohli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "KOHLI";
		char ch = 'A';
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if (i == j || i + j == str.length() - 1) {
					System.out.print(str.charAt(i) + " ");
				} else {
					System.out.print(ch++ + " ");
				}

			}
			System.out.println();
		}
	}

}
