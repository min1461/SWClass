package Methods;

import java.util.Scanner;

public class Q01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int[] asd = new int[k];
		for(int i=0; i<k; i++){
			asd[i]=2*i;
			System.out.println(asd[i]);
		}
	}
}
