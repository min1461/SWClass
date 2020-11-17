package Collections_FrameWork;

import java.util.ArrayList;
import java.util.Date;

/*
 * sangpum, price 필드가 있는 SMarket 클래스를 추가로 만드시오
 * 단, 생성자 2개, toString()도 만드시오.
 * 
 * (toString()으로 출력시 결과)
 * 상품이름은 우유이고, 상품가격은 1000원입니다.
 * 상품이름은 빵이고 상품 가격은 2000원입니다 ,
 * 
 * linked list
 */
class SMarket {
	private String sangpum;
	private int price;

	/**
	 * @return the sangpum
	 */
	public String getSangpum() {
		return sangpum;
	}

	/**
	 * @param sangpum the sangpum to set
	 */
	public void setSangpum(String sangpum) {
		this.sangpum = sangpum;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	public SMarket(String sangpum, int price) {
		super();
		this.sangpum = sangpum;
		this.price = price;
	}

	public SMarket() {
		super();
	}

	public String toString() {
		return "상품이름은 " + sangpum + "이고, 상품 가격은 " + price + "원 입니다.";
	}
}

public class linkedlist {
	public static void main(String[] args) {
//		Date d1 = new Date();
//		SMarket bread = new SMarket("빵",2000);

//		System.out.println(milk);
//		System.out.println(bread);

		ArrayList<SMarket> arr3 = new ArrayList<SMarket>();
//		arr3.add(d1);
		arr3.add(new SMarket("우유", 1000)); // 객체생성을 간단하게 함 (인스턴스명은 없고 대신 arr3.get()로 불러올수있다)
		arr3.add(new SMarket("빵", 2000));
		arr3.add(new SMarket("사과", 3000));
		arr3.add(new SMarket("배", 4000));
		arr3.add(new SMarket("과자", 500));

		for (int i = 0; i < arr3.size(); i++) {
			if (arr3.get(i).getPrice() <= 2000) {
				System.out.println(arr3.get(i).getPrice());
			}
		}
	}
}