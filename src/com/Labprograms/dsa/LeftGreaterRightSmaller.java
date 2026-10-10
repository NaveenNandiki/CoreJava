package com.Labprograms.dsa;

public class LeftGreaterRightSmaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 1, 4, 3, 7, 8, 10, 9 };
		int l = 0;
		int r = 0;

		for (int i = 0; i < arr.length; i++) {
			boolean status = true;
			// leftCheck
			l = i - 1;
			while (l >= 0) {
				if (arr[l] > arr[i]) {
					status = false;
//					System.out.println("L<--" + arr[l] + " " + arr[i]);
					break;
				}
				l--;
			}
			r = i + 1;
			while (status && r < arr.length) {
				if (arr[r] < arr[i]) {
					status = false;
//					System.out.println(+arr[i] + " " + arr[r] + "-->r");

					break;
				}
				r++;
			}
//			System.out.println(status + "  " + arr[i]);
			if (status)
				System.out.print(arr[i] + " ");

		}
	}

}
