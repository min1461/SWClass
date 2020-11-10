package Controls;

import java.util.Scanner;

public class Fors {
	public static void main(String[] args) {
		/*
		 * for문(초기값;종료값;증가치)
		 * { 내용 }
		 */
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
	}
}