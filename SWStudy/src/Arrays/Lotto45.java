package Arrays;

import java.util.Arrays;
// Math.ceil 올림;
// Math.round 반올림
// Math.floor 내림

public class Lotto45 {
	public static void main(String[] args) {
		int[] Lotto = new int[6];
		for (int i = 0; i < 6; i++) {
			Lotto[i] = (int) (((Math.random() * 100) % 45) + 1);
			for (int j = 0; j < i; j++) {
				if (Lotto[i] == Lotto[j]) {
					i--;
				}
			}

		}
		Arrays.sort(Lotto);
		for (int i = 0; i < 6; i++) {
			if (i < 5) {
				System.out.print(Lotto[i] + ",");
			} else {
				System.out.print(Lotto[i]);
			}
		}
	}
}