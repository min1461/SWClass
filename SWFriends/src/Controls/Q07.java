package Controls;

import java.util.Scanner;

public class Q07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("수를 입력받으시오.");
		int num = in.nextInt();
		if (num % 3 == 0) {
			if (num % 5 == 0) {
				System.out.println(num + "은 3의 배수이면서 5의 배수이다.");
			}/* else {
				System.out.println(num + "은 3의 배수이다.");
			}
		}else {
			System.out.println("3의 배수가 아니다.");*/
		}
	}
}