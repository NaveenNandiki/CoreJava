package com.Labprograms.java8features.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class MaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		Optional<Integer> max = arr.stream().reduce(Integer::max);
		System.out.println(max.get());
		Optional<Integer> min = arr.stream().reduce(Integer::min);
		System.out.println(min.get());
	}

}
