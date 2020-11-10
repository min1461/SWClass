package LeapYears;

import java.util.Scanner;

public class LeapYears {
	public static void main(String[] args) {
		/*
		 * i의 해가 윤년인가?
		 * 윤년은 4년마다,400년마다 2월이 29일까지이고, 100년마다 28일까지이다.
		 * i의 해를 입력받아 윤년인지 아닌지 파악하시오.
		 */
		Scanner in = new Scanner(System.in);
		System.out.print("해를 입력하시오 : ");
		int years = in.nextInt();

		if (years % 4 == 0) {
			if (years % 100 == 0 && years % 400 != 0) {
				System.out.print("윤년이 아니다.");
			} else {
				System.out.print("윤년이다.");
			}
		} else {
			System.out.print("윤년이다.");
		}
	}
}