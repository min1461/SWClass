package Switchs;

import java.util.Scanner;

public class Switchs2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("월을 입력받으시오.");
		int month = in.nextInt();
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.print(month+"월은 31일까지 있습니다.");
			break;
		case 2:
			System.out.print(month+"월은 29일까지 있습니다.");
			break;
		default :
			System.out.print(month+"월은 30일까지 있습니다.");
			break;
		}
	}
}
