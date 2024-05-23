package com.practice;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyChar {

	public static void main(String[] args) {
		String inputString = "java concept of the day";
		
		Map<Character, Long> count = inputString.chars()
				.mapToObj(c -> (char) c)
		.collect((Collectors.groupingBy(Function.identity(),Collectors.counting())));
		System.out.println(count);

	}

}
