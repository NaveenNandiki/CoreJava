package com.Labprograms.classes;

import java.util.Arrays;

public class Vcube {
	static int process(int[] a, int i) {
		if (i >= a.length)
			return 0;
		int x = a[a[a[i]]];
		a[i] = a[a[a[i]]];
		return x + process(a, a[i++]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 2, 4, 1, 3, 0 };
		// System.out.println(process(a, 0));

		int x = 4, y = 7, z = 3;
		x += ++y - z--;
		y = x++ + --z - --y;
		z += --x + y++ - ++z;
		System.out.println(x + " " + y + " " + z);
//
//		int[] a1 = { 2, 4, 6, 8 };
//		int i = 0;
//		a1[i]++;
//		++a1[i++];
//		a1[i] += a1[i - 1]++;
//		System.out.println(a1[0] + " " + a1[1] + " " + a1[2] + " " + a1[3] + " ");
		////		System.out.println(Arrays.toString());

		int[] a2 = { 5, 10, 15, 20 };
		int i = 3;
		a2[i]--;
		a2[--i]++;
		a2[i--] = --a2[i];
		System.out.println(Arrays.toString(a2));
	}

}
