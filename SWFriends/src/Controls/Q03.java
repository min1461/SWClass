package Controls;

import java.util.Scanner;

public class Q03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("두 수를 입력하시오");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		if(num1>num2) {
			System.out.println(num1);
		}else if(num2==num1){
			System.out.println("두수는 같다.");
		}else {
			System.out.println(num2);
		}
	}
}
