package Quiz;

import java.util.Scanner;

public class Q02_Drainage {
	/*
	 * num값을 입력받아 num이 3의 배수이면 "거봐" 5의배수이면 "아하" 3,5의 배수이면 "동시배수"를 출력하는 프로그램을 작성하시오.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("num의 값은 얼마인가? ");
		int num = in.nextInt();
		in.close();
		if (num % 3 == 0) {
			if (num % 5 == 0) {
				System.out.println("동시배수");
			} else {
				System.out.println("거봐");
			}
		} else if (num % 5 == 0) {
			System.out.println("아하");
		} else {
			System.out.println("3과 5의 배수가 아님");
		}
	}
}