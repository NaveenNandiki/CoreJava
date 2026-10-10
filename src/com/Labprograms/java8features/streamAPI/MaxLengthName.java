package com.Labprograms.java8features.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxLengthName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>(Arrays.asList("naveen", "Jayanth", "naveen Kumar", "ManiKanta"));

		List<String> rs = names.stream().filter(s -> s.length() > 6).collect(Collectors.toList());
		rs.forEach(str -> System.out.print(str + ":"));
		System.out.println();
		names.stream().filter(s -> s.length() > 6).forEach(str -> System.out.print(str + " : "));

	}

}
