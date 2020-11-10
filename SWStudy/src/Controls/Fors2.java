package Controls;

import java.util.Scanner;

public class Fors2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n1");
		int n1 = in.nextInt();
		System.out.print("n2");
		int n2 = in.nextInt();
		System.out.print("n3");
		int n3 = in.nextInt();
		
		int end = n2/n3-n1/n3;		// i의 끝값
		int start = (n1/n3)*n3;
		int num;
		
		for (int i = 0 ; i <= end; i++) {
			num = start+i*n3;
			System.out.println(num);
		}
	}
}
