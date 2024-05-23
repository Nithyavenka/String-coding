package com.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(20, 45, 77, 12, 33);
		int secondLargest = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(secondLargest);

	}

}
