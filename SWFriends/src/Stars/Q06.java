package Stars;
	/*
	 * 12345
	 * 23456
	 * 34567
	 * 45678
	 * 56789
	 */
public class Q06 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(i+(j+1));
			}
			System.out.println("");
		}
	}
}