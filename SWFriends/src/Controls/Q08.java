package Controls;

import java.util.Scanner;

public class Q08 {
	/*
	 * 유원지에서 말을 태워주는데 처음 30분의 기본요금은 1인당 3000원이다.
	 * 이후에는 10분당 500원씩의 추가 요금을 받는다.
	 * 말을 탄 시간을 입력 받아서 전체 금액을 계산하는 프로그램을 작성하여라.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("말을 탄 시간 : ");
		int playtime = in.nextInt();
		int basictime = 30;
		int basicprice = 3000;
		double addtime = 10;
		int addprice = 500;
		int totalprice;
		if (playtime <= 30) {
			totalprice = basicprice;
			System.out.println("이용금액은 " + totalprice + "입니다.");
		}else{
			totalprice = (((int) (Math.ceil((playtime-basictime)/addtime))*addprice) + basicprice);
			System.out.println("이용금액은 " + totalprice + "입니다.");
		}
	}
}
