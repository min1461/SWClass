package Controls;

import java.util.Scanner;

public class Q02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		if (num%2==0) {
			System.out.println(num+"은 짝수입니다.");
		}else {
			System.out.println(num+"은 홀수입니다.");
		}
	}
}
