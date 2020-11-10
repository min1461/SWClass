package Quiz;

import java.util.Scanner;

public class Q03_if {
	/*
	 * 1-100사이의 정수를 입력받아 50이상이 들어왔으면 "50보다 커"를 출력하시오.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("1-100사이의 정수를 입력하시오 : ");
		int num = in.nextInt();
		in.close();
		if(num>=50) {
			System.out.println("50보다 크다");
		}
	}
}