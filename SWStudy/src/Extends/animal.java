package Extends;

/*
 * 상속(inheritance)
 * 1) 100% 상속
 * 2) 자녀의 재산은 부모와 같거나 많다.
 * 3) 상속의 실제 keyword
 * 		extend = is a kind of
 * 		overriding(상속에서 재정의)
 * 오버라이딩(overriding)
 * 1) 부모클래스와 같은 이름의 메서드 사용
 * 2) 부모클래스의 내용을 자녀클래스에서 재정의
 */
class bird extends animal {
	public void sing() {
		System.out.println("나 노래 잘해!");
	}
}

class fish extends animal {
	public void swim() {
		System.out.println("나 수영 잘해!");
	}
	
	public void move() {		// 오버라이딩
		System.out.println("나 [꼬물꼬물] 잘 움직여!");
	}
}

public class animal {
	public void move() {
		System.out.println("나 잘 움직여!");
	}

	public static void main(String[] args) {
		bird b1 = new bird();
		fish f1 = new fish();
		animal a1 = new animal();
		
		b1.move();
		b1.sing();
		f1.move();
		f1.swim();
		a1.move();
	}
}
