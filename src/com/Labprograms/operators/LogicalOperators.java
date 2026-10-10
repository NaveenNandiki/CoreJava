package com.Labprograms.operators;

public class LogicalOperators {
	public static void main(String[] args) {
		float a = 10.34f;
		float b = 30.56f;
		System.out.println("using && " + ((a > b) && (b > a)));
		System.out.println("using || " + ((a > b) || (b > a)));
		System.out.println("using ! " + (!(b < a)));
	}

}
