package Controls;

import java.util.Scanner;

public class Q04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("세 수를 입력하시오");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		if(num1>=num2) {
			if(num1>=num3) {
				if(num2>=num3) {
					System.out.println(num1+","+num2+","+num3);
				}else {
					System.out.println(num1+","+num3+","+num2);
				}
			}else {
				System.out.println(num3+","+num1+","+num2);
			}
		}else if(num2>=num3) {
			if(num3>=num1) {
				System.out.println(num2+","+num3+","+num1);
			}else {
				System.out.println(num2+","+num1+","+num3);
			}
		}else {
			System.out.println(num3+","+num2+","+num1);
		}
	}
}