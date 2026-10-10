package com.Labprograms.logicalStatements;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSotedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr size of array1");
		int n1 = sc.nextInt();
		int arr1[] = new int[n1];
		System.out.println("Enter array 1 aelements");
		for (int i = 0; i < n1; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter size of array2");
		int n2 = sc.nextInt();
		int[] arr2 = new int[n2];
		System.out.println("Enter array 2 aelements");
		for (int i = 0; i < n2; i++) {
			arr2[i] = sc.nextInt();
		}
		int i = 0;
		int j = 0;
		int index = 0;
		int[] res = new int[n1 + n2];
		while (i < n1 && j < n2) {
			if (arr1[i] < arr2[j]) {
				res[index++] = arr1[i];
				i++;
			} else {
				res[index++] = arr2[j];
				j++;

			}

		}
		while (i < n1) {
			res[index++] = arr1[i++];
		}
		while (j < n2) {
			res[index++] = arr2[j++];
		}

		System.out.println(Arrays.toString(res));
	}

}
