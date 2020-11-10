package Controls;

import java.util.Scanner;

public class Q09 {
	/*
	 * 배달도시락을 주문하는데 10개까지는 개당 2500원이고, 10개를 초과하는 양에 대해서는 2400원이다.
	 * 배달도시락의 개수를 입력받아서 금액을 계산하는 프로그램을 작성하여라.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("배달도시락 주문 갯수 : ");
		int order = in.nextInt();
		int orderprice = 2500;
		int dcorderprice = 2400;
		int totalprice;
		if(order<=10) {
			totalprice=order*orderprice;
			System.out.println("비용은 " + totalprice + "입니다.");
		}else {
			totalprice = order*dcorderprice;
			System.out.println("비용은 " + totalprice + "입니다.");
		}
	}
}