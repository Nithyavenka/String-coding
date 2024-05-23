package com.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicate {

	public static void main(String[] args) {
		String str = "java programming";
		Set<String> set = new HashSet<>();
		Set<String> duplicate = Arrays.stream(str.split("")).filter(c -> !set.add(c)).collect(Collectors.toSet());
		System.out.println(duplicate);

	}

}
