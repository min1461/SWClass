package Controls;

import java.util.Scanner;

public class Q05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("두수를 입력받으시오");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		if (num1>=num2) {
			if(num1%2==0) {
				System.out.println(num1+"은 짝수입니다.");
			}else {
				System.out.println(num1+"은 짝수가 아닙니다.");
			}
		}else {
			if(num2%2==0) {
				System.out.println(num2+"은 짝수입니다.");
			}else {
				System.out.println(num2+"은 짝수가 아닙니다.");
			}
		}
	}
}
