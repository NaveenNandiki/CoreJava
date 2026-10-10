package com.dsaProblems.recursion;

public class JumpsFrog {

	public static int abs(int a, int b) {
		if (a > b) {
			return a - b;
		}
		return b - a;
	}

	public static int minjumps(int n, int[] arr) {
		if (n == 0)
			return 0;
		int l = minjumps(n - 1, arr) + abs(arr[n], arr[n - 1]);
		int r = Integer.MAX_VALUE;
		if (n > 1) {
			r = minjumps(n - 2, arr) + abs(arr[n], arr[n - 2]);
		}
		return Math.min(l, r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 30, 10, 60, 10, 60, 50 };
		System.out.println(minjumps(arr.length - 1, arr));
	}

}
