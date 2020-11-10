package Quiz;

/*
 * 제과점에서 빵종류와 빵가격을 그리고 빵을 맛있게 먹자 를 실행하는 메소드를 설계하여 운영하려고 한다.
 * 이에대한 OOP를 작성하시오
 * ex)
 * 피자빵 = 2000원
 * 소보루빵 = 1000원
 */
class Bakery_BBang{
	private String Name;
	private int Price;
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return Price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		Price = price;
	}
}

public class Bakery {
	public static void main(String[] args) {

		Bakery_BBang pizza = new Bakery_BBang();
		Bakery_BBang soboro = new Bakery_BBang();

		pizza.setName("피자빵");
		pizza.setPrice(2000);

		soboro.setName("소보로빵");
		soboro.setPrice(1000);

		System.out.println(pizza.getName() + "은 " + pizza.getPrice() + "원이다.");
		System.out.println(soboro.getName() + "은 " + soboro.getPrice() + "원이다.");
	}
}
