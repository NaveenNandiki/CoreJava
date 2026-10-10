package com.Labprograms.dsa;

public class EqilibriumIndex {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
		int l = 0;
		int r = 0;

		for (int i = 1; i < arr.length - 1; i++) {
			int lsum = 0;
			int rsum = 0;
			// leftCheck
			l = i - 1;
//			System.out.println(arr[i]);
			while (l >= 0) {
				lsum = lsum + arr[l];
				l--;

//				System.out.print(lsum + " ");
			}
//			System.out.print("<-- -->");
			r = i + 1;
			while (r < arr.length) {
				rsum = rsum + arr[r];
				r++;
//				System.out.print(rsum + " ");
			}
//			System.out.println(arr[i]);
//			System.out.println(lsum + "<-- --> " + rsum);
			if (lsum == rsum)
				System.out.print(i + " index ");

		}
	}
}
