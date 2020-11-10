package Controls;

import java.util.Scanner;

public class DoWhiles {
	public static void main(String[] args) {
//		do {
//			문장들
//		}while(조건);		//	주로 메뉴 만들때 사용
		String menu;
		String str;
		Scanner in = new Scanner(System.in);
		System.out.println("짜장(1)혹은 짬뽕(2)");
		do {
			System.out.println("고르시오");
			menu = in.nextLine();
		} while (!menu.equals("1") && !menu.equals("2"));
		if (menu .equals("1"))	str = "짜장";
		else					str = "짬뽕";
		System.out.println(str + " 맛있게드세요");
	}
}