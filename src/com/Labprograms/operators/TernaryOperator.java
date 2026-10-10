package com.Labprograms.operators;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 90;
		int c = 40;
		int max = (a > b && a > c) ? a : (b > c) ? b : c;
		System.out.println("Max is " + max);

	}

}
