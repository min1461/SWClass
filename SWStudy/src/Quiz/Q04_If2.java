package Quiz;

import java.util.Scanner;

public class Q04_If2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("100을 몇으로 나눌것인가? : ");
		int num = in.nextInt();
		int i = 100;
		System.out.print("100은 ");
		if (i % num == 0) {
			System.out.println(num + "의배수이다");
		} else {
			System.out.println(num + "의배수가 아니다");
		}
	}
}