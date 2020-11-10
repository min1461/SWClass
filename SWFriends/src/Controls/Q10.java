package Controls;

import java.util.Scanner;

public class Q10 {
	/*
	 * 디스켓 1통에 5000원한다. 그런데 10통 이상 사면 전체 금액의 10%를 할인하여 준다.
	 * 그리고 100통이상 사면 전체금액의 12%를 할인하여 준다. x통의 디스켓을 사려면 얼마가 있어야 하는가 ?
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("사려는 디스켓의 수량 : ");
		int count = in.nextInt();
		int price = 5000;
		double count10 = price*0.9;
		double count100 = price*0.88;
		int totalprice;
		if(count<10) {
			totalprice = count*price;
			System.out.println("가격은 " + totalprice +"원이다.");
		}else if(count<100){
			totalprice = (int)(count*count10);
			System.out.println("가격은 " + totalprice +"원이다.");
		}else {
			totalprice = (int)(count*count100);
			System.out.println("가격은 " + totalprice +"원이다.");
		}
	}
}
