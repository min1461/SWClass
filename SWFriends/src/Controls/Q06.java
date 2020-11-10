package Controls;

import java.util.Scanner;

public class Q06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("두 수를 입력하시오.");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = num1+num2;
		if (num3%2==0) {
			if(num3%3==0) {
				System.out.println(num1+","+num2);
			}else {
				System.out.println("합은 짝수이나 3의배수가 아님");
			}
		}else {
			System.out.println("합은 짝수가 아님");
		}
	}
}
