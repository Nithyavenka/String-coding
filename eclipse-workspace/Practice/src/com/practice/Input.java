package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println(Arrays.toString(arr));

	}

}
