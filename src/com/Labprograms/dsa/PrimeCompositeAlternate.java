package com.Labprograms.dsa;

public class PrimeCompositeAlternate {

	static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {

			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 4, 2, 5, 9, 12 };
		int[] res = new int[nums.length];
		int i = 0;
		for (int n : nums) {
			if (isPrime(n)) {
//				int temp = n;
				while (isPrime(n)) {
					n++;
				}
				res[i++] = n;
			} else {
//				int temp = n;
				while (!isPrime(n)) {
					n++;
				}
				res[i++] = n;
			}
		}
		for (int n : res) {
			System.out.print(n + " ");
		}
	}

}
