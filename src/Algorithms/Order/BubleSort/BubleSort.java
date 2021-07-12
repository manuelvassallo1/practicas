package Algorithms.Order.BubleSort;

import java.util.Arrays;

public class BubleSort {
	public static int[] arr = {2, 5, 4, 1, 8, 7, 6, 9, 3, 0};

	public static void main(String[] args) {
		System.out.println("Original: " + Arrays.toString(arr));

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
		System.out.println("Usando Buble Sort: " + Arrays.toString(arr));

		int[] arr2 = arr;
		Arrays.sort(arr2);
		System.out.println("Usando Arrays.sort: " + Arrays.toString(arr2));
	}
}
