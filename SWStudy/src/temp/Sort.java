package temp;

import java.util.Arrays;

/*
 * sort : key(기준), 차순(ascending, descending);
 * 내부sort (memory sort) : radix, selection, bubble, insertion, shell;
 * 외부sort : disk (2-way merge sort, k-way)
 */
public class Sort {
	public static void main(String[] args) {
		int[] bae = { 10, 90, 100, 60, 70 };
		for (int i = 0; i < bae.length; i++) {
			System.out.println(bae[i]);
		}

		System.out.println("=====================");
		// * 오름차순
		Arrays.sort(bae);
		for (int i = 0; i < bae.length; i++) {
			System.out.println(bae[i]);
		}
		System.out.println("=====================");
		// * 내림차순
		for (int j = bae.length - 1; j >= 0; j--) {
			System.out.println(bae[j]);
		}

		System.out.println("=====================");
		for (int j = 0; j < bae.length; j++) {
			System.out.println(bae[j]);
		}
	}
}