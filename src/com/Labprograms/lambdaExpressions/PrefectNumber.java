package com.Labprograms.lambdaExpressions;

@FunctionalInterface
interface Perfect {
	public void prefectOrNot(int n);
}

public class PrefectNumber {

	public static void main(String args[]) {
		int n = 6;
		Perfect p = (b) -> {

		};
		p.prefectOrNot(n);
	}
}
