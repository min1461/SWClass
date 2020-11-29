package Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*1문항 답안*/
class Bookstore {
	private String book_name;
	private String book_genre;
	private int book_price;

	/* 2문항 답안 */
	/**
	 * @return the book_name
	 */
	public String getBook_name() {
		return book_name;
	}

	/**
	 * @param book_name the book_name to set
	 */
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	/**
	 * @return the book_genre
	 */
	public String getBook_genre() {
		return book_genre;
	}

	/**
	 * @param book_genre the book_genre to set
	 */
	public void setBook_genre(String book_genre) {
		this.book_genre = book_genre;
	}

	/**
	 * @return the book_price
	 */
	public int getBook_price() {
		return book_price;
	}

	/**
	 * @param book_price the book_price to set
	 */
	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}

	/* 3문항 답안(toString메서드) */
	public Bookstore(String book_name, String book_genre, int book_price) {
		this.book_name = book_name;
		this.book_genre = book_genre;
		this.book_price = book_price;
	}

	public Bookstore() {
	}

	public String toString() {
		return "[책이름]" + book_name + "\t[장르]" + book_genre + "\t가격" + book_price + "원";
	}

}

public class BookstoreClass {
	private static void BookList(ArrayList<Bookstore> arr1) {
		Iterator itr1 = arr1.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

	public static void main(String[] args) {
		Bookstore Wecandoit = new Bookstore("우리는 해낼 수 있다", "자기개발", 12000);
		System.out.println(Wecandoit.toString());

		/* 4문항 답안 */
		Bookstore LittlePrince = new Bookstore();
		LittlePrince.setBook_name("어린왕자");
		LittlePrince.setBook_genre("소설");
		LittlePrince.setBook_price(11000);
		System.out.println(LittlePrince);

		/* 5문항 답안 */
		Bookstore NightStars = new Bookstore("별이 빛나는 밤에", "소설", 10000);
		System.out.println(NightStars);

		/* 6문항 답안 */
		Bookstore TreesWood = new Bookstore("나무와숲", "판타지", 20000);
		Bookstore MyLife = new Bookstore("별이빛나는 밤에", "자서전", 30000);
		Bookstore SleepPrincess = new Bookstore("잠자는 공주", "판타지", 15000);
		Bookstore FoxCrane = new Bookstore("여우와두루미", "자서전", 7000);

		ArrayList<Bookstore> arr1 = new ArrayList<Bookstore>();
		arr1.add(FoxCrane);
		arr1.add(SleepPrincess);
		arr1.add(MyLife);
		arr1.add(TreesWood);
		arr1.add(NightStars);
		arr1.add(LittlePrince);
		arr1.add(Wecandoit);
		BookList(arr1);

		/* 6문항답안+7문항 답안 */
		Scanner in = new Scanner(System.in);
		System.out.println("검색할 장르는 ? :");
		String genre = in.nextLine();
		System.out.println("검색할 가격은 ? :");
		int price = Integer.parseInt(in.next());
		int count = 0;
		for (Bookstore tmp : arr1) {
			if (tmp.getBook_genre().equals(genre) && tmp.getBook_price() >= price) {
				System.out.println(tmp.getBook_name());
				count++;
			}
		}
		System.out.println("검색된 책은  모두 " + count + "권입니다.");
	}

}
