package com.Labprograms.operators;

public class ShiftOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = -7;
		int n = m++ + -m + ++m;
		System.out.println("n= m++ + -m + ++m : " + n);
		int x = 3;
		int y = 3;// ++(++x);
		// int y = ++(4);
		// int z = y++-- + -y;
		// int a = 10++;
		System.out.println("y=x++ + ++x +x - + -x: " + y);
		// System.out.println("z: " + z);

	}

}
