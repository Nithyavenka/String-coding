package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {

	public static void main(String[] args) {
		// int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][3];
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = sc.nextInt();
			}
		}
//		for (int row = 0; row < arr.length; row++) {
//			for (int col = 0; col < arr[row].length; col++) {
//				System.out.println(arr[row][col] + " ");
//			}
//			System.out.println();
//		}
		for (int row = 0; row < arr.length; row++) {
			System.out.println(Arrays.toString(arr[row]));
		}
	}

}
