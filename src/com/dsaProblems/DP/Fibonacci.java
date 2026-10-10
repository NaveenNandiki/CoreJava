package com.dsaProblems.DP;

public class Fibonacci {

	// recursion
//	public static int fibonacci(int n) {
//		if (n <= 1)
//			return n;
//		return fibonacci(n - 1) + fibonacci(n - 2);
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int n = 4;
//		System.out.println(fibonacci(n));
//	}

	// DP useing memoization
//	public static int fibonacci(int[] dp, int n) {
//		if (n <= 1)
//			return n;
//		if (dp[n] != 0)
//			return dp[n];
//
//		dp[n] = fibonacci(dp, n - 1) + fibonacci(dp, n - 2);
//		System.out.println(Arrays.toString(dp));
//		return dp[n];
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int n = 2;
//		int[] dp = new int[n + 1];
//		System.out.println(fibonacci(dp, n));
//	}

	// dp using tebulation
//	public static int fibonacci(int[] dp, int n) {
//		dp[1] = 1;
//		for (int i = 2; i <= n; i++) {
//			dp[i] = dp[i - 1] + dp[i - 2];
//		}
//		System.out.println(Arrays.toString(dp));
//		return dp[n];
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int n = 10;
//		int[] dp = new int[n + 1];
//		System.out.println(fibonacci(dp, n));
//	}

	// without Array
	public static void main(String args[]) {
		int n = 5;
		int x = 0;
		int y = 1;
		for (int i = 2; i < n; i++) {
			int temp = x + y;
			x = y;
			y = temp;
		}
		System.out.println(y);
	}

}
