package com.dsaProblems.recursion;

public class GeneratenNumbers {

	static int printnumNto1(int n) {
		if (n == 10)
			return 10;
		System.out.print(printnumNto1(n + 1) + " ");
		return n;
	}

	static int printnum1toN(int n) {
		if (n == 1)
			return 1;
		System.out.print(printnum1toN(n - 1) + " ");
		return n;
	}

	static void ntimes(int n) {
		if (n == 0)
			return;
		System.out.println("Naveen" + n);
		ntimes(n - 1);
	}

	static int sumofNnumbers(int n) {
		if (n == 1)
			return 1;
		return n + sumofNnumbers(n - 1);
	}

	static int factorial(int n) {
		if (n == 1)
			return 1;
		return n * factorial(n - 1);
	}

	static void reverseAnArray(int[] arr, int i, int n) {
		if (i >= n / 2) {
			return;
		}
		arr[i] = arr[i] ^ arr[n - i - 1];
		arr[n - i - 1] = arr[i] ^ arr[n - i - 1];
		arr[i] = arr[i] ^ arr[n - i - 1];
		reverseAnArray(arr, i + 1, n);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(printnumNto1(1));
//		System.out.println(printnum1toN(10));
//		ntimes(10);
//		System.out.println(sumofNnumbers(50));
//		System.out.println(factorial(5));

//		reversse an array
//		int[] arr = { 1, 2, 3, 4, 5 };
//		reverseAnArray(arr, 0, 5);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
	}

}
