package com.Labprograms.java8features.streamAPI;

import java.util.HashMap;
import java.util.Map;

public class PrintElementsInHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> emps = new HashMap<>();
		emps.put(101, "Naveen");
		emps.put(102, "Jayanth");
		emps.put(103, "Mani");
		emps.put(104, "Guru");
		emps.entrySet().stream().forEach(ele -> System.out.println(ele.getKey() + " = " + ele.getValue()));

	}

}
