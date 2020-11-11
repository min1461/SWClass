package Programmers;

import java.util.Arrays;

public class TwoPlus {
	public static void main(String[] args) {
		int[] numbers = { 2, 1, 3, 4, 1 };
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(ssolution(numbers));
		}
	}

	public static int ssolution(int[] numbers) {
		int[] arr = new int[((numbers.length - 1) * numbers.length) / 2];
		int size = 0;
		int[] answer = {};
		int k = 0;
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				arr[k] = numbers[i] + numbers[j];
				k++;
			}
		}
		Arrays.sort(arr);

		for (int i = 1; i < arr.length; i++) {
			if (arr[size] != arr[i]) {
				arr[size + 1] = arr[i];
				size++;
			}
		}
		for (int i = 0; i < answer.length; i++) {
			return arr[i];
		}
	}
}