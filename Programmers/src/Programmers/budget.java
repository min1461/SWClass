package Programmers;

import java.util.Arrays;
import java.util.Collections;

public class budget {
	public static int solution(int[] d, int budget) {
		int answer = 0;
		Integer[] arr2 = Arrays.stream(d).boxed().toArray(Integer[]::new);
		Arrays.sort(arr2, Collections.reverseOrder());
		for (int i = 0; i < d.length; i++) {
			if (budget >= d[i]) {
				budget -= d[i];
				answer++;
			} else {
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] d = { 1, 3, 2, 5, 4 };
		int budget = 9;
		System.out.println(solution(d, budget));
	}
}
