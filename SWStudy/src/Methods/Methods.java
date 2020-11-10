package Methods;

import java.util.Scanner;

public class Methods {
	/*
	 * method 호출문 / method 정의문 으로 구성되어있다. 1형식 2형식 3형식
	 */

	/*
	 * 윤년인지 평년인지 메소드를 활용해서 구하기
	 */

	private static String LeapYears(int years) {
		String str = "윤년이다.";
		String str2 = "윤년이 아니다.";
			
		if (years % 4 == 0) {
			if (years % 100 == 0 && years % 400 != 0) {
				return str2;
			} else {
				return str;
			}
		} else {
			return str;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("년도를 입력하시오");
		int years = in.nextInt();
		in.close();
//		String str = LeapYears(years);
//		System.out.println(years+"는 "+str);
		 System.out.println(years+"는 "+LeapYears(years));
	}
}
