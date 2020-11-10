package Stars;

public class Q11 {
	public static void main(String[] args) {
		for(int i = 0; i<5;i++) {
			for(int j = 5; j>i+1;j--) {
				System.out.print(" ");
			}
			for(int k = 0; k<=i;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
