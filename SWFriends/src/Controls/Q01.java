package Controls;

import java.util.Scanner;

public class Q01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		if(num%3==0) {
			System.out.println(num);
		}
	}
}
