package Stars;

public class Q15 {
	public static void main(String[] args) {
		for(int i=0;i<9;i++) {
			if(i<5) {
				for(int j=4;j>i;j--) {
					System.out.print(" ");
				}for(int k=0;k<=i;k++) {
					System.out.print("*");
				}
			}
			else {
				for(int j=5;j<=i;j++) {
					System.out.print(" ");
				}for(int k=9;k>i;k--) {
					System.out.print("*");
				}
			}System.out.println("");
		}
	}
}
