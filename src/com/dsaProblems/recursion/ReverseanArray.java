package com.dsaProblems.recursion;

public class ReverseanArray {

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
		// reversse an array
		int[] arr = { 9, 11, 6, 8, 5 };
		reverseAnArray(arr, 0, 5);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
