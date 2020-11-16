package Exception;

import java.util.Scanner;

public class Try___2 {
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);

			System.out.print("첫번째수는 : ");
			int num1 = Integer.parseInt(in.nextLine());
			System.out.print("두번째수는 : ");
			int num2 = Integer.parseInt(in.nextLine());
			System.out.println(num1 / num2);

		} catch (NumberFormatException e) {
			System.out.println("숫자로 입력하시오.");
		} catch (ArithmeticException e) {
			System.out.println("0이 아닌 숫자로 입력하시오.");
		} catch (Exception e) {
			System.out.println("다른 예외 처리");
			System.out.println(e);
			System.out.println(e.getMessage());
		} finally { // 생략가능
			System.out.print("산술 연산 문제 해결");
		}
	}
}