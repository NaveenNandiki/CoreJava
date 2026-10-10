package com.Labprograms.dsa;

public class NonPrimeZigZag {

	static boolean isPrime(int n) {
		if (n <= 0)
			return false;
		if (n == 1)
			return false;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int n = 5;
		int num = 1;
		for (int i = 1; i <= n; i++) {
			int count = i;
			if (count % 2 != 0)
				while (count >= 1) {
					if (!isPrime(num)) {
						System.out.print(num + " ");
						count--;
					}
					num++;
				}
			if (count % 2 == 0) {
				String str = "";
				while (count >= 1) {
					if (!isPrime(num)) {
						str = num + " " + str;
//						System.out.print(num + "");
						count--;
					}
					num++;
				}
				System.out.print(str);
			}
			System.out.println();
		}
	}
}
