package Quiz;

import java.util.Scanner;

/*
 * String Lists = "coffee:big:1500:jongro"; 이 있을때
 * Cafe Class를 사용하여 getter/setter 및 toString()등을 작성한 후, toString() 출력시 다음과 같이 출력하도록 프로그램을 작성하시오
 * (단, 커피명 : 사이즈 : 가격 : 지점 을 의미하며, cafe1클래스의 필드는 앞의 4개를 만들어 사용한다.)
 */
class Cafe {
	private String name;
	private String size;
	private int price;
	private String point;

	public Cafe(String name, String size, int price, String point) {
		super();
		this.name = name;
		this.size = size;
		this.price = price;
		this.point = point;
	}

	public Cafe() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPoint() {
		return point;
	}

	public void setPoint(String point) {
		this.point = point;
	}

	public String toString() {
		return name + "의 사이즈가 " + size + "인 경우, " + "가격은 " + price + "원이며 " + point + "지점에서 판매합니다.";
	}
}

public class Q10_Split {
	public static void main(String[] args) {
//		String s1 = "Coffee:Big:1500:jongro";
//		String s1 = "Coffee.Big.1500.jongro";
		String s1 = "Coffee**Big**1500**jongro";
		
		Cafe menu = new Cafe();
		String[] arr = s1.split("\\*\\*");	// [.]  & \\.    -> 정규표현식
		/*
		 * c:\\t\\n
		 * c:/t/n				정규표현식
		 * @"c:\t\n"
		 */
		menu.setName(arr[0]);
		menu.setSize(arr[1]);
		menu.setPrice(Integer.valueOf(arr[2]));
		menu.setPoint(arr[3]);

		System.out.println(menu);
	}
}
