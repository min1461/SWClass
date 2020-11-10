package Switchs;

import java.util.Scanner;

public class Switchs {
	public static void main(String[] args) {
		/*
		 * Switch(조건){
		 * 	case 1: (break;)
		 * 	case 2: break;
		 * 	default: (break;)
		 * }
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("점수를 입력받으시오.");
		int score = in.nextInt();
		switch(score/5) {
		case 20:
		case 19:
			System.out.print("A+학점");
			break;
		case 18:
			System.out.print("A학점");
			break;
		case 17:
			System.out.print("B+학점");
			break;
		case 16:
			System.out.print("B학점");
			break;
		case 15:
			System.out.print("C+학점");
			break;
		case 14:
			System.out.print("C학점");
			break;
		case 13:
			System.out.print("D+학점");
			break;
		case 12:
			System.out.print("D학점");
			break;
		default:
			System.out.print("F학점");
			break;
		}
	}
}
