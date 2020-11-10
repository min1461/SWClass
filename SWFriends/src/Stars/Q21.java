package Stars;

public class Q21 {
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			if (i < 5) {
				for (int j = 0; j <= i; j++) {
					System.out.print(" ");
				}
				for (int k = 0; k < 9 - (2 * i); k++) {
					System.out.print("*");
				}
				for (int l = 0; l <= i; l++) {
					System.out.print(" ");
				}
			} else {
				for (int j = 0; j < 9 - i; j++) {
					System.out.print(" ");
				}
				for (int k = 0; k < 3 + (i - 5) * 2; k++) {
					System.out.print("*");
				}
				for (int l = 0; l < 9 - i; l++) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
