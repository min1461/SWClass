package Quiz;

import java.util.Scanner;

public class Q12_Family {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("누구차를 탈것인가 ?\n1)부모 \n2)자녀\n");
			int num = in.nextInt();
			
			if (num == 1) {
				Parent p1 = new Parent();
				p1.car();
				break;
			} else if (num == 2) {
				Parent c1 = new Child();
				c1.car();
				break;
			} else {
				System.out.print("다시입력하시오.");
			}
		}
	}
}

class Parent {
	public void car() {
		System.out.print("부모차를 타고 여행가자");
	}
}

class Child extends Parent {
	public void car() {
		System.out.print("자녀차를 타고 여행가자");
	}
}
