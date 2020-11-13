package Quiz;

import java.util.Scanner;
/*
 * 책이름을 배열에 넣은 후 JAVA책을 모두 검색하는 순차검색 프로그램을 작성하시오.
 * (자바책이 있을 경우 결과)
 * java Programming
 * easy java Programming
 * master of JAVA
 * C Language and java
 * Oracle and Java-JDBC
 * (자바 책이 없을 경우)
 * 검색하신 책은 재고가 없습니다.
 */
class BookList {
	String[] List = { "java Programming", "C# Programming", "easy java Programming", "master of JAVA",
			"C Language and java", "Power Builder", "Oracle and Java-JDBC" };
}

class Find extends BookList {
	public void Find(String a) {
		int sw = 0;
		for (int i = 0; i < List.length; i++) {
			if (List[i].toUpperCase().indexOf(a) >= 0) {
				sw++;
				System.out.println(List[i]);
			}
			if (sw == 0) {
				System.out.println("선택하신 재고가 없습니다.");
			}
		}
	}
}

public class Q13_SortBook {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("검색어를 입력하시오 : ");
		String str = in.nextLine();
		Find f1 = new Find();
		f1.Find(str.toUpperCase());
	}
}
