package Stars;

public class Q14 {
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			if (i < 5) {
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				for (int k = 5; k > i; k--) {
					System.out.print("*");
				}
			}else{
				for (int j =5; j > i-3; j--) {
					System.out.print(" ");
				}
				for (int k = 0; k < i-3; k++) {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}
